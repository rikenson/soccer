package com.usd.soccer.paramResolver;

import static com.usd.soccer.utils.Constants.*;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import com.usd.soccer.domain.payload.reponse.TeamResponse;

import java.time.LocalDateTime;

public class TeamResponseParameterResolver implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
            throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == TeamResponse.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
            throws ParameterResolutionException {
        var createUpdateDateTime = LocalDateTime.now();
        return TeamResponse.builder()
                .uuid(UUID_VALUE)
                .name(TEAM_NAME)
                .name(TEAM_DESCRIPTION)
                .mascot(TEAM_MASCOT)
                .status(TEAM_STATUS)
                .createdByUser(CREATE_BY_USER)
                .modifiedByUser(MODIFIED_BY_USER)
                .version(VERSION)
                .createdAt(createUpdateDateTime)
                .modifiedAt(createUpdateDateTime)
                .build();
    }
}

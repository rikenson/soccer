package com.usd.soccer.paramResolver;

import com.usd.soccer.domain.payload.request.TeamRequest;
import org.junit.jupiter.api.extension.*;


import static com.usd.soccer.utils.Constants.*;


public class TeamRequestParameterResolver implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
            throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == TeamRequest.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
            throws ParameterResolutionException {

        return TeamRequest.builder()
                .name(TEAM_NAME)
                .description(TEAM_DESCRIPTION)
                .mascot(TEAM_MASCOT)
                .status(TEAM_STATUS)
                .build();
    }
}

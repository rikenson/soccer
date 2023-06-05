package com.usd.soccer.mapper;

import com.usd.soccer.domain.entity.TeamEntity;
import com.usd.soccer.domain.payload.reponse.TeamResponse;
import com.usd.soccer.domain.payload.request.TeamRequest;
import org.springframework.stereotype.Component;

@Component
public class CustomMapper {

    public TeamEntity toTeamEntity(TeamRequest request) {
        return TeamEntity.builder()
                .name(request.getName())
                .description(request.getDescription())
                .mascot(request.getMascot())
                .status(request.getStatus())
                .build();
    }
    public TeamResponse toTeamResponse(TeamEntity entity) {
        return TeamResponse.builder()
                .uuid(entity.getUuid())
                .name(entity.getName())
                .description(entity.getDescription())
                .mascot(entity.getMascot())
                .players(entity.getPlayers())
                .createdAt(entity.getCreatedAt())
                .modifiedAt(entity.getModifiedAt())
                .createdByUser(entity.getCreatedByUser())
                .modifiedByUser(entity.getModifiedByUser())
                .build();
    }
}

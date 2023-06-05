package com.usd.soccer.domain.payload.reponse;

import com.usd.soccer.domain.entity.PlayerEntity;
import com.usd.soccer.domain.generic.TeamPayload;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @MappedSuperclass @SuperBuilder
public class TeamResponse extends TeamPayload {
    private Set<PlayerEntity> players = new HashSet<>();
}

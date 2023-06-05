package com.usd.soccer.domain.payload.reponse;

import com.usd.soccer.domain.generic.PlayerPayload;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @MappedSuperclass
public class PlayerResponse extends PlayerPayload {
    private Set<PlayerResponse> players = new HashSet<>();
}

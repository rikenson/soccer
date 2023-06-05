package com.usd.soccer.domain.generic;

import com.usd.soccer.domain.enums.TeamStatus;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @MappedSuperclass @SuperBuilder
public abstract class TeamPayload extends BaseEntity{
    protected String name;
    protected String description;
    protected String mascot;
    private TeamStatus status;
}

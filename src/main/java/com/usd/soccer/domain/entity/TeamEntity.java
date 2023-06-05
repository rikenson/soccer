package com.usd.soccer.domain.entity;

import com.usd.soccer.domain.enums.TeamStatus;
import com.usd.soccer.domain.generic.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "Team")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @SuperBuilder
public class TeamEntity extends BaseEntity {
    private String name;
    private String description;
    private String mascot;
    private TeamStatus status;
    @OneToMany(cascade = CascadeType.DETACH)
    private Set<PlayerEntity> players = new HashSet<>();
}

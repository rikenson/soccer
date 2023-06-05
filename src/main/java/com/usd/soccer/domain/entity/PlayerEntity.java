package com.usd.soccer.domain.entity;

import com.usd.soccer.domain.enums.Gender;
import com.usd.soccer.domain.enums.PlayerPosition;
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
@Table(name = "Player")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @SuperBuilder
public class PlayerEntity extends BaseEntity {
    private String firstname;
    private String lastname;
    private String photo;
    private Gender status;
    private PlayerPosition position;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<CharacteristicsEntity> characteristics = new HashSet<>();
}

package com.usd.soccer.domain.entity;

import com.usd.soccer.domain.generic.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "Characteristic")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @SuperBuilder
public class CharacteristicsEntity extends BaseEntity {
    protected String name;
    protected Double percentage;

}

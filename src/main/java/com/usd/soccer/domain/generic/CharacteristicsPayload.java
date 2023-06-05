package com.usd.soccer.domain.generic;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @MappedSuperclass
public class CharacteristicsPayload extends BaseEntity{
    protected String name;
    protected Double percentage;

}

package com.usd.soccer.domain.generic;

import com.usd.soccer.domain.enums.Gender;
import com.usd.soccer.domain.enums.PlayerPosition;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @MappedSuperclass
public abstract class PlayerPayload extends BaseEntity{
    protected String firstname;
    protected String lastname;
    protected String photo;
    protected Gender status;
    protected PlayerPosition position;
}

package com.usd.soccer.repository;

import com.usd.soccer.domain.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayRepository extends JpaRepository<PlayerEntity, UUID> {
}

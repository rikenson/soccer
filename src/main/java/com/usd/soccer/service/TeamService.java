package com.usd.soccer.service;

import com.usd.soccer.domain.payload.reponse.TeamResponse;
import com.usd.soccer.domain.payload.request.TeamRequest;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface TeamService {

    TeamResponse add(TeamRequest request);

    TeamResponse edit(TeamRequest request, UUID uuid);

    TeamResponse retrieve(UUID uuid);

    Page<TeamResponse> retrieveAll();

    void remove(UUID uuid);
}

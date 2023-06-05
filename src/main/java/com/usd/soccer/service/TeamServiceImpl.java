package com.usd.soccer.service;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.usd.soccer.domain.payload.reponse.TeamResponse;
import com.usd.soccer.domain.payload.request.TeamRequest;
import com.usd.soccer.mapper.CustomMapper;
import com.usd.soccer.repository.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final CustomMapper mapper;

    public TeamServiceImpl(TeamRepository teamRepository, CustomMapper mapper) {
        this.teamRepository = teamRepository;
        this.mapper = mapper;
    }

    @Override
    public TeamResponse add(TeamRequest request) {
        var team = mapper.toTeamEntity(request);
        var saved = this.teamRepository.save(team);
        return mapper.toTeamResponse(saved);
    }

    @Override
    public TeamResponse edit(TeamRequest request, UUID uuid) {
        return null;
    }

    @Override
    public TeamResponse retrieve(UUID uuid) {
        return null;
    }

    @Override
    public Page<TeamResponse> retrieveAll() {
        return null;
    }

    @Override
    public void remove(UUID uuid) {
      // TODO document why this method is empty
    }
}

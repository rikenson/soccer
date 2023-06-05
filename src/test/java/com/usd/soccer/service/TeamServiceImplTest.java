package com.usd.soccer.service;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.usd.soccer.domain.entity.TeamEntity;
import com.usd.soccer.domain.payload.reponse.TeamResponse;
import com.usd.soccer.domain.payload.request.TeamRequest;
import com.usd.soccer.mapper.CustomMapper;
import com.usd.soccer.paramResolver.TeamRequestParameterResolver;
import com.usd.soccer.paramResolver.TeamResponseParameterResolver;
import com.usd.soccer.repository.TeamRepository;

@ExtendWith({MockitoExtension.class, TeamRequestParameterResolver.class, TeamResponseParameterResolver.class})
@Execution(ExecutionMode.CONCURRENT)
class TeamServiceImplTest {
    @Mock
    TeamRepository teamRepository;
    @Mock
    CustomMapper customMapper;
    @Mock
    TeamEntity teamEntity;

    @InjectMocks
    private TeamServiceImpl teamService;


    @BeforeEach
    public void setUp() {
        teamEntity = mock(TeamEntity.class);
    }


    @Test
    @DisplayName("Should create new Team when TeamRequest is given")
    void addNewTeamSuccessfully(TeamRequest teamRequest, TeamResponse teamResponse) {

        var ignoreFields = new String[]{"id", "createdAt", "modifiedAt", "createdByUser", "modifiedByUser"};

        when(customMapper.toTeamEntity(teamRequest)).thenReturn(teamEntity);
        when(teamRepository.save(teamEntity)).thenReturn(teamEntity);
        when(customMapper.toTeamResponse(teamEntity)).thenReturn(teamResponse);

        var underTest = teamService.add(teamRequest);
        verify(customMapper, times(1)).toTeamEntity(teamRequest);
        verify(teamRepository, times(1)).save(teamEntity);
        verify(customMapper, times(1)).toTeamResponse(teamEntity);

        assertThat(underTest)
                .usingRecursiveComparison()
                .ignoringFields(ignoreFields)
                .isEqualTo(teamResponse);
    }

}
package com.usd.soccer.controller;

import static com.usd.soccer.utils.Constant.*;

import com.usd.soccer.domain.payload.reponse.TeamResponse;
import com.usd.soccer.domain.payload.request.TeamRequest;
import com.usd.soccer.service.TeamService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping(TEAM_BASE_URI)
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<TeamResponse> teamPost(@RequestBody @Validated TeamRequest request) {
        return new ResponseEntity<>(teamService.add(request), HttpStatus.CREATED);
    }

    @PutMapping("{uuid}")
    public ResponseEntity<TeamResponse> teamEdit(
            @RequestBody @Validated TeamRequest request,
            @PathVariable("uuid") UUID uuid) {
        return ResponseEntity.ok(teamService.edit(request, uuid));
    }

    @GetMapping("{uuid}")
    public ResponseEntity<TeamResponse> teamRetrieve(@PathVariable("uuid") UUID uuid) {
        return ResponseEntity.ok(teamService.retrieve(uuid));
    }

    @GetMapping
    public ResponseEntity<Page<TeamResponse>> teamRetrieveAll() {
        return ResponseEntity.ok(teamService.retrieveAll());
    }

    @DeleteMapping("{uuid}")
    public ResponseEntity<Void> remove(@PathVariable("uuid") UUID uuid) {
        teamService.remove(uuid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

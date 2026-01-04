package com.abdilhakim.Examensarbete.controller;

import com.abdilhakim.Examensarbete.model.Match;
import com.abdilhakim.Examensarbete.model.Team;
import com.abdilhakim.Examensarbete.repository.MatchRepository;
import com.abdilhakim.Examensarbete.repository.TeamRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {

    private final MatchRepository matchRepository;
    private final TeamRepository teamRepository;

    public MatchController(MatchRepository matchRepository, TeamRepository teamRepository) {
        this.matchRepository = matchRepository;
        this.teamRepository = teamRepository;
    }

    @GetMapping
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    @PostMapping
    public Match createMatch(@RequestBody Match match) {

        // Hämta lag från databasen
        Team homeTeam = teamRepository.findById(match.getHomeTeam().getId())
                .orElseThrow(() -> new RuntimeException("Home team not found"));

        Team awayTeam = teamRepository.findById(match.getAwayTeam().getId())
                .orElseThrow(() -> new RuntimeException("Away team not found"));

        // För att samma lag ska inte spela mot sig själv
        if (homeTeam.getId().equals(awayTeam.getId())) {
            throw new RuntimeException("A team cannot play against itself");
        }

        match.setHomeTeam(homeTeam);
        match.setAwayTeam(awayTeam);

        return matchRepository.save(match);
    }
}

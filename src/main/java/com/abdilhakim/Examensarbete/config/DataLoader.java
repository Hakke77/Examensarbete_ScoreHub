package com.abdilhakim.Examensarbete.config;

import com.abdilhakim.Examensarbete.model.Match;
import com.abdilhakim.Examensarbete.model.Team;
import com.abdilhakim.Examensarbete.repository.MatchRepository;
import com.abdilhakim.Examensarbete.repository.TeamRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataLoader {

    private final TeamRepository teamRepository;
    private final MatchRepository matchRepository;

    public DataLoader(TeamRepository teamRepository, MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
    }

    @PostConstruct
    public void load() {

        if (teamRepository.count() == 0) {
            // Skapa och spara lag
           Team arsenal = teamRepository.save(new Team(null, "Arsenal"));
           Team liverpool = teamRepository.save(new Team(null, "Liverpool"));
           Team manCity = teamRepository.save(new Team(null, "Manchester City"));
           Team chelsea = teamRepository.save(new Team(null, "Chelsea"));
           Team tottenham = teamRepository.save(new Team(null, "Tottenham"));
           Team manUnited = teamRepository.save(new Team(null, "Manchester United"));
           Team leicester = teamRepository.save(new Team(null, "Leicester"));
           Team everton = teamRepository.save(new Team(null, "Everton"));
           Team westHam = teamRepository.save(new Team(null, "West Ham"));
           Team astonVilla = teamRepository.save(new Team(null, "Aston Villa"));


            // Skapa exempelmatcher
            matchRepository.save(new Match(null, LocalDateTime.now().minusDays(1), 2, 1, arsenal, liverpool));
            matchRepository.save(new Match(null, LocalDateTime.now().minusDays(2), 3, 2, manCity, chelsea));
            matchRepository.save(new Match(null, LocalDateTime.now().minusDays(3), 1, 1, tottenham, manUnited));
        }
    }
}


package com.abdilhakim.Examensarbete.config;

import com.abdilhakim.Examensarbete.model.Team;
import com.abdilhakim.Examensarbete.repository.TeamRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    private final TeamRepository teamRepository;

    public DataLoader(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @PostConstruct
    public void load() {

        if (teamRepository.count() == 0) {
            teamRepository.save(new Team(null, "Arsenal"));
            teamRepository.save(new Team(null, "Liverpool"));
            teamRepository.save(new Team(null, "Manchester City"));
            teamRepository.save(new Team(null, "Chelsea"));
            teamRepository.save(new Team(null, "Tottenham"));
            teamRepository.save(new Team(null, "Manchester United"));
            teamRepository.save(new Team(null, "Leicester"));
            teamRepository.save(new Team(null, "Everton"));
            teamRepository.save(new Team(null, "West Ham"));
            teamRepository.save(new Team(null, "Aston Villa"));
        }
    }
}


package com.abdilhakim.Examensarbete.service;


import com.abdilhakim.Examensarbete.model.Team;
import com.abdilhakim.Examensarbete.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    public Optional<Team> findById(Long id) {
        return teamRepository.findById(id);
    }

    public Team save(Team team) {
        return teamRepository.save(team);
    }

    public Team update(Long id, Team updated) {
        return teamRepository.findById(id).map(team -> {
            team.setName(updated.getName());
            // lägg till fler fält här vid behov
            return teamRepository.save(team);
        }).orElseGet(() -> {
            updated.setId(id);
            return teamRepository.save(updated);
        });
    }

    public void deleteById(Long id) {
        teamRepository.deleteById(id);
    }
}

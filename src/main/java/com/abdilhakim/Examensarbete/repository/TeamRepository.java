package com.abdilhakim.Examensarbete.repository;

import com.abdilhakim.Examensarbete.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}

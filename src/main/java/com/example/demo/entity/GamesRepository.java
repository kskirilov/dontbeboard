package com.example.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GamesRepository extends JpaRepository<Games,Long> {

    @Query("SELECT g FROM Games g WHERE g.gameName = ?1")
    Optional<Games> findGameByName(String gameName);

}

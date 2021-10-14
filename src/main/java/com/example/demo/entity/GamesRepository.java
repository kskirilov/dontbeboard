package com.example.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GamesRepository extends JpaRepository<Games,Long> {

    @Query("SELECT g FROM Games g WHERE g.gameName LIKE ?1")
    Optional<Games> findGameByName(String gameName);

    //this wouldn't be an issue if I pass it parameters because then it will filter according to those params?
        //finish the course on DBs
        //learn how to build query params and refactor website
    @Query("SELECT g FROM Games g WHERE g.minPlayers<=?1 AND g.maxPlayers>=?1 AND g.avgDuration<=?2 AND g.gameKind LIKE %?3% AND g.gameMood LIKE %?4% AND g.ageGroup LIKE %?5%")
    List<Games> findGames(int playerCount, int avgDuration, String gameKind, String gameMood, String ageGroup);
    //if the filter is 0 or 'all', then you don't have a filter/you want to take the whole column
    /*
    CASE 1:
    [playerCount][avgDuration][gameKind][gameMood][ageGroup]
    [     2     ][     30    ][  board ][   fun  ][  teens ]

    CASE 2:
    [playerCount][avgDuration][gameKind][gameMood][ageGroup]
    [     2     ][     30    ][  all   ][   all  ][  teens ]


    CASE
        WHEN playerCount=0 THEN ()



     */

    //Research: Path Variables, Hibernate
    //Research: Derived Queries to get that back


    //Filter by time: SELECT GAMES WHERE input <= avgDuration
    //Filter by gameMood: SELECT GAMES WHERE input == gameMood
    //Filter by gameKind: SELECT GAMES WHERE input == gameKind
    //Filter by ageGroup: SELECT GAMES WHERE input == ageGroup
}

package com.example.demo.games;

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

    //    @Query(nativeQuery = true, value="SELECT g FROM Games g WHERE g.min_players<=?1 AND g.max_players>=?1 AND g.avg_duration<=?2 AND CASE WHEN g.game_kind='all' THEN g.game_kind LIKE '%board%' OR g.game_kind LIKE '%cards%' OR g.game_kind LIKE '%noEquipment%' OR g.game_kind LIKE '%videoGame%' OR g.game_kind LIKE '%penAndPaper%' ELSE g.game_kind LIKE '%?3%' END; AND CASE WHEN g.game_mood='all' THEN g.game_mood LIKE '%fun%' OR g.game_mood LIKE '%competitive%' OR g.game_mood LIKE '%drinking%' OR g.game_mood LIKE '%physicalActivity%' ELSE g.game_mood LIKE '%?3%' END; AND CASE WHEN g.age_group='all' THEN g.age_group LIKE '%board%' OR g.age_group LIKE '%cards%' OR g.age_group LIKE '%noEquipment%' OR g.age_group LIKE '%videoGame%' OR g.age_group LIKE '%penAndPaper%' ELSE g.age_group LIKE '%?3%' END;")
    @Query(nativeQuery = true, value = "SELECT * FROM games " +
            "WHERE min_players<= ?1 " +
            "AND max_players>=?1 " +
            "AND avg_duration<=?2 " +
            "AND CASE WHEN ?3='all' THEN game_kind = 'board' OR game_kind = 'cards' OR game_kind LIKE 'noEquipment' OR game_kind LIKE 'videoGame' OR game_kind LIKE 'physical' OR game_kind LIKE 'penAndPaper' ELSE game_kind = ?3 END " +
            "AND CASE WHEN ?4='all' THEN game_mood = 'fun' OR game_mood LIKE 'competitive' OR game_mood='drinking' OR game_mood = 'strategy' ELSE game_mood = ?4 END " +
            "AND CASE WHEN ?5='all' THEN age_group = 'kids' OR age_group LIKE 'adult' OR age_group LIKE 'teens' OR age_group LIKE 'family' OR age_group LIKE 'all' ELSE age_group = ?5 END ")
                    // when teens='all' then (...) else age_group LIKE
    List<Games> findGames(int playerCount, int avgDuration, String gameKind, String gameMood, String ageGroup);
}


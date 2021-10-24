package com.example.demo.suggestions;
import com.example.demo.suggestions.GameSuggestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameSuggestionsRepository extends JpaRepository<GameSuggestions,Long> {

    @Query("SELECT g FROM GameSuggestions g WHERE g.gameName LIKE ?1")
    Optional<GameSuggestions> findGameByName(String gameName);

}


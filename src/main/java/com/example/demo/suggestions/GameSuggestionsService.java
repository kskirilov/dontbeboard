package com.example.demo.suggestions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameSuggestionsService {

    private final GameSuggestionsRepository suggestionsRepository;

    @Autowired
    public GameSuggestionsService(GameSuggestionsRepository suggestionsRepository) {
        this.suggestionsRepository = suggestionsRepository;
    }

    public void addNewGame(GameSuggestions games) {
        Optional<GameSuggestions> gameByName = suggestionsRepository.findGameByName(games.getGameName());
        if(gameByName.isPresent()){
            throw new IllegalStateException("game name already exists");
        }
        suggestionsRepository.save(games);
        System.out.println(games);
    }
}

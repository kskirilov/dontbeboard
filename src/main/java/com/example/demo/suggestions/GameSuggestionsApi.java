package com.example.demo.suggestions;


import com.example.demo.games.Games;
import com.example.demo.games.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/suggestions")
public class GameSuggestionsApi {

    private final GameSuggestionsService suggestionsService;

    @Autowired
    public GameSuggestionsApi(GameSuggestionsService suggestionsService) {
        this.suggestionsService = suggestionsService;
    }

    @PostMapping
    public void addNewGame(@RequestBody GameSuggestions games){
        suggestionsService.addNewGame(games);
    }

}

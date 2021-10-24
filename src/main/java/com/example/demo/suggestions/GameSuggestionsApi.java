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

    @GetMapping
    public List<GameSuggestions> findGames(@RequestParam(required = false, defaultValue="2") int playerCount,
                                 @RequestParam(required = false, defaultValue="60") int avgDuration,
                                 @RequestParam(required = false, defaultValue="all") String gameKind,
                                 @RequestParam(required = false, defaultValue="all") String gameMood,
                                 @RequestParam(required = false, defaultValue="all") String ageGroup) {
        return suggestionsService.findGames(playerCount, avgDuration, gameKind, gameMood, ageGroup);
    }

    @PostMapping
    public void addNewGame(@RequestBody GameSuggestions games){
        suggestionsService.addNewGame(games);
    }

    @DeleteMapping(path="{gameId}")
    public void deleteGameById(@PathVariable("gameId") Long id){
        suggestionsService.deleteGame(id);
    }
}

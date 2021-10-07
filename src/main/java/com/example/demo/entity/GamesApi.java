package com.example.demo.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/games")
public class GamesApi {

    private final GamesService gamesService;

    @Autowired
    public GamesApi(GamesService gamesService) {
        this.gamesService = gamesService;
    }

    @GetMapping
    public List<Games> getGames(){
        return gamesService.getGames();

    }

    @PostMapping
    public void addNewGame(@RequestBody Games games){
        gamesService.addNewGame(games);
    }

    @DeleteMapping(path="{gameId}")
    public void deleteGameById(@PathVariable("gameId") Long id){
        gamesService.deleteGame(id);
    }
}

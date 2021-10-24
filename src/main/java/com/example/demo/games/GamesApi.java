package com.example.demo.games;


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

//    @GetMapping
//    public List<Games> getGames(){
//        return gamesService.getGames();
//    }

//    @GetMapping
//    public Games getGameByName(String gameName){
//        return gamesService.getGameByName(gameName);
//    }

    //allows us to handle template variables in the request URI mapping and set them as method parameters
    //example: localhost:8080/api/games/4/3
//    @GetMapping(path="{playerCount}/{avgDuration}/{gameKind}/{gameMood}/{ageGroup}") //this is the request we will receive from the frontend
//    @ResponseBody
//    public List<Games> getGamesByPlayersAndDuration(@PathVariable int playerCount, @PathVariable int avgDuration, @PathVariable String gameKind, @PathVariable String gameMood, @PathVariable String ageGroup) {
//        return gamesService.filterGame(playerCount, avgDuration, gameKind, gameMood, ageGroup); // 4/30/'penAndPaper'/'fun'/'all'
//    }
    //@RequestParams

    @GetMapping
    public List<Games> findGames(@RequestParam(required = false, defaultValue="3") int playerCount,
                                 @RequestParam(required = false, defaultValue="500") int avgDuration,
                                 @RequestParam(required = false, defaultValue="all") String gameKind,
                                 @RequestParam(required = false, defaultValue="all") String gameMood,
                                 @RequestParam(required = false, defaultValue="all") String ageGroup) {
        return gamesService.findGames(playerCount, avgDuration, gameKind, gameMood, ageGroup);
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

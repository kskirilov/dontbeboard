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
    public List<Games> findGames(@RequestParam(required = false, defaultValue="2") int playerCount,
                                 @RequestParam(required = false, defaultValue="60") int avgDuration,
                                 @RequestParam(required = false, defaultValue="all") String gameKind,
                                 @RequestParam(required = false, defaultValue="all") String gameMood,
                                 @RequestParam(required = false, defaultValue="all") String ageGroup) {
        return gamesService.findGames(playerCount, avgDuration, gameKind, gameMood, ageGroup);
    }

    //get all homes in London
    /*https://www.airbnb.co.uk/s/London/homes
                                        ?tab_id=home_tab
                                        &refinement_paths%5B%5D=%2Fhomes
                                        &flexible_trip_dates%5B%5D=november
                                        &flexible_trip_dates%5B%5D=october
                                        &flexible_trip_lengths%5B%5D=weekend_trip
                                        &date_picker_type=calendar
                                        &query=London
                                        &place_id=ChIJdd4hrwug2EcRmSrV3Vo6llI
                                        &checkin=2021-11-18
                                        &checkout=2021-11-20
                                        &adults=2
                                        &source=structured_search_input_header
                                        &search_type=filter_change
                                        &price_max=500
                                        &room_types%5B%5D=Private%20room
*/

    @PostMapping
    public void addNewGame(@RequestBody Games games){
        gamesService.addNewGame(games);
    }

    @DeleteMapping(path="{gameId}")
    public void deleteGameById(@PathVariable("gameId") Long id){
        gamesService.deleteGame(id);
    }
}

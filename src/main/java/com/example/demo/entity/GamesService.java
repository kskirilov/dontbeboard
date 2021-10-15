package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamesService {

    private final GamesRepository gamesRepository;

    @Autowired
    public GamesService(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }

//    public List<Games> getGames(){
//        return gamesRepository.findAll();
//    }

//    public List<Games> findGames(int player_count, int avg_duration, String game_kind, String game_mood, String age_group){
//        return gamesRepository.findGames(player_count, avg_duration, game_kind, game_mood, age_group);
//    }

    public Games getGameByName(String gameName){
        return gamesRepository.findGameByName(gameName).get();
    }

    public void addNewGame(Games games) {
        Optional<Games> gameByName = gamesRepository.findGameByName(games.getGameName());
        if(gameByName.isPresent()){
            throw new IllegalStateException("game name already exists");
        }
        gamesRepository.save(games);
        System.out.println(games);
    }

    public List<Games> findGames(int playerCount, int avgDuration, String gameKind, String gameMood, String ageGroup){

        return gamesRepository.findGames(playerCount, avgDuration, gameKind, gameMood, ageGroup);
    }

    public void deleteGame(Long id) {
        boolean exists = gamesRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Game with id "+ id + " doesn't exist!");
        }
        gamesRepository.deleteById(id);
    }

}

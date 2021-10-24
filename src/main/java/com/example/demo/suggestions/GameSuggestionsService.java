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

    public GameSuggestions getGameByName(String gameName){
        return suggestionsRepository.findGameByName(gameName).get();
    }

    public void addNewGame(GameSuggestions games) {
        Optional<GameSuggestions> gameByName = suggestionsRepository.findGameByName(games.getGameName());
        if(gameByName.isPresent()){
            throw new IllegalStateException("game name already exists");
        }
        suggestionsRepository.save(games);
        System.out.println(games);
    }

    public List<GameSuggestions> findGames(int playerCount, int avgDuration, String gameKind, String gameMood, String ageGroup){

        return suggestionsRepository.findGames(playerCount, avgDuration, gameKind, gameMood, ageGroup);
    }

    public void deleteGame(Long id) {
        boolean exists = suggestionsRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Game with id "+ id + " doesn't exist!");
        }
        suggestionsRepository.deleteById(id);
    }

}

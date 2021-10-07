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

    public List<Games> getGames(){
        return gamesRepository.findAll();
    }


    public void addNewGame(Games games) {
        Optional<Games> gameByName = gamesRepository.findGameByName(games.getGameName());
        if(gameByName.isPresent()){
            throw new IllegalStateException("game name already exists");
        }
        gamesRepository.save(games);
        System.out.println(games);
    }

    public void deleteGame(Long id) {
        boolean exists = gamesRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Game with id "+ id + " doesn't exist!");
        }
        gamesRepository.deleteById(id);
    }
}

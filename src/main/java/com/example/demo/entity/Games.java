package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="games")
public class Games {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String gameName;
    private String gamePhoto;
    private String gameDescription;
    private String gameRules;
    private LocalDate releaseDate;
    private Integer minPlayers;
    private Integer maxPlayers;
    private Integer avgDuration;
    private String gameKind;
    private String gameMood;
    private String ageGroup;

    public Games() {
    }

    public Games(String gameName, String gamePhoto, String gameDescription, String gameRules, LocalDate releaseDate, Integer minPlayers, Integer maxPlayers, Integer avgDuration, String gameKind, String gameMood, String ageGroup) {
        this.gameName = gameName;
        this.gamePhoto = gamePhoto;
        this.gameDescription = gameDescription;
        this.gameRules = gameRules;
        this.releaseDate = releaseDate;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.avgDuration = avgDuration;
        this.gameKind = gameKind;
        this.gameMood = gameMood;
        this.ageGroup = ageGroup;
    }

    public Games(Long id, String gameName, String gamePhoto, String gameDescription, String gameRules, LocalDate releaseDate, Integer minPlayers, Integer maxPlayers, Integer avgDuration, String gameKind, String gameMood, String ageGroup) {
        this.id = id;
        this.gameName = gameName;
        this.gamePhoto = gamePhoto;
        this.gameDescription = gameDescription;
        this.gameRules = gameRules;
        this.releaseDate = releaseDate;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.avgDuration = avgDuration;
        this.gameKind = gameKind;
        this.gameMood = gameMood;
        this.ageGroup = ageGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGamePhoto() {
        return gamePhoto;
    }

    public void setGamePhoto(String gamePhoto) {
        this.gamePhoto = gamePhoto;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public String getGameRules() {
        return gameRules;
    }

    public void setGameRules(String gameRules) {
        this.gameRules = gameRules;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(Integer minPlayers) {
        this.minPlayers = minPlayers;
    }

    public Integer getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(Integer maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public Integer getAvgDuration() {
        return avgDuration;
    }

    public void setAvgDuration(Integer avgDuration) {
        this.avgDuration = avgDuration;
    }

    public String getGameKind() {
        return gameKind;
    }

    public void setGameKind(String gameKind) {
        this.gameKind = gameKind;
    }

    public String getGameMood() {
        return gameMood;
    }

    public void setGameMood(String gameMood) {
        this.gameMood = gameMood;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
}


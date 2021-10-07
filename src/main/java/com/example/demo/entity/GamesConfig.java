package com.example.demo.entity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class GamesConfig {

    @Bean
    CommandLineRunner commandLineRunner(GamesRepository repository){
      return args -> {
          Games hangman = new Games(
                  "Hangman",
                  "https://image.shutterstock.com/image-illustration/illustration-hangman-game-260nw-386156509.jpg",
                  "One player chooses a word and the rest have a minimum of 6 attempts to guess it",
                  "1. Player 1 pick a word 2. Remaining players make a letter guess. If the letter is correct the player has to add it to the words else it is considered a wrong attempt",
                  LocalDate.of(1650, JANUARY, 1),
                  2,
                  6,
                  15,
                  "penAndPaper",
                  "fun",
                  "all"
          );
          Games uno = new Games(
                  "UNO",
                  "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.nintendo.com%2Fgames%2Fdetail%2Funo-switch%2F&psig=AOvVaw3Ap08n6-oVPxY7xTcpiGrZ&ust=1633703211716000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKDypPHAuPMCFQAAAAAdAAAAABAK",
                  "This is a description for the game UNO",
                  "Those are the rules for the game UNO",
                  LocalDate.of(1971, JANUARY, 1),
                  2,
                  10,
                  60,
                  "cards",
                  "fun",
                  "all"
          );
          repository.saveAll(
                  List.of(hangman, uno)
          );
      };
    }

}

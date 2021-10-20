//package com.example.demo.entity;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import static java.time.Month.JANUARY;
//
//@Configuration
//public class GamesConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(GamesRepository repository){
//      return args -> {
//          Games hangman = new Games(
//                  "Hangman",
//                  "https://image.shutterstock.com/image-illustration/illustration-hangman-game-260nw-386156509.jpg",
//                  "One player chooses a word and the rest have a minimum of 6 attempts to guess it",
//                  "1. Player 1 pick a word 2. Remaining players make a letter guess. If the letter is correct the player has to add it to the words else it is considered a wrong attempt",
//                  LocalDate.of(1650, JANUARY, 1),
//                  2,
//                  6,
//                  15,
//                  "noEquipment",
//                  "fun",
//                  "all"
//          );
//          Games uno = new Games(
//                  "UNO",
//                  "https://cdn2.unrealengine.com/Diesel%2Fproductv2%2Funo%2Fhome%2FGameName_Store_Landscape_2560x1440-2560x1440-5195e8a3e06d672f97a1ee49ecea59027c14cae4.jpg",
//                  "This is a description for the game UNO",
//                  "Those are the rules for the game UNO",
//                  LocalDate.of(1971, JANUARY, 1),
//                  2,
//                  10,
//                  60,
//                  "cards",
//                  "fun",
//                  "all"
//          );
////          Ring of fire
//          Games ringOfFire = new Games( //3
//                  "Ring of Fire",
//                  "https://images-na.ssl-images-amazon.com/images/I/81kyPttdL7L._SL1500_.jpg",
//                  "A glass is in the middle of a circle of cards called the 'ring of fire'. Players take turns drawing a card from the deck, taking care not to break the circle. If you break the circle, you have to drink. For every card you drawer, there is a specific rule",
//                  "check website",
//                  LocalDate.of(1967, JANUARY, 1),
//                  2,
//                  12,
//                  30,
//                  "cards",
//                  "drinking",
//                  "adult"
//          );
//          Games jenga = new Games(
//                  "Jenga",
//                  "https://www.thetoyshop.com/medias/091876-Primary-515Wx515H?context=bWFzdGVyfGltYWdlc3w2MTI0NHxpbWFnZS9qcGVnfGltYWdlcy9oNzYvaGRkLzkxNDE4NzYzOTE5NjYuanBnfDgxN2E3MTJiNDlmZWJjZDRmN2I1ODE1YTY1NjZjOTQ3N2Y2YjJhZjMwOTRkNjBmYTA2YzAwYTMyYTA3NDg1Njc",
//                  "Players take turns to remove a block from a tower and balance it on top, creating a taller and increasingly unstable structure as the game progresses.",
//                  "Take one block on a turn from any level of the tower (except the one below and on the top level), and placing it on the top to complete it. The game ends when the tower falls!",
//                  LocalDate.of(1971, JANUARY, 1),
//                  2,
//                  6,
//                  20,
//                  "board",
//                  "strategy",
//                  "all"
//          );
//          //CardsAgainstHumanity
//          Games cardsAgainstHumanity = new Games(
//                  "Cards Against Humanity",
//                  "https://static.onecms.io/wp-content/uploads/sites/28/2019/11/cards-against-humanity-CAHRESTAURANT1119.jpg",
//                  "Match your cards with another players to make funny jokes and scenarios!",
//                  "** Check the official game website for detailed description **  (https://www.cardsagainsthumanity.com/)",
//                  LocalDate.of(1971, JANUARY, 1),
//                  3,
//                  6,
//                  60,
//                  "cards",
//                  "drinking",
//                  "adult"
//          );
//          //          Twister
//          Games twister = new Games(
//                  "Twister",
//                  "https://i.pinimg.com/originals/39/a3/93/39a39362d5d48024f60c7549f0014559.jpg",
//                  "Outmaneuver your opponent in placing hands and feet oh colored circles as directed by the spinner.",
//                  "check website",
//                  LocalDate.of(1971, JANUARY, 1),
//                  2,
//                  4,
//                  60,
//                  "physical",
//                  "fun",
//                  "all"
//          );
//          //          What do you meme
//          Games whatDoYouMeme = new Games(
//                  "What Do You Meme?",
//                  "https://cdn.prezzybox.com/Images/81806.jpg",
//                  "Create the funniest meme by pairing Caption Cards with the Photo Card with other players. A rotating judge picks the funniest combo each round.",
//                  "** Check the official game website for detailed description **  (https://whatdoyoumeme.com/)",
//                  LocalDate.of(1971, JANUARY, 1),
//                  2,
//                  6,
//                  60,
//                  "cards",
//                  "fun",
//                  "all"
//          );
//          //          21
//          Games twentyOne = new Games(
//                  "21 (Twenty-One)",
//                  "https://bookstr.com/wp-content/uploads/2019/03/Screen-Shot-2019-03-14-at-17.18.04.jpg",
//                  "21 is a counting game where players need to count from 1 to 21. The player who calls out “21” must drink before the next round starts! ",
//                  "No rules, Just drink at 21!",
//                  LocalDate.of(1971, JANUARY, 1),
//                  2,
//                  10,
//                  60,
//                  "cards",
//                  "drinking",
//                  "adult"
//          );
//          //          The Pretender
//          Games thePretender = new Games(
//                  "The Pretender",
//                  "https://winthedraw.co.uk/wp-content/uploads/2020/02/Pretender-Card-Game.jpg",
//                  "A fun game of charades you have to act out from the prompt on the cards! ",
//                  "**Check the official game website for detailed description **  (https://gamelygames.com/the-pretender-1)",
//                  LocalDate.of(1971, JANUARY, 1),
//                  4,
//                  8,
//                  20,
//                  "cards",
//                  "fun",
//                  "all"
//          );
//          //TheMind
//          Games theMind = new Games(
//                  "The Mind",
//                  "https://play-lh.googleusercontent.com/qblnvGSO0ydni1j2_SuEobwWm0YYiBjSNdGvF-adE2JzyKKx2yd07rXUlyEI9m5wEpU",
//                  "Players must guess what number is on each others cards and place them down in ascending order... without speaking to each other. All about the mind waves",
//                  "** Check the official game website for detailed description **  (https://boardgamegeek.com/boardgame/244992/mind)",
//                  LocalDate.of(1971, JANUARY, 1),
//                  2,
//                  4,
//                  15,
//                  "cards",
//                  "fun",
//                  "all"
//          );
//          repository.saveAll(
//                  List.of(hangman, uno, ringOfFire, jenga, cardsAgainstHumanity, twister, whatDoYouMeme, twentyOne, theMind, thePretender)
//          );
//      };
//    }
//
//}

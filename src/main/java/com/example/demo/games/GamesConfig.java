package com.example.demo.games;
import org.aspectj.weaver.World;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

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
                  "noEquipment",
                   false,
                   "fun",
                  "all",
                  0.00);

          Games uno = new Games(
                  "UNO",
                  "https://cdn2.unrealengine.com/Diesel%2Fproductv2%2Funo%2Fhome%2FGameName_Store_Landscape_2560x1440-2560x1440-5195e8a3e06d672f97a1ee49ecea59027c14cae4.jpg",
                  "This is a description for the game UNO",
                  "Those are the rules for the game UNO",
                  LocalDate.of(1971, JANUARY, 1),
                  2,
                  10,
                  60,
                  "cards",
                  false,
                  "fun",
                  "all",
                  4.75);
//          Ring of fire
          Games ringOfFire = new Games( //3
                  "Ring of Fire",
                  "https://images-na.ssl-images-amazon.com/images/I/81kyPttdL7L._SL1500_.jpg",
                  "A glass is in the middle of a circle of cards called the 'ring of fire'. Players take turns drawing a card from the deck, taking care not to break the circle. If you break the circle, you have to drink. For every card you drawer, there is a specific rule",
                  "check website",
                  LocalDate.of(1967, JANUARY, 1),
                  2,
                  12,
                  30,
                  "cards",
                  true,
                  "drinking",
                  "adult",
                  2.00);

          Games jenga = new Games(
                  "Jenga",
                  "https://www.thetoyshop.com/medias/091876-Primary-515Wx515H?context=bWFzdGVyfGltYWdlc3w2MTI0NHxpbWFnZS9qcGVnfGltYWdlcy9oNzYvaGRkLzkxNDE4NzYzOTE5NjYuanBnfDgxN2E3MTJiNDlmZWJjZDRmN2I1ODE1YTY1NjZjOTQ3N2Y2YjJhZjMwOTRkNjBmYTA2YzAwYTMyYTA3NDg1Njc",
                  "Players take turns to remove a block from a tower and balance it on top, creating a taller and increasingly unstable structure as the game progresses.",
                  "Take one block on a turn from any level of the tower (except the one below and on the top level), and placing it on the top to complete it. The game ends when the tower falls!",
                  LocalDate.of(1971, JANUARY, 1),
                  2,
                  6,
                  20,
                  "board",
                  false,
                  "strategy",
                  "all",
                  11.99);
          //CardsAgainstHumanity
          Games cardsAgainstHumanity = new Games(
                  "Cards Against Humanity",
                  "https://static.onecms.io/wp-content/uploads/sites/28/2019/11/cards-against-humanity-CAHRESTAURANT1119.jpg",
                  "Match your cards with another players to make funny jokes and scenarios!",
                  "** Check the official game website for detailed description **  (https://www.cardsagainsthumanity.com/)",
                  LocalDate.of(1971, JANUARY, 1),
                  3,
                  6,
                  60,
                  "cards",
                  false,
                  "drinking",
                  "adult",
                  24.99);
          //          Twister
          Games twister = new Games(
                  "Twister",
                  "https://i.pinimg.com/originals/39/a3/93/39a39362d5d48024f60c7549f0014559.jpg",
                  "Outmaneuver your opponent in placing hands and feet oh colored circles as directed by the spinner.",
                  "check website",
                  LocalDate.of(1971, JANUARY, 1),
                  2,
                  4,
                  60,
                  "board",
                  false,
                  "fun",
                  "all",
                  13.99);
          //          What do you meme
          Games whatDoYouMeme = new Games(
                  "What Do You Meme?",
                  "https://cdn.prezzybox.com/Images/81806.jpg",
                  "Create the funniest meme by pairing Caption Cards with the Photo Card with other players. A rotating judge picks the funniest combo each round.",
                  "** Check the official game website for detailed description **  (https://whatdoyoumeme.com/)",
                  LocalDate.of(1971, JANUARY, 1),
                  2,
                  6,
                  60,
                  "cards",
                  false,
                  "fun",
                  "all",
                  29.99);
          //          21
          Games twentyOne = new Games(
                  "21 (Twenty-One)",
                  "https://bookstr.com/wp-content/uploads/2019/03/Screen-Shot-2019-03-14-at-17.18.04.jpg",
                  "21 is a counting game where players need to count from 1 to 21. The player who calls out “21” must drink before the next round starts! ",
                  "No rules, Just drink at 21!",
                  LocalDate.of(1971, JANUARY, 1),
                  2,
                  10,
                  60,
                  "noEquipment",
                  false,
                  "drinking",
                  "adult",
                  0.00);
          //          The Pretender
          Games thePretender = new Games(
                  "The Pretender",
                  "https://winthedraw.co.uk/wp-content/uploads/2020/02/Pretender-Card-Game.jpg",
                  "A fun game of charades you have to act out from the prompt on the cards! ",
                  "**Check the official game website for detailed description **  (https://gamelygames.com/the-pretender-1)",
                  LocalDate.of(1971, JANUARY, 1),
                  4,
                  8,
                  20,
                  "cards",
                  false,
                  "fun",
                  "all",
                  12.99);
          //TheMind
          Games theMind = new Games(
                  "The Mind",
                  "https://play-lh.googleusercontent.com/qblnvGSO0ydni1j2_SuEobwWm0YYiBjSNdGvF-adE2JzyKKx2yd07rXUlyEI9m5wEpU",
                  "Players must guess what number is on each others cards and place them down in ascending order... without speaking to each other. All about the mind waves",
                  "** Check the official game website for detailed description **  (https://boardgamegeek.com/boardgame/244992/mind)",
                  LocalDate.of(1971, JANUARY, 1),
                  2,
                  4,
                  15,
                  "cards",
                  false,
                  "fun",
                  "all",
                  9.99);

          //Chess
          Games chess = new Games(
                  "Chess",
                  "https://images.ctfassets.net/3s5io6mnxfqz/wfAz3zUBbrcf1eSMLZi8u/c03ac28c778813bd72373644ee8b8b02/AdobeStock_364059453.jpeg?fm=jpg&w=900&fl=progressive",
                  "Chess is a board game played between two players. It is sometimes called Western chess, or international chess to distinguish it from related games such as xiangqi. The current form of the game emerged in Southern Europe during the second half of the 15th century after evolving from similar, much older games of Indian and Persian origin. Today, chess is one of the world's most popular games, played by millions of people worldwide.",
                  "** Check the Wikipedia rules for detailed rules information **  (https://en.wikipedia.org/wiki/Chess#Rules)",
                  LocalDate.of(640, JANUARY, 1),
                  2,
                  2,
                  40,
                  "board",
                  false,
                  "strategy",
                  "all",
                  9.89);

          //monopoly
          Games monopoly = new Games(
                  "Monopoly",
                  "https://m.media-amazon.com/images/I/81oC5pYhh2L._AC_SL1500_.jpg",
                  "Monopoly is a multi-player economics-themed board game. In the game, players roll two dice to move around the game board, buying and trading properties, and developing them with houses and hotels. Players collect rent from their opponents, with the goal being to drive them into bankruptcy. Money can also be gained or lost through Chance and Community Chest cards, and tax squares. Players receive a stipend every time they pass \"Go\", and can end up in jail, from which they cannot move until they have met one of three conditions. The game has numerous house rules, and hundreds of different editions exist, as well as many spin-offs and related media. Monopoly has become a part of international popular culture, having been licensed locally in more than 103 countries and printed in more than 37 languages.",
                  "** Check the Wikipedia rules for detailed rules information **  (https://en.wikipedia.org/wiki/Monopoly_(game)#Rules)",
                  LocalDate.of(1935, JANUARY, 1),
                  2,
                  5,
                  150,
                  "board",
                  false,
                  "strategy",
                  "all",
                  9.89);
          // YuGiOh
          Games yuGiOh = new Games(
                  "Yu-Gi-Oh",
                  "https://www.licensingmagazine.com/wp-content/uploads/2020/02/card_game_yugioh.jpg",
                  "The Yu-Gi-Oh! Trading Card Game is a Japanese collectible card game developed and published by Konami. It is based on the fictional game of Duel Monsters created by manga artist Kazuki Takahashi, which appears in portions of the manga franchise Yu-Gi-Oh! (under the name of 'Magic and Wizards'), and is the central plot device throughout its various anime adaptations and spinoff series. The trading card game was launched by Konami in 1999 in Japan and March 2002 in North America.[3] It was named the top selling trading card game in the world by Guinness World Records on July 7, 2009, having sold over 22 billion cards worldwide.",
                  "** Check the Wikipedia rules for detailed rules information **  (https://en.wikipedia.org/wiki/Yu-Gi-Oh!_Trading_Card_Game#Gameplay)",
                  LocalDate.of(1999, JANUARY, 1),
                  2,
                  4,
                  30,
                  "cards",
                  false,
                  "strategy",
                  "all",
                  9.89);
          // pandemic
          Games pandemic = new Games(
                  "Pandemic",
                  "https://upload.wikimedia.org/wikipedia/en/3/36/Pandemic_game.jpg",
                  "Pandemic is a cooperative board game designed by Matt Leacock and first published by Z-Man Games in the United States in 2008.[1] Pandemic is based on the premise that four diseases have broken out in the world, each threatening to wipe out a region. The game accommodates two to four players, each playing one of seven possible roles: dispatcher, medic, scientist, researcher, operations expert, contingency planner, or quarantine specialist. Through the combined effort of all the players, the goal is to discover all four cures before any of several game-losing conditions are reached.",
                  "** Check the Wikipedia rules for detailed rules information **  (https://en.wikipedia.org/wiki/Pandemic_(board_game)#Gameplay)",
                  LocalDate.of(2008, JANUARY, 1),
                  2,
                  4,
                  60,
                  "board",
                  false,
                  "strategy",
                  "all",
                  24.95);
          // explodingKittens
          Games explodingKittens = new Games(
                  "Exploding Kittens",
                  "https://m.media-amazon.com/images/I/510RZPoe1BS._AC_SY450_.jpg",
                  "Exploding Kittens is a card game designed by Elan Lee, Matthew Inman from the comics site The Oatmeal, and Shane Small. Originally proposed as a Kickstarter project seeking US$10,000 in crowdfunding, it exceeded the goal in eight minutes[1] and on January 27, 2015, seven days after opening, it passed 103,000 backers setting the record for the most backers in Kickstarter history. At completion on February 19, 2015, it had US$8,782,571 in pledges by 219,382 backers. The campaign ended as the fourth most funded campaign on the crowdfunding site.[2] The first play test of Exploding Kittens was recorded on YouTube by Smosh Games, who had the first deck.[3] The backers started receiving delivery in late July 2015; all backers received the game by September 2015.[4][5][6][7] Exploding Kittens is described as a “strategic card game about cats and destruction”.",
                  "** Check the Wikipedia rules for detailed rules information **  (https://en.wikipedia.org/wiki/Exploding_Kittens#Gameplay)",
                  LocalDate.of(2015, JANUARY, 1),
                  2,
                  5,
                  20,
                  "cards",
                  false,
                  "fun",
                  "all",
                  15.99);
          // catan
          Games catan = new Games(
                  "Catan",
                  "https://miro.medium.com/max/7848/1*r_rq_fRLNliX91GSgMi38Q.jpeg",
                  "Catan, previously known as The Settlers of Catan or simply Settlers, is a multiplayer board game designed by Klaus Teuber. It was first published in 1995 in Germany by Franckh-Kosmos Verlag (Kosmos) as Die Siedler von Catan. Players take on the roles of settlers, each attempting to build and develop holdings while trading and acquiring resources. Players gain victory points as their settlements grow; the first to reach a set number of victory points, typically 10, wins. The game and its many expansions are also published by Catan Studio, Filosofia, GP, Inc., 999 Games, Κάισσα, and Devir. The Settlers of Catan became one of the first German-style board games to achieve popularity outside Europe.[6] As of 2015, more than 22 million copies in 30 languages had been sold.[7][8]",
                  "** Check the Wikipedia rules for detailed rules information **  (https://en.wikipedia.org/wiki/Catan#Gameplay)",
                  LocalDate.of(1995, JANUARY, 1),
                  3,
                  4,
                  120,
                  "board",
                  false,
                  "strategy",
                  "all",
                  26.95);

          // leagueOfLegends
          Games leagueOfLegends = new Games(
                  "League of Legends",
                  "https://cdn1.dotesports.com/wp-content/uploads/2019/09/12195522/league-of-legends.jpg",
                  "League of Legends (LoL), commonly referred to as League, is a 2009 multiplayer online battle arena video game developed and published by Riot Games. Inspired by Defense of the Ancients, a custom map for Warcraft III, Riot's founders sought to develop a stand-alone game in the same genre. Since its release in October 2009, the game has been free-to-play and is monetized through purchasable character customization. The game is available for Microsoft Windows and macOS.",
                  "** Check the Wikipedia rules for detailed rules information **  (https://en.wikipedia.org/wiki/League_of_Legends#Gameplay)",
                  LocalDate.of(2009, OCTOBER, 27),
                  1,
                  10,
                  30,
                  "videoGame",
                  false,
                  "strategy",
                  "all",
                  0);
          // counterStrike
          Games csgo = new Games(
                  "CS:GO (Counter-Strike: Global Offensive)",
                  "https://upload.wikimedia.org/wikipedia/en/6/6e/CSGOcoverMarch2020.jpg",
                  "Counter-Strike: Global Offensive (CS:GO) is a multiplayer first-person shooter developed by Valve and Hidden Path Entertainment. It is the fourth game in the Counter-Strike series. Developed for over two years, Global Offensive was released for Windows, macOS, Xbox 360, and PlayStation 3 in August 2012, and for Linux in 2014. Valve still regularly updates the game, both with smaller balancing patches and larger content additions.",
                  "** Check the Wikipedia rules for detailed rules information **  (https://en.wikipedia.org/wiki/Counter-Strike:_Global_Offensive#Gameplay)",
                  LocalDate.of(2009, OCTOBER, 27),
                  1,
                  10,
                  30,
                  "videoGame",
                  false,
                  "strategy",
                  "all",
                  0);
          // flappyBird
          Games flappyBird = new Games(
                  "Flappy Bird",
                  "https://en.wikipedia.org/wiki/File:Flappy_Bird_icon.png",
                  "Flappy Bird is a mobile game developed by Vietnamese video game artist and programmer Dong Nguyen (Vietnamese: Nguyễn Hà Đông), under his game development company .Gears. The game is a side-scroller where the player controls a bird, attempting to fly between columns of green pipes without hitting them. Nguyen created the game over the period of several days, using a bird protagonist that he had designed for a cancelled game in 2012.",
                  "** Check the Wikipedia rules for detailed rules information **  (https://en.wikipedia.org/wiki/Flappy_Bird#Gameplay)",
                  LocalDate.of(2013, MAY, 13),
                  1,
                  1,
                  2,
                  "videoGame",
                  false,
                  "arcade",
                  "all",
                  0);

          repository.saveAll(
                  List.of(hangman, uno, ringOfFire, jenga, cardsAgainstHumanity, twister, whatDoYouMeme, twentyOne, theMind, thePretender, chess, monopoly, yuGiOh, pandemic, explodingKittens, catan, leagueOfLegends, csgo, flappyBird)
          );
      };
    }

}

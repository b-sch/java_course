package dev.lpa.games;

import dev.lpa.games.poker.PokerGame;

public class GameController {

    public static void main(String[] args) {

        PokerGame pokerGame = new PokerGame(2, 5);
        pokerGame.startPlay();
    }
}

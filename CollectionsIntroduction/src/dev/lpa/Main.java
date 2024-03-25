package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Card> standardDeck = new ArrayList<>();

        populateDeck((char) 9827, standardDeck);
        populateDeck((char) 9830, standardDeck);
        populateDeck((char) 9829, standardDeck);
        populateDeck((char) 9824, standardDeck);

        System.out.println(standardDeck.toString().replaceAll(",|\\[|\\]", ""));
    }

    public static void populateDeck(char suit, List<Card> deckToPopulate) {
        for (int i = 0; i <= 12; i++) {
            if (i <= 8) {
                deckToPopulate.add(new Card(suit, Integer.toString(i + 2), i));
            } else {
                switch (i) {
                    case 9 -> deckToPopulate.add(new Card(suit, "jack", i));
                    case 10 -> deckToPopulate.add(new Card(suit, "queen", i));
                    case 11 -> deckToPopulate.add(new Card(suit, "king", i));
                    case 12 -> deckToPopulate.add(new Card(suit, "ace", i));
                }
            }
        }
    }
}
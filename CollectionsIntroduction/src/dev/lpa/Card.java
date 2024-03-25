package dev.lpa;

public class Card {

    private char suit;
    private String face;
    private int rank;

    public Card(char suit, String face, int rank) {
        this.suit = suit;
        this.face = face;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "%s%s(%s)".formatted(face.toUpperCase().charAt(0), suit, rank);
    }
}

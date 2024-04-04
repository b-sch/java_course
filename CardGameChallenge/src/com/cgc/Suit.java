package com.cgc;

public enum Suit {
    CLUB, DIAMOND, HEART, SPADE;

    public static char getSymbol(Suit suit) {
        return switch (suit) {
            case SPADE -> '♠';
            case HEART -> '♥';
            case DIAMOND -> '♦';
            case CLUB -> '♣';
        };

    }
}
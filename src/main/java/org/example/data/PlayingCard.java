package org.example.data;

public class PlayingCard {
    private Suit suit; //number 1 to 13 1 being ace 13 being king
    private int value;

    public PlayingCard() {}
    public PlayingCard(Suit init_suit, int init_value) {
        this.suit = init_suit;
        if (init_value > 0 && init_value < 14) {
            this.value = init_value;
        }
        else {
            throw new IllegalArgumentException("PlayingCard.value out of range");
        }
    }

    @Override
    public String toString() {
        return this.suit + " " + this.value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}

package org.example.data;

public class PlayingCard {
    private Suit suit; //number 1 to 13 1 being ace 13 being king
    private int value;

    private final int min_card_value = 1;
    private final int max_card_value = 13;
    public PlayingCard() {}
    public PlayingCard(Suit init_suit, int init_value) {
        this.suit = init_suit;
        this.setValue(init_value);
    }

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

    public void setValue(int newValue) {
        if (newValue >= min_card_value && newValue <= max_card_value) {
            this.value = newValue;
        }
        else {
            throw new IllegalArgumentException("PlayingCard.value out of range");
        }
    }

}

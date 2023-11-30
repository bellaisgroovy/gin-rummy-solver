package org.example.data;

import org.junit.Test;
import org.example.data.PlayingCard;
import org.example.data.Suit;
import static org.junit.jupiter.api.Assertions.*;

public class testPlayingCard {
    @Test
    public void testConstructorValueTooHigh() {
        try {
            PlayingCard card = new PlayingCard(Suit.HEARTS, 14);
        }catch (IllegalArgumentException exception) {
            assertTrue(exception.getMessage() == "PlayingCard.value out of range");
        }
    }
    @Test
    public void testConstructorValueTooLow() {
        try {
            PlayingCard card = new PlayingCard(Suit.HEARTS, 0);
        }catch (IllegalArgumentException exception) {
            assertTrue(exception.getMessage() == "PlayingCard.value out of range");
        }
    }
    @Test
    public void testValidConstructor(){
        PlayingCard card = new PlayingCard(Suit.HEARTS, 1);
        assertEquals(card.getSuit(), Suit.HEARTS);
    }
}

package org.example.logic;

import org.example.data.PlayingCard;
import org.example.data.Suit;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRummyGame {
    RummyGame game = new RummyGame();
    @Test
    public void testPlayCard() {
        PlayingCard card = new PlayingCard(Suit.HEARTS, 7);
        game.playCard(card);
        assertEquals(game.getFaceUpTable().get(0), card);
    }
}

package org.example.logic;

import org.example.data.PlayingCard;
import org.example.data.Suit;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestRummyGame {
    RummyGame game = new RummyGame();
    PlayingCard card = new PlayingCard(Suit.HEARTS, 7);
    @Test
    public void DiscardCard_ValidCard_CardDiscarded() {
        game.discardCard(card);
        assertEquals(game.getDiscardedPile().get(0), card);
    }

    @Test
    public void Setup_MinValidInputs_VarsPopulated() {
        PlayingCard[] hand = new PlayingCard[10];
        for (int i=1; i<11; i++) {
            hand[i-1] = new PlayingCard(Suit.HEARTS, i);
        }

        int noPlayers = 2;

        ArrayList<PlayingCard> fakeDiscardedPile = new ArrayList<>();
        fakeDiscardedPile.add(card);

        game.setup(noPlayers, card, hand);
        assertEquals(game.getHands()[0], hand);
        assertEquals(game.getNoPlayers(), noPlayers);
        assertEquals(game.getDiscardedPile(), fakeDiscardedPile);
    }

    @Test
    public void Setup_OnePlayer_Error(){
        PlayingCard[] hand = new PlayingCard[10];
        for (int i=1; i<11; i++) {
            hand[i-1] = new PlayingCard(Suit.HEARTS, i);
        }
        try {
            game.setup(1, card, hand);
        } catch (IllegalArgumentException exception) {
            assertEquals("noPlayers must be >1", exception.getMessage());
        }
    }

    @Test
    public void Setup_NineCardHand_Error() {
        PlayingCard[] hand = new PlayingCard[10];
        for (int i=1; i<10; i++) {
            hand[i-1] = new PlayingCard(Suit.HEARTS, i);
        }
        try {
            game.setup(2, card, hand);
        } catch (IllegalArgumentException exception) {
            assertEquals(exception.getMessage(), "hand must contain 10 cards");
        }
    }
}

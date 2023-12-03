package org.example.logic;

import org.example.data.PlayingCard;

import java.util.ArrayList;

public class RummyGame {

    private int noPlayers;
    private ArrayList<PlayingCard> discardedPile = new ArrayList<>(20); // holds cards discarded
    private PlayingCard[][] hands;

    //actions
    public void discardCard(PlayingCard card) {
        discardedPile.add(card);
    }
    public void setup(int noPlayers, PlayingCard faceUpCard, PlayingCard[] playerHand) {
        setNoPlayers(noPlayers);
        discardCard(faceUpCard);
        initHands(playerHand);
    }

    //getters and setters
    public ArrayList<PlayingCard> getDiscardedPile(){
        return discardedPile;
    }
    public PlayingCard[][] getHands() {
        return hands;
    }
    public int getNoPlayers() {
        return noPlayers;
    }
    private void setNoPlayers(int newNoPlayers) {
        if (newNoPlayers>1) {
            noPlayers = newNoPlayers;
        } else {
            throw  new IllegalArgumentException("noPlayers must be >1");
        }
    }

    private void initHands(PlayingCard[] playerHand) {
        //constants
        int hand_size = 10;
        hands = new PlayingCard[getNoPlayers()][hand_size];
        if (playerHand.length != hand_size) {
            throw new IllegalArgumentException("hands must contain " + hand_size + " cards");
        } else {
            hands[0] = playerHand;
        }
    }

}

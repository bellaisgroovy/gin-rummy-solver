package org.example.logic;

import org.example.data.PlayingCard;

import java.util.ArrayList;

public class RummyGame {
    private ArrayList<PlayingCard> faceUpTable = new ArrayList<>(20);

    public void playCard(PlayingCard card) {
        faceUpTable.add(card);
    }

    public ArrayList<PlayingCard> getFaceUpTable(){
        return faceUpTable;
    }
}

package com.amin.main;

import com.amin.factory.DeckFactory;
import com.amin.model.Deck;
import com.amin.model.DeckType;

public class Main {


    public static void main(String[] args) {
        Deck myDeck = DeckFactory.makeDeck(DeckType.Normal);
    }
}

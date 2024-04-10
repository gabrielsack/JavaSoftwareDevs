package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends GroupOfCards {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int[] VALUES = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

    public Deck() {
        super(52);
        initializeDeck();
    }

    private void initializeDeck() {
        for (int i = 0; i < RANKS.length; i++) {
            for (String suit : SUITS) {
                this.cards.add(new PlayingCard(RANKS[i], suit, VALUES[i]));
            }
        }
        shuffle();
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        return cards.remove(0);
    }
}

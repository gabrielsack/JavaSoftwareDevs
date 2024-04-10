/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


import java.util.ArrayList;

public abstract class GroupOfCards {
    protected ArrayList<Card> cards;

    public GroupOfCards(int capacity) {
        this.cards = new ArrayList<>(capacity);
    }

    public abstract void shuffle();
}

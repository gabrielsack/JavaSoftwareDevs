package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

public class BlackjackPlayer extends Player {
    private List<Card> hand;
    private int bet;
    private boolean isStanding;

    public BlackjackPlayer(String name) {
        super(name);
        this.hand = new ArrayList<>();
        this.isStanding = false;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public int getHandValue() {
        int value = 0;
        int aceCount = 0;
        for (Card card : hand) {
            if (card instanceof PlayingCard) {
                value += ((PlayingCard) card).getValue();
                if ("Ace".equals(((PlayingCard) card).getRank())) {
                    aceCount++;
                }
            }
        }
        while (value > 21 && aceCount > 0) {
            value -= 10;
            aceCount--;
        }
        return value;
    }

    public void placeBet(int bet) {
        this.bet = bet;
    }

    public boolean isStanding() {
        return isStanding;
    }

    public void stand() {
        this.isStanding = true;
    }

    @Override
    public void play() {
        // Player logic goes here
    }
}

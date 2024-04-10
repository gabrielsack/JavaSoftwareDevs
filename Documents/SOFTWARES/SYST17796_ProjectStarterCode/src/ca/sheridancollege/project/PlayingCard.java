package ca.sheridancollege.project;

public class PlayingCard extends Card {
    private String suit;
    private String rank;
    private int value;

    public PlayingCard(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

package ca.sheridancollege.project;

import java.util.Scanner;

public class BlackjackGame extends Game {
    private Deck deck;
    private BlackjackPlayer dealer;
    private BlackjackPlayer player;

    public BlackjackGame(String name) {
        super(name);
        this.deck = new Deck();
        this.dealer = new BlackjackPlayer("Dealer");
        this.player = new BlackjackPlayer("Player");
    }

    public void startGame() {
        player.addCardToHand(deck.dealCard());
        dealer.addCardToHand(deck.dealCard());
        player.addCardToHand(deck.dealCard());
        dealer.addCardToHand(deck.dealCard());

        while (!player.isStanding() && player.getHandValue() < 21) {
            System.out.println("Your hand: " + player.getHandValue());
            System.out.println("Hit or Stand? (h/s): ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            if ("h".equals(choice)) {
                player.addCardToHand(deck.dealCard());
            } else if ("s".equals(choice)) {
                player.stand();
            }
        }

        while (dealer.getHandValue() < 17) {
            dealer.addCardToHand(deck.dealCard());
        }

        declareWinner();
    }

    @Override
    public void declareWinner() {
        int playerValue = player.getHandValue();
        int dealerValue = dealer.getHandValue();

        if (playerValue > 21 || (dealerValue <= 21 && dealerValue > playerValue)) {
            System.out.println("Dealer wins!");
        } else if (dealerValue > 21 || playerValue > dealerValue) {
            System.out.println("Player wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    @Override
    public void play() {
        startGame();
    }
}

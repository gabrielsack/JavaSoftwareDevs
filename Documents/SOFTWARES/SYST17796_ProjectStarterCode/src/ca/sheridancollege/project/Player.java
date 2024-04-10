/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */


import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void play();

    public String getName() {
        return name;
    }
}

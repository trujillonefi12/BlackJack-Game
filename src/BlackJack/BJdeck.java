
package BlackJack;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

public class BJdeck implements PDeck {

    // attributes
    private ArrayList<BJcard> cards = new ArrayList<>();

    // contructor

    public BJdeck() {

        // BJcard newJack = new BJcard(1, 1);
        // cards.add(newJack);
        // BJcard newJack1 = new BJcard(1, 2);
        // cards.add(newJack1);
        // BJcard newJack2 = new BJcard(1, 3);
        // cards.add(newJack2);
        // BJcard newJack3 = new BJcard(1, 4);
        // cards.add(newJack3);
        //
        // BJcard newTwo = new BJcard(1, 1);
        // cards.add(newTwo);
        // BJcard newTwo1 = new BJcard(1, 2);
        // cards.add(newTwo1);
        // BJcard newTwo2 = new BJcard(1, 3);
        // cards.add(newTwo2);
        // BJcard newTwo3 = new BJcard(1, 4);
        // cards.add(newTwo3);
        //
        // BJcard newThree = new BJcard(1, 1);
        // cards.add(newThree);
        // BJcard newThree1 = new BJcard(1, 2);
        // cards.add(newThree1);
        // BJcard newThree2 = new BJcard(1, 3);
        // cards.add(newThree2);
        // BJcard newThree3 = new BJcard(1, 4);
        // cards.add(newThree3);

        for (int i = BJcard.ACE; i <= BJcard.KING; i++) { // iteration through the ranks

            for (int s = BJcard.CLUBS; s <= BJcard.DIAMONDS; s++) { // teration through suits
                BJcard newCard = new BJcard(i, s);
                cards.add(newCard);

            }
        }

    }

    /** Randomizes the deck. */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /** Adds a card to the end of the deck. */
    public void addCard(PCard card) {

        cards.add((BJcard) card);

    }

    /**
     * Removes a card from the end of the deck. Returns Null if the deck is empty.
     */
    public PCard dealCard() {

        if (cards.isEmpty()) {
            return null;
        } else {
            return cards.remove(cards.size() - 1);
        }

    }

    /**
     * Removes a card from the end of the deck and marks it as hidden. Returns Null
     * if the deck is empty.
     */
    public PCard dealHiddenCard() {

        if (cards.isEmpty()) {
            return null;
        } else {
            PCard pcard = cards.remove(cards.size() - 1);
            pcard.hideCard();
            return pcard;
        }
    }

    /** Returns the number of cards in the deck. */
    public int cardCount() {

        return cards.size();
    }

}

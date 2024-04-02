package BlackJack;

import java.util.ArrayList;
import java.util.List;

import BlackJackBase.PCard;
import BlackJackBase.PHand;
//import BlackJack.BJcard;

public class BJHand implements PHand {

    // attributes
    private List<BJcard> cards;

    // contructir
    public BJHand() {

        cards = new ArrayList<BJcard>();
    }

    // methods
    /** Returns the number of cards in the hand. */
    @Override
    public int getSize() {

        return cards.size();

    }

    /** Adds a card to the end of the hand. */
    @Override
    public void addCard(PCard card) {

        cards.add((BJcard) card);
    }

    /** Returns a card from the hand (but not removed). */
    @Override
    public PCard getCard(int index) {

        return cards.get(index);

    }

    /** Removes and returns the card */
    @Override
    public PCard removeCard(int index) {

        return cards.remove(index);

    }

    /**
     * Returns the point value of the current hand.
     * Basic BlackJack rules apply:
     * Ranks 2 - 10 are valued at their face value
     * Ranks Jack - King are valued at 10
     * Ace is valued at 11 if the total value of all cards in the hand is <= 21
     * Otherwise, Ace is valued as 1
     */
    @Override
    public int getValue() {
        int total = 0;
        int aces = 0;

        for (BJcard card : cards) {

            if (2 <= card.getRank() && 10 >= card.getRank()) {

                total += card.getRank();
            } else if (card.getRank() != 1) {
                total += 10;
            } else {

                aces += 1;
            }

        }

        for (int i = 0; i < aces; i++) {

            total += (total + 11 > 21) ? 1 : 11;
        }
        System.out.println(total);

        return total;

        // Get all cards that are not aces

    }

}
// end of the class
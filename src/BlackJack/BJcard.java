package BlackJack;

import java.awt.Color;
//import java.util.Collection;
//import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import BlackJackBase.PCard;

public class BJcard extends PCard { // START OF THE BJCARD CLASS

    // attributes

    private int rank;

    private int suit;

    private boolean hidden;

    // CONSTANTS REPRESENTING SUITS
    public static final int CLUBS = 1;
    public static final int SPADES = 2;
    public static final int HEARTS = 3;
    public static final int DIAMONDS = 4;

    // CONSTANTS REPRESENTING RANK
    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int KNIGHT = 12;
    public static final int QUEEN = 13;
    public static final int KING = 14;

    // public static final Map<Integer, String> suitMap = new HashMap<>()
    // {
    // put(BJcard.HEARTS, "???");
    // }

    // public static final Map<Integer, String> rankMap = new HashMap<>() {

    // put(BJcard.ACE, "???");
    // put(BJcard.TWO, "???");
    // put(BJcard.THREE, "???");
    // put(BJcard.FOUR, "???");
    // put(BJcard.FIVE, "???");

    // }

    private final Map<Integer, Character> suitMap = new HashMap<Integer, Character>() {
        {
            put(HEARTS, '\u2665');
            put(DIAMONDS, '\u2666');
            put(CLUBS, '\u2663');
            put(SPADES, '\u2660');
        }
    };

    private final Map<Integer, String> cardMap = new HashMap<Integer, String>() {
        {
            put(ACE, "A");
            put(TWO, "2");
            put(THREE, "3");
            put(FOUR, "4");
            put(FIVE, "5");
            put(SIX, "6");
            put(SEVEN, "7");
            put(EIGHT, "8");
            put(NINE, "9");
            put(TEN, "10");
            put(JACK, "J");
            put(KNIGHT, "Kn");
            put(QUEEN, "Q");
            put(KING, "K");
        }
    };

    // constructors
    public BJcard(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
        hidden = false;
    }

    // methods

    public void hideCard() {

        hidden = true;
        // hides the card
    }

    public void showCard() {

        hidden = false;
        // shows the card face up
    }

    public boolean isHidden() {
        /**
         * Finds if the card is face-down or face-up
         * 
         * @return <b>true</b> if the card if face down.
         */

        return hidden;
    }

    public String getText() {
        return cardMap.get(this.rank) + String.valueOf(suitMap.get(this.suit));

    }

    public Color getFontColor() {

        if (suit >= 3) {

            return Color.red;
        } else {
            return Color.BLACK;
        }

    }

    public int getRank() {
        /*
         * int key = 0;
         * 
         * for (Map.Entry<Integer, String> entry : cardMap.entrySet()) {
         * key = entry.getKey();
         * }
         * 
         * return key;
         */
        return rank;

    }
} // END FOR THE CLASS BJCARD

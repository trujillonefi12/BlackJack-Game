package BlackJackTest;

import java.awt.Color;

import BlackJack.BJHand;
import BlackJack.BJcard;
//import BlackJack.BJcard;
//import BlackJack.BJcard;
//import BlackJackBase;
//import BlackJack.BJcardtest;
import BlackJack.BJdeck;
import BlackJackBase.PDeck;
//import BlackJackBase.PHand;
//import BlackJackBase.PDeck;
import BlackJackBase.PGame;

public class PlayBlackJack {
    public static void main(String[] args) {

        // BJcard myCard = new BJcard(1, 4);
        // CardTest.run(myCard);

        BJdeck deck = new BJdeck();

        // DeckTest.run(deck);

        BJHand hand = new BJHand();

        BJHand playerhan = new BJHand();

        PGame.setBackgroundColor(Color.BLUE);
        PGame.setButtonTextColor(Color.DARK_GRAY);
        PGame.setButtonHighlightColor(Color.DARK_GRAY);
        Color DARKPURPLE = new Color(128, 0, 12);
        PGame.setButtonColor(DARKPURPLE);
        PGame.setBannerTextColor(Color.BLACK);
        PGame.setStatusTextColor(Color.MAGENTA);
        PGame.setBannerColor(Color.PINK);

    
        //
        // BJdeck deck1 = new BJdeck();
        //
        // HandTest.run(deck1, hand);

        PGame.run(deck, hand, playerhan);

    }

}

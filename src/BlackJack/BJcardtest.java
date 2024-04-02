package BlackJack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Color;

import org.junit.Before;
//import org.junit.Assert;
import org.junit.Test;

public class BJcardtest {

    private BJcard card;

    @Before
    public void setUp() {

        card = new BJcard(1, 3);

    }

    @Test
    public void TestHideCard() {

        card.hideCard();

        assertTrue(card.isHidden());

    }

    @Test
    public void TestShowCard() {
        card.hideCard();

        card.showCard();

        assertFalse(card.isHidden());
    }

    @Test
    public void testGetText() {
        assertEquals("1♥", card.getText());
    }

    @Test

    public void testGetFontColor() {

        assertNotNull(card);

        assertEquals(Color.red, card.getFontColor());
    }
}

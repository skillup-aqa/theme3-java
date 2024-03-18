package part4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CartDeckTest {
    @Test
    public void testGetRandomCard() {
        String card1 = CardDeck.getRandomCard();
        String card2 = CardDeck.getRandomCard();
        String card3 = CardDeck.getRandomCard();

        // The test is false negative, because it is possible that the same card is returned
        // However, the proximity of this is 1 to 52 * 52 * 52 = 140608
        assertFalse((card1 == card2) && (card2 == card3) && (card1 == card3));
    }
}

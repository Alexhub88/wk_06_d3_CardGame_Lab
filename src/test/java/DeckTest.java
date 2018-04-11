import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck1;
    private Deck deck2;

    @Before
    public void before(){
        deck1 = new Deck();
        deck2 = new Deck();
    }

    @Test
    public void hasZeroCards(){
        assertEquals(0, deck1.deckSize());

    }

    @Test
    public void hasFullDeck(){
        deck1.populate();
        assertEquals(52, deck1.deckSize());
    }

    @Test
    public void cardsPopulated(){
        deck1.populate();
        assertEquals(Suit.HEARTS, ((deck1.getDeckCards()).get(2)).getSuit());
        assertEquals(3, ((deck1.getDeckCards()).get(2)).getRankValue());
    }

    @Test
    public void hasShuffledDeck(){
        deck1.populate();
        deck2.populate();
        deck1.shuffle();
        assertEquals(false, deck1 == deck2);
    }

    @Test
    public void canDealCard(){
        deck1.populate();
        deck1.dealCard();
        assertEquals(51, deck1.deckSize());
        assertEquals(2, ((deck1.getDeckCards()).get(0)).getRankValue());
    }


}

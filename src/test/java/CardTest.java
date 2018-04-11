import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Card card1;

    @Before
    public void before(){
        card1 = new Card (Suit.HEARTS, Rank.TEN);
    }

    @Test
    public void hasSuit(){
        assertEquals(Suit.HEARTS, card1.getSuit());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.TEN, card1.getRank());
    }

    @Test
    public void hasRankValue(){
        assertEquals(10, card1.getRankValue());
    }
}

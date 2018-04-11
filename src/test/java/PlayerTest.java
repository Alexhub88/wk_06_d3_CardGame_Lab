import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card1;

    @Before
    public void before(){
        player = new Player();
        card1 = new Card(Suit.SPADES, Rank.KING);
    }

    @Test
    public void hasEmptyHand(){
        assertEquals(0, (player.getHand()).size());
    }

    @Test
    public void addsOneCard(){
        player.addCardToHand(card1);
        assertEquals(1, (player.getHand()).size());
    }

}

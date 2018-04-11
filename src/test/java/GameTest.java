import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GameTest {
    private Game game1;
    private Player player1;
    private Player player2;
    private Deck deck1;
    private Card card0;

    @Before
    public void before(){
        game1 = new Game();
        player1 = new Player();
        player2 = new Player();
        deck1 = new Deck();
        card0 = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
     public void hasZeroPlayers(){
        assertEquals(0,game1.countPlayers());
    }

    @Test
    public void canAddPlayer(){
        game1.addPlayer(player1);
        assertEquals(1,game1.countPlayers());
    }
    @Test
    public void canPopulateDeck(){
        game1.shuffleDeckOfCards(deck1);
        assertEquals(52, deck1.deckSize());
    }

    @Test
    public void canDealCards(){
        game1.addPlayer(player1);
        game1.addPlayer(player2);
        game1.shuffleDeckOfCards(deck1);
        game1.dealCards(deck1);
        assertEquals(1, (player1.getHand()).size());
        assertEquals(50, deck1.deckSize());
    }

    @Test
    public void canDecideWinner(){
        game1.addPlayer(player1);
        game1.addPlayer(player2);
        game1.shuffleDeckOfCards(deck1);
        game1.dealCards(deck1);
        game1.decideWinner();
        assertEquals(true, (game1.decideWinner() == player1) || (game1.decideWinner() == player2));

    }

}

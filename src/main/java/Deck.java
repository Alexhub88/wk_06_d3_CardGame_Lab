import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
         cards = new ArrayList<>();
    }

    public int deckSize(){
        return cards.size();
    }

    public void populate(){
        for (Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }

    public ArrayList<Card> getDeckCards(){
        return cards;
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card dealCard(){
        return cards.remove(0);
    }


}

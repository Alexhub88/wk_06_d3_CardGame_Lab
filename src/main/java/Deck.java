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

    public ArrayList<Card> populate(){
        for (Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                cards.add(new Card(suit, rank));
            }
        }
        return cards;
    }

    public ArrayList<Card> getDeckCards(){
        return cards;
    }

    public ArrayList<Card> shuffle(){
       Collections.shuffle(cards);
       return cards;
    }

    public Card dealCard(){
        return cards.remove(0);
    }


}

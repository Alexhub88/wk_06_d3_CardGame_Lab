import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<>();
    }

    public void addCardToHand(Card card){
        this.hand.add(card);
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }
}

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;

    public Game(){
        this.players = new ArrayList<>();
    }

    public int countPlayers(){
       return players.size();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void shuffleDeckOfCards(Deck deck){
        deck.populate();
        deck.shuffle();
    }

    public void dealCards(Deck deck){
        for (Player player: players){
            player.addCardToHand(deck.dealCard());
        }
    }

    public Player decideWinner(){
        ArrayList<Player> winner = new ArrayList<>();

        for (Player player: players) {

            if (winner.isEmpty()) {
                winner.add(player);
            }
            else if ((player.getHand()).get(0).getRankValue() > ((winner.get(0)).getHand()).get(0).getRankValue()) {
                winner.set(0, player);
            }

        }
        return winner.get(0);
    }

}

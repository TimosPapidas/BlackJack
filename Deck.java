import java.util.Stack;

public class Deck {
    private Stack<Card> cardStack;
    public Deck(){
        this.cardStack = new Stack<Card>();
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                cardStack.push(new Card(suit, rank));
            }
        }
    }

    public void shuffle(){
        return;
    }
}

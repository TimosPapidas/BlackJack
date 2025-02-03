package src.main.java;

import java.util.Stack;
import java.util.Collections;

public class Deck {
    private Stack<Card> cardStack;
    private Stack<Card> discardPile;
    public Deck(){
        init();
    }

    public void init(){
        this.cardStack = new Stack<Card>();
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                cardStack.push(new Card(suit, rank));
            }
        }
        this.discardPile = new Stack<Card>();
    }

    public void shuffle(){
        Collections.shuffle(cardStack);
    }

    public Card draw(){
        return cardStack.pop();
    }

    public int remainingCards(){
        return cardStack.size();
    }

    public void discard(Card card){
        this.discardPile.push(card);
    }
    
}

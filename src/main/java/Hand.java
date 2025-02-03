package src.main.java;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
        init();
    }

    public void init(){
        this.cards = new ArrayList<Card>();
    }

    public int calculateValue(){
        int value = 0;
        int aceCount = 0;
        for(Card card : cards){
            value += card.getValue();
            if(card.rank == Rank.ACE){
                aceCount ++;
            }
        }
        if (value > 21){
            value -= 10;
        }
        return value;
    }
}

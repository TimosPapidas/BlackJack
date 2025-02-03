package src.main.java;

public class Card {
    public final Suit suit;
    public final Rank rank;

    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue(){
        return this.rank.getValue();
    }
}

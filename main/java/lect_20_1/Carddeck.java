package lect_20_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Carddeck{
    ArrayList<Card> deck;


    public Carddeck(){
        this.deck = new ArrayList<Card>();
    }

    public Card getLastCard(){
        return this.deck.removeLast();
    }
}

package lect_20_2;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    public static void main(String[] args) {

        ArrayList<Card> cards = new ArrayList<Card>();
        for(Color c : Color.values()){
            for(Value v : Value.values()){
                cards.add(new Card(c,v));
            }
        }

        Collections.sort(cards);
        for(Card c : cards){
            System.out.println(c.toString());
        }
    }
}

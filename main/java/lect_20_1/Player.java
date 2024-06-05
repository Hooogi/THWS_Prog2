package lect_20_1;

import java.util.HashSet;

public class Player {
    final int cap = 10;
    HashSet<Card> Hand;

    public Player(){
        this.Hand = new HashSet<Card>();
    }
    public void draw(Carddeck cards){
        if (this.Hand.size() < cap){
            this.Hand.add(cards.getLastCard());
        }
        else{
            System.out.println("Your hand is already full!");
        }
    }

//    public void start(Carddeck cards){
//        while(this.Hand.size() <cap){
//            this.draw(cards);
//        }
//    }
}

package lect_20_1;

public class main {
    public static void main(String[] args) {
        Player tom = new Player();
        Carddeck spielkarten = new Carddeck();
        spielkarten.deck.add(new Card("Heart","Ace"));
        spielkarten.deck.add(new Card("Heart","Ace"));
//        spielkarten.deck.add(new Card("Club","Queen"));
//        spielkarten.deck.add(new Card("Diamond","10"));
//        spielkarten.deck.add(new Card("Spades","9"));
//        spielkarten.deck.add(new Card("Heart","8"));
//        spielkarten.deck.add(new Card("Spades","7"));
//        spielkarten.deck.add(new Card("Spades","3"));
//        spielkarten.deck.add(new Card("Heart","2"));
//        spielkarten.deck.add(new Card("Spades","Ace"));

        tom.draw(spielkarten);
        for(Card c : tom.Hand){
            System.out.println(c.color + " " +c.value);
        }

    }
}
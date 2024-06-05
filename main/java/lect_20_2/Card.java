package lect_20_2;

public class Card implements Comparable<Card>{

    Color color;
    Value value;

    public Card(Color color, Value value){
        this.color = color;
        this.value = value;
    }

    public int getColorValue(){
        return this.color.value;
    }

    public int getValue(){
        return this.value.value;
    }

    public int getCardValue(){
        return getValue() * getColorValue();
    }

    @Override
    public int compareTo(Card card) {
        if(this.getCardValue() > card.getCardValue()){
            return -1;
        }
        else if(this.getCardValue() < card.getCardValue()){
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString(){
        return this.color + " : "+ this.value;
    }
}

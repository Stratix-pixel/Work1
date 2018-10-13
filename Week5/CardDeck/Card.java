package CardDeck;

import java.util.Objects;

public class Card implements Comparable{
    private int number;
    private String suit;

    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card cardDeck = (Card) o;
        return number == cardDeck.number &&
                Objects.equals(suit, cardDeck.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, suit);
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", suit='" + suit + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Card other = (Card) o;
        if(this.number > other.number) {
            return 1;
        }else if (this.number == other.number){
            return this.suit.compareTo(other.suit);
        }
        return -1;
    }
}

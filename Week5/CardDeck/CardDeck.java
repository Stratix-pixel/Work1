package CardDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    List<Card> cardsNeeded;
    List<Card> cardsUsed;
    public static List<String> suit = new ArrayList<>();
    static {
        suit.add("Diamonds");
        suit.add("Hearts");
        suit.add("Clubs");
        suit.add("Spades");
    }

    public List<Card> getCardsNeeded() {
        return cardsNeeded;
    }

    public void setCardsNeeded(List<Card> cardsNeeded) {
        this.cardsNeeded = cardsNeeded;
    }

    public List<Card> getCardsUsed() {
        return cardsUsed;
    }

    public void setCardsUsed(List<Card> cardsUsed) {
        this.cardsUsed = cardsUsed;
    }

    public List<Card> dealHand(int cards) {
        if (cardsNeeded.size() >= cards) {
            List<Card> removedCards = new ArrayList<>();
            Collections.shuffle(cardsNeeded);
            for (Card c : cardsNeeded) {
                cardsUsed.add(c);
                removedCards.add(c);
                if (removedCards.size() == cards) {
                    break;
                }
            }
            removeFromAvailable(removedCards);
            return removedCards;
        }
        else {
            System.out.println("No more cards");
            return null;
        }
    }

    private void removeFromAvailable(List<Card> removedCards) {
        for(Card r : removedCards) {
            cardsNeeded.remove(r);
        }
    }

    public void initCardsNeeded() {
        cardsNeeded = new ArrayList<>();
        cardsUsed = new ArrayList<>();
        for (int i = 2; i <= 14; i++) {
            for (String s : suit) {
                cardsNeeded.add(new Card(i, s));
            }
        }
    }

    public void shuffle(){
        for(Card c : cardsUsed){
            cardsNeeded.add(c);
        }
        cardsUsed.removeAll(cardsUsed);
        Collections.shuffle(cardsNeeded);
    }

    public int getAvailableCardCount(){
        return cardsNeeded.size();
    }

    public int getUsedCardCount(){
        return cardsUsed.size();
    }

}

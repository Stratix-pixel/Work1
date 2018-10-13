package CardDeck;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        CardDeck deck1 = new CardDeck();
        deck1.initCardsNeeded();


        deck1.dealHand(5);
        System.out.println("Available cards:" + deck1.getAvailableCardCount());
        System.out.println("Used cards:" + deck1.getUsedCardCount());

        deck1.dealHand(10);
        System.out.println("Available cards:" + deck1.getAvailableCardCount());
        System.out.println("Used cards:" + deck1.getUsedCardCount());

        deck1.dealHand(45);
        System.out.println("Available cards:" + deck1.getAvailableCardCount());
        System.out.println("Used cards:" + deck1.getUsedCardCount());

        Collections.sort(deck1.getCardsUsed());
        Collections.sort(deck1.getCardsNeeded());

        System.out.println("We removed the following cards: ");
        for(Card c : deck1.getCardsUsed()){
            System.out.println(c);
        }

        System.out.println("Following cards remained: ");
        for(Card c : deck1.getCardsNeeded()){
            System.out.println(c);
        }

        deck1.shuffle();
        System.out.println("All shuffled: ");
        for(Card c : deck1.getCardsNeeded()){
            System.out.println(c);
        }

    }
}

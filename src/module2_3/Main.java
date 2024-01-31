package module2_3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Card> hand = deck.pollSeven();
        for (Card card : hand) {
            System.out.println(card);
        }
        hand.sort(new suitComparator());
        System.out.println("After sorting by suit");
        for (Card card : hand) {
            System.out.println(card);
        }
        hand.sort(new numericalValue());
        System.out.println("After sorting by numerical value");
        for (Card card : hand) {
            System.out.println(card);
        }
    }

}
package part4;

public class CardDeck {
    public static String getRandomCard() {
        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] cardType = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Jack", "Queen", "King", "Ace"};
        int i = (int) (Math.random() * suit.length);
        int j = (int) (Math.random() * cardType.length);


        return "Random card is: " + cardType[j] + " " + suit[i];
    }

    public static void main(String[] args) {
        System.out.println(getRandomCard());
    }


}


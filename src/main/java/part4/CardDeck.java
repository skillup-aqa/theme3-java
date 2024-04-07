package part4;

public class CardDeck {
    public static String getRandomCard() {
        String[] suitCard = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] typeCard = {"2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Jack ", "Queen ", "King ", "Ace "};

        int i = (int) (Math.random() * suitCard.length);
        int k = (int) (Math.random() * typeCard.length);
        return typeCard[k] + suitCard[i];
    }

    public static void main(String[] args) {
        System.out.println("Random card: " + getRandomCard());
    }
}

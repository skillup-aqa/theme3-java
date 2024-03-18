package part4;

public class CardDeck {
    private static String getRandomElementOfArray(String[] array) {
        return array[(int) (Math.random() * array.length)];
    }

    public static String getRandomCard() {
        final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        return getRandomElementOfArray(ranks) + " of " + getRandomElementOfArray(suits);
    }
}

package homeWork08;

public class Cards {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int players = 4;
        int cardsForPlayer = 6;

        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < cardsForPlayer; j++) {
                int suitSelection = (int) (Math.random() * suits.length);
                int rankSelection = (int) (Math.random() * ranks.length);
                System.out.println(ranks[rankSelection] + " of " + suits[suitSelection]);
            }
            System.out.println();
        }
        int i = 0;
        while (i < players){
            System.out.println("Cards for player "+ (i + 1));
            int j = 0;
            while (j < cardsForPlayer){
                int suitSelection = (int) (Math.random() * suits.length);
                int rankSelection = (int) (Math.random() * ranks.length);
                System.out.println(ranks[rankSelection] + " " + suits[suitSelection]);
                j++;
            }
            i++;
            System.out.println("-------------------");
        }

    }
}

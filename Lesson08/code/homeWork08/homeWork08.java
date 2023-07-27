package homeWork08;

public class homeWork08 {
    public static void main(String[] args) {

        //Task 1
        int[] ageOfStudents = new int[18];
        int i = 0;
        int a = 25;
        int b = 60;
        int maxAge = ageOfStudents[0];
        int minAge = ageOfStudents[0];

        System.out.print("Age of students: ");
        while (i < ageOfStudents.length){
            ageOfStudents[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(ageOfStudents[i] + "|");

            if (ageOfStudents[i] > maxAge){
                maxAge = ageOfStudents[i];
                minAge = ageOfStudents[i];
            } else if (ageOfStudents[i] < minAge) {
                minAge = ageOfStudents[i];
            }
            i++;
        }
        System.out.println("\nMax age = " + maxAge);
        System.out.println("Min age = " + minAge);

        System.out.println("-------------------------------");

        //Task 2
        int[] array = {56, 73, 15, -10, 37, -14, 25, 165, 33, 38};
        int i2 = 0;
        int max = array[0];
        int pointer = 0;
        while (i2 < array.length){
            if (array[i2] > max){
                max = array[i2];
                pointer = i2;
            }
            i2++;
        }
        System.out.println("Max number = " + max + " Index = " + pointer);
        System.out.println("-------------------------------");

        //Task 3
        int[] arrayOfIntegers = new int[20];
        int i3 = 0;
        int a1 = 10;
        int b1 = 20;
        System.out.print("Array of integers ");
        while (i3 < arrayOfIntegers.length){
            arrayOfIntegers[i3] = (int) (Math.random() * (b1 - a1 + 1) + a1);
            System.out.print(arrayOfIntegers[i3] + "|");
            i3++;
        }
        int temp = arrayOfIntegers[0];
        arrayOfIntegers[0] = arrayOfIntegers[arrayOfIntegers.length - 1];
        arrayOfIntegers[arrayOfIntegers.length - 1] = temp;
        System.out.print("\nArray of integers ");

        int j = 0;
        while (j < arrayOfIntegers.length){
            System.out.print(arrayOfIntegers[j] + "|");
            j++;
        }
        System.out.println("\n-------------------------------");

        //Task 4
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int players = 4;
        int cardsForPlayer = 6;
        int i4 = 0;
        while (i4 < players){
            System.out.println("Cards for player "+ (i4 + 1));
            int j2 = 0;
            while (j2 < cardsForPlayer){
                int suitSelection = (int) (Math.random() * suits.length);
                int rankSelection = (int) (Math.random() * ranks.length);
                System.out.println(ranks[rankSelection] + " " + suits[suitSelection]);
                j2++;
            }
            i4++;
            System.out.println("-------------------");
        }
    }
}

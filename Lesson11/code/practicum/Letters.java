package practicum;

import java.util.Scanner;

public class Letters {
    /*
    Реализуйте метод, который получает на вход строку на английском языке и сообщает количество гласных букв в ней.

    a, e, i, o, u, y - гласный буквы в английском алфавите
     */

    public static void main(String[] args) {
        //шаг 1 - подключить сканер
        //Шаг 2 - получить строку от пользователя
        //Шаг 3 - пишем метод который принимает эту строку на вход
        //Шаг 4 - Пройти циклом по строке charAt(index) и посчитать количество гласных

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String str = scanner.nextLine().toLowerCase();

        countVowels(str);

    }

    public static void countVowels(String st){
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' ||  st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' ||
                    st.charAt(i) == 'u' || st.charAt(i) == 'y'){
                //суммируем количество найденных гласных
                  count++;
            }
        }
        System.out.println("Number jf vowels letter are " + count);
    }
}

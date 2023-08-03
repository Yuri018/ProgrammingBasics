package practicum;

public class Coin {
    public static void main(String[] args) {
        /*
        Написать методы, реализующие имитацию:
    1. бросание монеты
    2. стрельбу по мишени (вар 1 - попал/не попал, вар 2 - результат от 0 до 10)
        На вход методов подается ко-во попыток, метод должен вернуть результаты попыток.

        int n = (int)(Math.random() * (m - n + 1) + n)
         */

        int[] game = new int[10];//создаем новый массив
        game = coins(20);// и туда передаем метод

        for (int i : game){
            System.out.print(game[i] + "|");
        }

    }
    public static int[] coins (int n){
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = (int)(Math.random() * (1 - 0 + 1) + 0);
        }
        return c;
    }
}

package practicum;

public class MethodsWithReturn {
    public static void main(String[] args) {
        //sumNumbers(1, 2);
        int a = sumNumbers(6,2) + 3;
        System.out.println(a);
        System.out.println("With two args:" + sumNumbers(3, 5));
        System.out.println("With three args:" + sumNumbers(4, 12, 4));
        System.out.println("With two different args:" + sumNumbers(4.6, 12));


        String name = "John";
        System.out.println(returnName(name));

        System.out.println(checkNumbers(154));
    }

    //Перегрузка методов
    //использование одного имени метода с разными параметрами и аргументами

    static int sumNumbers(int a, int b){
        //System.out.println(sum);
        return a + b;
    }

    static int sumNumbers(int a, int b, int c){
        return a + b + c;
    }

    static int sumNumbers(double a, int b){
        return (int) (a + b);
    }

    //написать метод возвращающий строку + заданное имя (строку)
    static  String returnName (String str){
        return "Hallo " + str;
    }


    // несколько return

    //написать метод который принимает число и проверяет, сколько знаков в числе
    //метод возвращает строку с ответом
    static String checkNumbers(int num){
        if (num >= 10 && num < 100){
            return "Число " + num + " двухзначное";
        } else if (num >= 100 && num < 1000) {
            return "Число " + num + " трехзначное";
        }
        return "Число непонятное";
    }
}

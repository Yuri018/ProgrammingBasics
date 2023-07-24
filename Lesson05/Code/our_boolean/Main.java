package our_boolean;

public class Main {
     /*
     Тип boolean
     занимает 1 бит и принимает два заначения try and false
      */
     public static void main(String[] args) {
         boolean b;
         b = false;
         System.out.println(b);
         System.out.println(10 < 9);
         //результатом сравнения в Java яваляется true и false

         //Relational operators
         //оператиоры сравнения

         int i = 10;
         int j = 11;
         System.out.println("i < j " + (i < j));
         System.out.println("i > j " + (i > j));
         System.out.println("i <= j " + (i <= j));
         System.out.println("i >= j " + (i >= j));
         System.out.println("i == j " + (i == j));
         System.out.println("i != j " + (i != j));

         //Logical operators
         //Логическме операторы
         /*
         & - AND И
         | - OR ИЛИ
         ! - NOT НЕ
         ^ - XOR исключающее ИЛИ

           p         q         p & q        p | q       p^q        !p
         false     false       false        false

          */

         boolean b1 = true;
         boolean b2 = false;
         System.out.println(b1 & b2); //false
         System.out.println(!(b1 & b2)); //true
         System.out.println(b1 | b2);  //true
         System.out.println(b1 ^ b2); //true



     }
}

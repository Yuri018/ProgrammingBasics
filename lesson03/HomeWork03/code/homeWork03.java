public class homeWork03 {
    public static void main(String[] args) {
        //Task 1
        int a = 0, b = 1, c = 2, d = 3, e = 4, f = 5, g = 6, h = 7, i = 8, j = 9;
        int sumOfVariables = a + b + c + d + e + f + g + h + i + j;
        int sum1 = sumOfVariables / 10;
        double sum2 = (double) sumOfVariables / 10;
        System.out.println("В дробной части отброшено : " + (sum2 - (double) sum1));

        System.out.println("-----------------------------------");
        //Task 2
        int productA = 1000;
        int productB = 500;
        int discount = 100;
        int bulkPurchase = (productA + productB) - discount;
        System.out.println("Стоимость товаров со скидкой - " + bulkPurchase);
        System.out.println("Сумма скидки - " + discount);

        System.out.println("-----------------------------------");
        //Task 3
        double montagGrad = 26.8;
        double dienstagGrad = 27.4;
        double mittwochGrad = 28.9;
        double donnerstagGrad = 29.6;
        double freitagGrad = 29.4;
        System.out.printf("Средняя температура за неделю : %.2f", (montagGrad + dienstagGrad + mittwochGrad +
                donnerstagGrad + freitagGrad) / 5);
        System.out.println();

        System.out.println("-----------------------------------");
        //Task 4
        int num = 35;
        int divider1 = 2;
        int divider2 = 6;
        System.out.println(" Остаток от деления на 2 - " + (num % divider1));
        System.out.println(" Остаток от деления на 6 - " + (num % divider2));

        System.out.println("-----------------------------------");
        //Task 5
        int x = 3;
        x += x;
        System.out.println(x);
        x++;
        System.out.println(x);
    }
}

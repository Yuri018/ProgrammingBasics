package onlineStore;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров.
        Реализовать метод добавления и добавления товара в корзину.
        Реализовать метод, который распечатает весь заказ.
        Реализовать метод, который вернет сумму заказа.
         */


        Product product1 = new Product("Butter", 2.5, 200.0, "Yellow");
        Product product2 = new Product("Tomat", 4.6, 1000.0, "Red");

        Basket basket = new Basket();

        basket.addToBasket(product1);
        basket.addToBasket(product2);
        basket.printBasket();
        basket.printTotalPrise();

    }
}

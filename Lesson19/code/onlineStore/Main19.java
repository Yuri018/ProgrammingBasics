package onlineStore;


import onlineStore2.Basket;
import onlineStore2.Product;

public class Main19 {
    public static void main (String[] args) {
        /*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров.
        Реализовать метод добавления и добавления товара в корзину.
        Реализовать метод, который распечатает весь заказ.
        Реализовать метод, который вернет сумму заказа.
         */

        Product2 product1 = new Product2("Butter", 2.5, 200.0, "yellow");
        Product2 product2 = new Product2("Tomato", 4.6, 1000.0, "red");
        Product2 product3 = new Product2("Bread", 3.2, 400.0, "light");
        Product2 product4 = new Product2("Milk", 1.9, 500.0, "white");

        Basket2 basket = new Basket2();

        basket.addToBasket(product1);
        basket.addToBasket(product2);
        basket.addToBasket(product3);
        basket.addToBasket(product4);
        basket.printBasket();
//        System.out.println(basket.printTotalPrise());
    }
}

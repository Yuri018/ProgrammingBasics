package onlineStore;


public class Main {
    public static void main(String[] args) {
        /*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров.
        Реализовать метод добавления и добавления товара в корзину.
        Реализовать метод, который распечатает весь заказ.
        Реализовать метод, который вернет сумму заказа.
         */

        Product product1 = new Product("Butter", 2.5, 200.0, "yellow");
        Product product2 = new Product("Tomato", 4.6, 1000.0, "red");
        Product product3 = new Product("Bread", 3.2, 400.0, "light");
        Product product4 = new Product("Milk", 1.9, 500.0, "white");

        Basket basket = new Basket();

        basket.addToBasket(product1);
        basket.addToBasket(product2);
        basket.addToBasket(product3);
        basket.addToBasket(product4);
        basket.printBasket();
//        System.out.println(basket.printTotalPrise());
    }
}

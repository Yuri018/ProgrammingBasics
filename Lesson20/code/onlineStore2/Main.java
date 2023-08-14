package onlineStore2;


public class Main {
    public static void main(String[] args) {
        /*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров.
        Реализовать метод добавления товара в корзину.
        Реализовать метод, который распечатает весь заказ.
        Реализовать метод, который вернет сумму заказа.

        Реализовать метод удаления товара из корзины.
         */


        Basket basket = new Basket();

        basket.addToBasket(new Product("Butter", 2.5, 200.0));
        basket.addToBasket(new Product("Tomato", 4.6, 1000.0));
        basket.addToBasket(new Product("Bread", 3.2, 400.0));
        basket.addToBasket(new Product("Milk", 1.9, 500.0));
        basket.addToBasket(new Product("cheese", 2.8, 300.0));
        basket.addToBasket(new Product("Sausage", 4.5, 600.0));
        basket.printBasket();

        basket.removeById(1);
        basket.removeById(3);
        basket.removeById(5);
        basket.printBasket();
    }
}

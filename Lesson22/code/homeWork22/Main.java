package homeWork22;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Garments("Trousers", 25.0);
        Product p2 = new Foods("Bread", 3.0);
        Product p3 = new Electronics("Refrigerator", 349.99);
        Product p4 = new Foods("Milk", 2.2);
        Product p5 = new Garments("Shirt", 17.5);
        Product p6 = new Electronics("Samsung TV", 480.0);

        Basket basket = new Basket();
        basket.addToBasket(p1);
        basket.addToBasket(p2);
        basket.addToBasket(p3);
        basket.addToBasket(p4);
        basket.addToBasket(p5);
        basket.addToBasket(p6);

        basket.printBasket();

        basket.removeById(3);
        basket.printBasket();
    }
}

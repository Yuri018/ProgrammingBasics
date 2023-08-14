package practicum;

public class Main20 {
    public static void main(String[] args) {

        Product[] array = {
                new Product("product title 1", 8.6),
                new Product("product title 2", 81.3),
                new Product("product title 3", 10.5),
                new Product("product title 4", 1.6),
                new Product("product title 5", 4.2),
                new Product("product title 6", 3.6),
                new Product("product title 7", 4.0),
                new Product("product title 8", 8.6),
        };

        Cart cart = new Cart();
        cart.add(array[0]);
        cart.add(array[2]);
        cart.add(array[6]);
        System.out.println(cart);

        cart.removeById(2);
        System.out.println(cart);
    }
}

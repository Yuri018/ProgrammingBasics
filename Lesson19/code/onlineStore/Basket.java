package onlineStore;

public class Basket {
    /*
    Реализовать метод удаления и добавления товара в корзину.
    Реализовать метод, который распечатает весь заказ.
    Реализовать метод, который вернет сумму заказа.
     */
    private int size;
//    private Product product;
    private Product[] basket = new Product[3];


    public void addToBasket(Product product) {
        if (size < basket.length) {
            basket[size] = product;
            size++;
        } else {
            increaseArray();
            basket[size] = product;
            size++;
        }
    }

    private void increaseArray() {
        Product[] tempBasket = new Product[basket.length * 2];
        for (int i = 0; i < basket.length; i++) {
            tempBasket[i] = basket[i];
        }
        basket = tempBasket;
    }

    public void printBasket() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += basket[i] + ", ";
        }
        System.out.println("basket = " + res);
        System.out.println("Total prise: " + printTotalPrise());
    }

    public double printTotalPrise() {
        double totalPrise = 0.0;
        for (int i = 0; i < size; i++) {
           totalPrise += basket[i].getPrise();
        }
        return totalPrise;
    }
}



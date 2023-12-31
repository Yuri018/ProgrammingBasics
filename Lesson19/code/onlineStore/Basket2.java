package onlineStore;


public class Basket2 {
    /*
    Реализовать метод добавления и добавления товара в корзину.
    Реализовать метод, который распечатает весь заказ.
    Реализовать метод, который вернет сумму заказа.
     */
    private int size;
    private Product2[] basket = new Product2[3];


    public void addToBasket(Product2 product) {
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
        Product2[] tempBasket = new Product2[basket.length * 2];
        for (int i = 0; i < basket.length; i++) {
            tempBasket[i] = basket[i];
        }
        basket = tempBasket;
    }

    public void printBasket() {//метод, который распечатает весь заказ
        String res = "";
        for (int i = 0; i < size; i++) {
            res += basket[i];
        }
        System.out.println("In the basket:\n" + res);
        System.out.printf("Total prise: %.2f  euro", printTotalPrise());
    }

    public double printTotalPrise() {//метод, который вернет сумму заказа
        double totalPrise = 0.0;
        for (int i = 0; i < size; i++) {
            totalPrise += basket[i].getPrise();
        }
        return totalPrise;
    }
}



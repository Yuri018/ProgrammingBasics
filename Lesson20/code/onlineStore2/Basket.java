package onlineStore2;


public class Basket {
    /*
    Реализовать метод добавления товара в корзину.
    Реализовать метод, который распечатает весь заказ.
    Реализовать метод, который вернет сумму заказа.
    Реализовать метод удаления товара из корзины.
     */
    private int size;
    private Product[] basket = new Product[3];


    public void addToBasket(Product product) {//метод добавления товара в корзину
        if (size < basket.length) {
            basket[size] = product;
            size++;
        } else {
            increaseArray();
            basket[size] = product;
            size++;
        }
    }

    public void removeById(int id){//метод удаления товара из корзины.
        int index = getIndexById(id);
        remove(index);
    }

    private void remove(int index){
        if (index >= 0 && index < size){
            for (int i = index + 1; i < size; i++) {
                basket[i - 1] = basket[i];
            }
            size--;
        }
    }

    private int getIndexById(int id){
        int flag = -1;
        for (int i = 0; i < size; i++) {
            if (basket[i].getId() == id){
                return i;
            }
        }
        return flag;
    }

    private void increaseArray() {
        Product[] tempBasket = new Product[basket.length * 2];
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
        System.out.printf("Total prise: %.2f euro\n", calculateTheTotal());
    }

    public double calculateTheTotal() {//метод, который вернет сумму заказа
        double totalPrise = 0.0;
        for (int i = 0; i < size; i++) {
            totalPrise += basket[i].getPrise();
        }
        return totalPrise;
    }
}



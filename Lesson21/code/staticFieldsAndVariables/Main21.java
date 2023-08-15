package staticFieldsAndVariables;

public class Main21 {

    int temp;

    public static void main(String[] args) {

        //доступ к нестатической переменной или методу возможен только через моздание объекта этого класса
        Main21 main21 = new Main21();
        int temp1 = main21.temp;
        main21.temp();
    }

    public void temp(){
        System.out.println("Hello");
    }
}


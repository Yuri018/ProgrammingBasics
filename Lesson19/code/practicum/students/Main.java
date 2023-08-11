package practicum.students;

public class Main {
    public static void main(String[] args) {

        //int[] rates1 = {4, 5, 3, 5, 2};

        Student student = new Student("John");

        System.out.println(student);

        student.addRate(4);
        student.addRate(3);
        student.addRate(2);
        student.addRate(5);
        System.out.println(student);


//        SmartArray array = new SmartArray();
//        System.out.println(array);
//
//        array.add(1);
//        System.out.println(array);
//
//        array.add(2);
//        System.out.println(array);
//
//        array.add(3);
//        System.out.println(array);
//
//        array.add(50);
//        System.out.println(array);
//
//        array.add(100);
//        System.out.println(array);
//
//        int[] qwe = array.getArray();
//        qwe[0] = 345;
//        System.out.println(array);

    }
}

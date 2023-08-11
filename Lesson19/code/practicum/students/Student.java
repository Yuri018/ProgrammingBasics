package practicum.students;

import java.util.Arrays;

public class Student {
    private String name;
    private SmartArray array;

    public Student(String name) {
        this.name = name;
        array = new SmartArray();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rates=" + array +
                '}';
    }

    public void addRate(int rate){
        array.add(rate);
    }
}

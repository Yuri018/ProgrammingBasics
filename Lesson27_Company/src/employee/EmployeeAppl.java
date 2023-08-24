package employee;

import employee.model.Employee;
import employee.model.Manager;
import employee.model.SaleManager;
import employee.model.WageEmployee;

public class EmployeeAppl {
    public static void main(String[] args) {


        Employee emp1 = new Manager(1000, "John", "Smith", 160, 3000, 5);
//        Employee emp2 = emp1;
//        boolean check = emp1 == emp2; true
        Employee emp2 = new Manager(1000, "John", "Smith", 160, 3000, 5);
        boolean check = emp1 == emp2; // false
        System.out.println(check);
//        emp1.setFirstName("Johny");
//        System.out.println(emp1.getFirstName());
//        System.out.println(emp2.getFirstName());
        int[] arr1 = {1,2};
        int[] arr2 = {1,2};
        check = arr1.equals(arr2);
        System.out.println(check);

    }
}

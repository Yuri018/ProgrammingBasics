package employee;

import employee.model.Employee;
import employee.model.Manager;
import employee.model.SaleManager;
import employee.model.WageEmployee;

public class EmployeeAppl {
    public static void main(String[] args) {

        Employee[] employees = new Employee[6];
        employees[0] = new Manager(1000, "John", "Smith", 160, 3000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SaleManager(3000, "Peter", "Jackson", 160, 2000, 10);
        employees[3] = new SaleManager(4000, "Rabindranat", "Anand", 80, 3000, 10);
        printArray(employees);
        double total = totalSalary(employees);
        System.out.println("Total Salari = " + total);
        total = totalSale(employees);
        System.out.println("Total Sale = " + total);
    }

    private static double totalSale(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i] instanceof SaleManager){//проверка, что не null и что это SaleManager
                SaleManager sm = (SaleManager) employees[i];// Даункастинг
                sum+= sm.getSaleValue();
            }
        }
        return sum;
    }

    private static double totalSalary(Employee[] employees) {
        double sum = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                sum += employees[i].calcSalary();
            }
        }
        return sum;
    }

    private static void printArray(Object[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

}

package ait.employee.dao;



import ait.employee.model.Employee;
import ait.employee.model.SaleManager;

import java.util.function.Predicate;


public class CompanyImpl implements Company {

    private Employee[] employees;
    private int size;//текущее количество сотрудников

    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || employees.length == size || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees[size++] = employee;
//        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee temp = employees[i];
                employees[i] = employees[--size];
                employees[size] = null;
//                size--;
                return temp;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employees[i].calcSalary();
        }
        return sum;
    }
//      этот метод можно удалить, так как в интерфейсе добавлен дефолтный метод
//    @Override
//    public double avgSalary() {
//        return totalSalary() / size;
//    }

    @Override
    public double TotalSales() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i] instanceof SaleManager) {//проверка, что не null и что это SaleManager
                SaleManager sm = (SaleManager) employees[i];// Даункастинг
                sum += sm.getSaleValue();
            }
        }
        return sum;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        Predicate<Employee> predicate = new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getHours() >= hours;
            }
        };
        return findEmployeeByPredicate(predicate);
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        Predicate<Employee> predicate = new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.calcSalary() >= minSalary && employee.calcSalary() < maxSalary;
            }
        };
        return findEmployeeByPredicate(predicate);
    }

    private Employee[] findEmployeeByPredicate(Predicate<Employee>predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(employees[i])){
                count++;
            }
        }
        Employee[] res = new Employee[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(employees[i])){
                res[j] = employees[i];
                j++;
            }
        }
        return res;
    }
}
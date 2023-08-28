package employee.dao;

import employee.model.Employee;
import employee.model.SaleManager;


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
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee temp = employees[i];
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
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

    @Override
    public double avgSalary() {
        return totalSalary() / size;
    }

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
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() >= hours){
                count++;
            }
        }
        Employee[] res = new Employee[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (employees[i].getHours() >= hours){
                res[j] = employees[i];
                j++;
            }
        }
        return res;
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].calcSalary() >= minSalary && employees[i].calcSalary() < maxSalary){
                count++;
            }
        }
        Employee[] res = new Employee[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (employees[i].calcSalary() >= minSalary && employees[i].calcSalary() < maxSalary){
                res[j] = employees[i];
                j++;
            }
        }
        return res;
    }
}

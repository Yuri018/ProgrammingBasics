package ait.employee.dao;

import employee.model.Employee;

public interface Company {
    boolean addEmployee(Employee employee);//по умолчанию public abstract
    Employee removeEmployee(int id);
    Employee findEmployee(int id);
    int quantity();
    double totalSalary();
    default double avgSalary(){
        return totalSalary() / quantity();
    }
    double TotalSales();
    void printEmployees();

    Employee[] findEmployeesHoursGreaterThan(int hours);
    Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary);
}

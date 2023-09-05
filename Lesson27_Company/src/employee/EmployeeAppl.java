package employee;

import employee.dao.Company;
import employee.dao.CompanyArraysImpl;
import employee.model.Employee;
import employee.model.Manager;
import employee.model.SalesManager;
import employee.model.WageEmployee;

import java.util.Arrays;

public class EmployeeAppl {
    public static void main(String[] args) {

        Company company;
        Employee[] employees;

        company = new CompanyArraysImpl(5);
        employees = new Employee[4];
        employees[0] = new Manager(1000, "John", "Smith", 160, 3000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SalesManager(3000, "Peter", "Jackson", 160, 20000, 0.1);
        employees[3] = new SalesManager(4000, "Rabindranat", "Anand", 80, 30000, 0.1);

        for (Employee employee : employees) {
            company.addEmployee(employee);
        }

        Employee[] find = company.findEmployeesSalaryRange(2000, 2500);
        System.out.println(Arrays.toString(find));

        find = company.findEmployeesHoursGreaterThan(100);
        System.out.println(Arrays.toString(find));
    }
}

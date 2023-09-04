package ait.employee.test;



import ait.employee.dao.Company;
import ait.employee.dao.CompanyImpl;
import ait.employee.model.Employee;
import ait.employee.model.Manager;
import ait.employee.model.SaleManager;
import ait.employee.model.WageEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    Company company;
    Employee[] employees;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        employees = new Employee[4];
        employees[0] = new Manager(1000, "John", "Smith", 160, 3000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SaleManager(3000, "Peter", "Jackson", 160, 20000, 0.1);
        employees[3] = new SaleManager(4000, "Rabindranat", "Anand", 80, 30000, 0.1);

        for (Employee employee : employees) {
            company.addEmployee(employee);
        }
    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(employees[1]));
        Employee employee = new SaleManager(5000, "Rabindranat", "Anand", 80, 30000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.quantity());
        employee = new SaleManager(6000, "Rabindranat", "Anand", 80, 30000, 0.1);
        assertFalse(company.addEmployee(employee));
    }

    @Test
    void removeEmployee() {
        Employee employee = company.removeEmployee(3000);
        assertEquals(employees[2], employee);
        assertEquals(3, company.quantity());
        assertNull(company.removeEmployee(3000));
    }

    @Test
    void findEmployee() {
        Employee findEmployee = company.findEmployee(3000);
        assertEquals(findEmployee, company.findEmployee(3000));
        findEmployee = company.findEmployee(5000);
        assertNull(findEmployee);
    }

    @Test
    void quantity() {
        int quantity = employees.length;
        assertEquals(quantity, company.quantity());
    }

    @Test
    void totalSalary() {
        double totalSalary = 11200.0;
        assertEquals(totalSalary, company.totalSalary(), 0.01);
    }

    @Test
    void avgSalary() {
        double avgSalary = 2800.0;
        assertEquals(avgSalary, company.avgSalary());
    }

    @Test
    void totalSales() {
        double totalSales = employees[2].calcSalary() + employees[3].calcSalary();
        assertEquals(5000, totalSales);
    }

    @Test
    void printEmployees() {
        company.printEmployees();
    }

    @Test
    void findEmployeesHoursGreaterThan(){
        Employee[] actual = company.findEmployeesHoursGreaterThan(100);
        Employee[] expected = {employees[0], employees[1], employees[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeesSalaryRange(){
        Employee[] actual = company.findEmployeesSalaryRange(2000, 2500);
        Employee[] expected = {employees[1], employees[2]};
        assertArrayEquals(expected, actual);
    }
}
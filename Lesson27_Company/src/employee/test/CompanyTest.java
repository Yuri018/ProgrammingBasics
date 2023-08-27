package employee.test;


import employee.dao.Company;
import employee.dao.CompanyImpl;
import employee.model.Employee;
import employee.model.Manager;
import employee.model.SaleManager;
import employee.model.WageEmployee;
import org.junit.jupiter.api.BeforeEach;
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

        for (int i = 0; i < employees.length; i++) {
            company.addEmployee(employees[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(employees[1]));
        Employee employee = new SaleManager(5000, "Rabindranat", "Anand", 80, 30000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.quantity());
        employee = new SaleManager(6000, "Rabindranat", "Anand", 80, 30000, 0.1);
        assertFalse(company.addEmployee(employee));
    }

    @org.junit.jupiter.api.Test
    void removeEmployee() {
        company.removeEmployee(1000);
        assertEquals(3, company.quantity());
        Employee employee = company.removeEmployee(1000);
        assertEquals(employees[0], employee);
    }

    @org.junit.jupiter.api.Test
    void findEmployee() {
        Employee findEmployee = company.findEmployee(3000);
        assertEquals(findEmployee, company.findEmployee(3000));
    }

    @org.junit.jupiter.api.Test
    void quantity() {
        int quantity = employees.length;
        assertEquals(quantity, company.quantity());
    }

    @org.junit.jupiter.api.Test
    void totalSalary() {
        double totalSalary = 7710.0;
        assertEquals(totalSalary, company.totalSalary());
    }

    @org.junit.jupiter.api.Test
    void avgSalary() {
        double avgSalary = 1927.5;
        assertEquals(avgSalary, company.avgSalary());
    }

    @org.junit.jupiter.api.Test
    void totalSales() {
        double totalSales = employees[2].calcSalary() + employees[3].calcSalary();
        assertEquals(totalSales, company.TotalSales());
    }

    @org.junit.jupiter.api.Test
    void printEmployees() {
        company.printEmployees();
    }
}
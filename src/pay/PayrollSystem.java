package pay;

import java.util.ArrayList;
import java.util.Scanner;

import emp.Employee;

public class PayrollSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n====== Employee Payroll Management System ======");
            System.out.println("1. Add Employee");
            System.out.println("2. Generate Payslip");
            System.out.println("3. List All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> generatePayslip();
                case 3 -> listEmployees();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }

    private static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(id, name, department, salary);
        employees.add(emp);
        System.out.println("Employee added successfully.");
    }

    private static void generatePayslip() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.generatePayslip();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void listEmployees() {
        System.out.println("\nEmployee List:");
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName());
        }
    }
}


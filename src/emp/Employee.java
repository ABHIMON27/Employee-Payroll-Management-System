package emp;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double basicSalary;
    private double hra;
    private double da;
    private double tax;

    public Employee(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
        this.hra = 0.2 * basicSalary;
        this.da = 0.1 * basicSalary;
        this.tax = 0.05 * basicSalary;
    }

    public double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - tax;
    }

    public void generatePayslip() {
        System.out.println("----- Payslip -----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
        System.out.println("Tax: $" + tax);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
        System.out.println("Net Salary: $" + calculateNetSalary());
        System.out.println("-------------------");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


package task1;

import java.util.Scanner;

public class EmployeeSalaryCalculatorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        EmployeeSalary emp = new EmployeeSalary();

        double hra = emp.calculateHRA(basicSalary);
        double da = emp.calculateDA(basicSalary);
        double grossSalary = emp.calculateGrossSalary(basicSalary, hra, da);

        emp.displayEmployeeDetails(employeeId, employeeName,
                basicSalary, hra, da, grossSalary);

        sc.close();
    }}
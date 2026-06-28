package task1;

public class EmployeeSalary {

    public double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    public double calculateDA(double basicSalary) {
        return basicSalary * 0.15;
    }

    public double calculateGrossSalary(double basicSalary, double hra, double da) {
        return basicSalary + hra + da;
    }

    public void displayEmployeeDetails(int employeeId, String employeeName,
                                       double basicSalary, double hra,
                                       double da, double grossSalary) {

        System.out.println("\nEmployee Salary Report");
        System.out.println("--------------------------");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
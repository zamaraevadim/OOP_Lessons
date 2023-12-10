package Lesson6.SRP;

public class EmployeeSalaryCalculate {
    int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double calculateSalary(){
        return baseSalary * 1.5;
    }
}

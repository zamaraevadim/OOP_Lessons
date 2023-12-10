package Lesson6.SRP;
//S – Single Responsibility (Принцип единственной ответственности)
//Каждый класс должен отвечать только за одну операцию.

public class Employee {
    String name;
    String dol;

    public Employee(String name, String dol ) {
        this.name = name;
        this.dol = dol;

    }

}

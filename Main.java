import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(101, "John Doe", "Manager", 5000));
        employees.add(new Employee(102, "Alice Smith", "Developer", 4500));
        employees.add(new Employee(103, "Bob Johnson", "Analyst", 4800));
        employees.add(new Employee(104, "Emily Brown", "Designer", 4200));

        Collections.sort(employees, Comparator.comparing(Employee::getName));

        System.out.println("Sorted by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));

        System.out.println("\nSorted by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

import java.util.*;

public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary;
    }

    @Override
    public int compareTo(Employee e) {
        return name.compareTo(e.name);
    }
}
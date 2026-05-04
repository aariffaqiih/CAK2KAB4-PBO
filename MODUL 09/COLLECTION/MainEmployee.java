import java.util.*;
import java.util.stream.Collectors;

public class MainEmployee {
    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee("bobby", 3000));
        listEmp.add(new Employee("erick", 1600));
        listEmp.add(new Employee("rey", 2500));
        listEmp.add(new Employee("anna", 3500));

        // Sorting
        Collections.sort(listEmp);
        System.out.println("Sorted by name:");
        listEmp.forEach(System.out::println);

        Collections.sort(listEmp, new SalaryComparator());
        System.out.println("\nSorted by salary:");
        listEmp.forEach(System.out::println);

        // Filtering Minimal Salary 3000
        System.out.println("\nEmployee with salary minimal 3000:");
        listEmp.stream()
               .filter(e -> e.getSalary() >= 3000)
               .forEach(System.out::println);

        // Filtering Nama Erick
        System.out.println("\nSearch Employee 'erick':");
        Employee found = listEmp.stream()
                                .filter(e -> e.getName().equals("erick"))
                                .findFirst()
                                .orElse(null);
        System.out.println(found);
    }
}
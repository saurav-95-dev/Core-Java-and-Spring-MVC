import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    // Natural ordering: Sort by ID
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }
}

class EmployeeNameComparator implements Comparator<Employee> {
    // Custom sorting: Sort by name
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SortingExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "Charlie"));
        employees.add(new Employee(101, "Alice"));
        employees.add(new Employee(102, "Bob"));

        System.out.println("Original list: " + employees);

        // Sort using Comparable (natural ordering by ID)
        Collections.sort(employees);
        System.out.println("Sorted by ID (Comparable): " + employees);

        // Sort using Comparator (custom ordering by name)
        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println("Sorted by Name (Comparator): " + employees);

        // Sort using a lambda expression (Comparator)
        employees.sort(Comparator.comparingInt(e -> e.id));
        System.out.println("Sorted by ID (Lambda Comparator): " + employees);
    }
}

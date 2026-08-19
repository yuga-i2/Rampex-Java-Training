import java.util.*;

class Employee {

    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name +
                "', department='" + department +
                "', salary=" + salary + "}";
    }
}

public class HighestPaidEmployee {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101,"Arun","IT",45000),
                new Employee(102,"Bala","HR",55000),
                new Employee(103,"Kiran","IT",70000),
                new Employee(104,"Ajay","Sales",60000),
                new Employee(105,"Vignesh","HR",50000)
        );

        Employee emp = employees.stream()
                .max(Comparator.comparingInt(e -> e.salary))
                .get();

        System.out.println(emp);
    }
}
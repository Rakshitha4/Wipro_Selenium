package tasks.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Employee class with name and department
class Employee1 {
 String name;
 String department;

 Employee1(String name, String department) {
     this.name = name;
     this.department = department;
 }

 @Override
 public String toString() {
     return name;
 }
}

public class GroupByDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // List of employees
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "HR"),
            new Employee1("Bob", "IT"),
            new Employee1("Charlie", "Finance"),
            new Employee1("David", "IT"),
            new Employee1("Eva", "HR"),
            new Employee1("Frank", "Finance")
        );

        // Group by department using Collectors.groupingBy()
        Map<String, List<Employee1>> groupedByDept = employees.stream()
            .collect(Collectors.groupingBy(emp -> emp.department));

        // Print the grouped result
        groupedByDept.forEach((dept, empList) -> {
            System.out.println("Department: " + dept);
            System.out.println("Employees: " + empList);
            System.out.println();
        });

	}

}

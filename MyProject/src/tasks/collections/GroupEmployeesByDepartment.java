package tasks.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Employee class
class Employee {
	String name;
	String department;

 // Constructor
 public Employee(String name, String department) {
     this.name = name;
     this.department = department;
 }

 // toString for clean output
 @Override
 public String toString() {
     return name;
 }
}


public class GroupEmployeesByDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // List of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Charlie", "Finance"),
            new Employee("David", "IT"),
            new Employee("Eva", "HR"),
            new Employee("Frank", "Finance")
        );

        // Grouping map
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        // Group employees by department
        for (Employee emp : employees) {
            // If department not yet in map, add new list
            departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        // Print the grouped result
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            System.out.println("Employees: " + entry.getValue());
            System.out.println();
        }

	}

}

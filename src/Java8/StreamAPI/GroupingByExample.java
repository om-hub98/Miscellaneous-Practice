package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 5000),
                new Employee("Bob", "IT", 6000),
                new Employee("Charlie", "HR", 5000),
                new Employee("David", "IT", 6500)
        );

        Map<String, List<String>> resultDeptWiseNames = employees.stream()
                                                                .collect(
                                                                        Collectors.groupingBy(Employee::getDept,
                                                                            Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("GroupBy department : "+resultDeptWiseNames);

        Map<String, String> resultDeptEmployeeList = employees.stream()
                                                                     .collect(
                                                                        Collectors.groupingBy(Employee::getDept,
                                                                                Collectors.mapping(Employee::getName, Collectors.joining(","))));
        System.out.println("GroupBy department : "+resultDeptEmployeeList);

        Map<String, List<Double>> getDeptWiseSalary = employees.stream()
                                                            .collect(
                                                                Collectors.groupingBy(Employee::getDept,
                                                                  Collectors.mapping(Employee::getSalary, Collectors.toList())));
        System.out.println("GroupBy department : "+getDeptWiseSalary);
    }
}


class Employee {
    String name;
    String dept;
    double salary;

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


package Sorting.ObjectSorting.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1= new Employee("Amraj", 27,47599554);
        Employee emp2= new Employee("Niraj", 25,165465446);
        Employee emp3= new Employee("Suraj", 28,16548944);

        List<Employee> list = Arrays.asList(emp1, emp2, emp3);

        System.out.println(list);

        //Collections.sort(list);

        Collections.sort(list, new NameComparator());

        System.out.println("After sorting : "+list);
        System.out.println(list);
    }
}

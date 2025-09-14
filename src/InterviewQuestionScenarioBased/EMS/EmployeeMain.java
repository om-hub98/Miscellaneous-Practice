package InterviewQuestionScenarioBased.EMS;

import InterviewQuestionScenarioBased.EMS.entity.Employee;
import InterviewQuestionScenarioBased.EMS.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1=new Employee(1,"Omraj Pradhan","10/10/1236","SDE",10000);
        Employee emp2=new Employee(2,"Niraj Pradhan","11/05/5467","FA",50000);
        Employee emp3=new Employee(3,"Yuvaraj Pradhan","05/12/9874","SDE",20000);
        Employee emp4=new Employee(2,"Sujata Pradhan","11/05/5467","FA",50000);

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        EmployeeService employeeService=new EmployeeService(new Employee());
        employeeService.createEmployee(emp1);
        employeeService.createEmployee(emp2);

        Optional<Employee> employ = employeeService.getById(1);
        System.out.println("Employe with id 1 :"+employ.get());

        Optional<List<Employee>> employeeList = employeeService.getListEmployee();
        System.out.println("EmployeeList : "+employeeList.get());

       // employeeService.print();
        //Optional<Employee> employee=employeeService.getById(1);
        //if(employee.isPresent()){
          //  System.out.println(employee);
        //}

        //list.sort((a,b)->a.getEmpName().compareTo(b.getEmpName()));
        // ComparatorExample collection Sorting object
        // To compare two string compareTo()
        list.sort((a,b)->{
               if(a.getSalary()-b.getSalary() > 0) return 1;
               else if(a.getSalary()-b.getSalary() < 0) return -1;
               else return a.getEmpName().compareTo(b.getEmpName());
        });
        for(Employee emp: list){
            System.out.println(emp);
        }
    }
}

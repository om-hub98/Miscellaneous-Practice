package InterviewQuestionScenarioBased.EMS.service;

import InterviewQuestionScenarioBased.EMS.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeService {
    private Employee employee;
    private List<Employee> employeeList;

    public EmployeeService(Employee employee){
        this.employee=employee;
        this.employeeList=new ArrayList<>();
    }
    public void createEmployee(Employee employee){
        employeeList.add(employee);
    }
    public Optional<Employee> getById(Integer employeeId) {
        for (Employee emp : employeeList) {
            if (emp.getEmpId().equals(employeeId)) {
                return Optional.of(emp);
            }
        }
        return Optional.empty();
    }

    public Optional<List<Employee>> getListEmployee(){
        if(!employeeList.isEmpty()){
            return Optional.of(employeeList);
        }
        return Optional.empty();
    }
    public void print(){
        employeeList.forEach(emplist -> System.out.println(emplist));
    }

}

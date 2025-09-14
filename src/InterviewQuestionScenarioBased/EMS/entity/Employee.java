package InterviewQuestionScenarioBased.EMS.entity;

public class Employee {
    private Integer empId;
    private String empName;
    private String dob;
    private String designation;
    private Integer salary;

    public Employee() {  }

    public Employee(Integer empId, String empName, String dob, String designation, Integer salary) {
        this.empId = empId;
        this.empName = empName;
        this.dob = dob;
        this.designation = designation;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", dob=" + dob +
                ", designation='" + designation + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

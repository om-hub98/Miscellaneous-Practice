package OOP.ToStringImpl;

/**
 * @author omraj
 */
   /*toString -> It is an method of Object class and every class must override this method to get your desired result
           else it will print @hascode in hexadeciaml format
*/
public class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1,"Omraj",26);
        System.out.println(emp);
    }
}

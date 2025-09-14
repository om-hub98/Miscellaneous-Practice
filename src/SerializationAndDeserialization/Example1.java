package SerializationAndDeserialization;

import java.io.*;

class Employee implements Serializable{
    private int id;
    private String name;
    private int age;
    transient private int salary;
    static private String department;

    public Employee(int id, String name, int age, int salary, String department){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.department=department;

    }
    public int getId(){return id;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public void setSalary(int salary){this.salary=salary;}
    public int getSalary(){return salary;}
    public String getDepartment(){return department;}
    public void setDepartment(String department){this.department=department;}
}
public class Example1 {
    public static void printData(Employee emp){
        System.out.println("Id : "+emp.getId());
        System.out.println("Name : "+emp.getName());
        System.out.println("Age : "+emp.getAge());
        System.out.println("Salary : "+emp.getSalary());
        System.out.println("Department : "+emp.getDepartment());

    }
    public static void main(String[] args) {
        Employee emp = new Employee(101,"Omraj", 26, 2000, "Developer");
        String fileName = "serialized.txt";

        //Serialization
        try{
            //Saving object in a file
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(emp);
            out.close();
            file.close();
            System.out.println("Object has been serialized\nData before Deserialization.");
            printData(emp);

            //change static variable
            //emp.setSalary(300000);
            emp.setDepartment("Tester");
        }catch(IOException ex){
            System.out.println("IOException occurred while serialization");
        }

        emp=null;

        // Deserialization
        try{
            //Reading object from file
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);
            emp = (Employee) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized\nData after Deserialization.");
            printData(emp);

        } catch (IOException e) {
            System.out.println("IOException occurred while deserialization");
        }catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException occurred");
        }
    }
}

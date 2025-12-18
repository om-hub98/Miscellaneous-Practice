package DesignPattern.Creational.Prototype;

public class Client {
    public static void main(String[] args) {

        Student stu = new Student(1,"Omraj",28);
        System.out.println(stu);

        stu.setName("Niraj");

        Student stu2 = stu;
        System.out.println(stu2);
        System.out.println(stu2 == stu);   //  stu2 => is just a copy of stu obj, stu2 & stu referred to same object

        Student cloneObj = stu.cloneStudent();
        System.out.println(cloneObj);
        System.out.println(cloneObj == stu);   // false => cloneObj is new Student object
    }
}

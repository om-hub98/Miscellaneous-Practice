package OOP.Inheritance;
/**
Inheritance
   Points to remember :
     1) Only class to class or interface  to interface can be in Inheritance relationship
 */

class Parent {
    void run(){
        System.out.println("Parent can run..");
    }
    void walk(){
        System.out.println("Parent walk...");
    }
}
class Child extends Parent{

    @Override
    void run() {
        System.out.println("Child is running..");
    }
}

public class InheritanceExample{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.walk();
        parent.run();

        Child child = new Child();
        child.run();

    }
}

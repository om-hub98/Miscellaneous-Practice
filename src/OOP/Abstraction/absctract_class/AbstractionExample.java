package OOP.Abstraction.absctract_class;
/**
 Inheritance & Abstraction Example
 Points to remember :
 1) Abstract class does not provide 100% abstraction
 2) Only class to class or interface  to interface can be in Inheritance relationship
 3) Abstract class can instantiate with an anonymous class
 */

abstract class Parent {
    abstract void run();
    void walk(){
        System.out.println("Parent walk...");
    }
}
class Child extends Parent {

    @Override
    void run() {
        System.out.println("Child is running..");
    }
}

public class AbstractionExample{
    public static void main(String[] args) {
        Parent parent = new Parent() {
            @Override
            void run() {
                System.out.println("Parent can run..");
            }
        };
        parent.walk();
        parent.run();

        Child child = new Child();
        child.run();

    }
}

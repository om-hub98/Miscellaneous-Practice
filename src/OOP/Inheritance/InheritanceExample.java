package OOP.Inheritance;
/**
Inheritance
   Points to remember :
     1) Only class to class or interface  to interface can be in Inheritance relationship
 */

class Parent {
    int a = 10;
    void run(){
        System.out.println("Parent can run..");
    }
    void walk(){
        System.out.println("Parent walk...");
    }
}
class Child extends Parent{

    int a=20;
    @Override
    void run() {
        System.out.println("Child is running..");
    }

    void showVariables(){
        System.out.println("Child Variables : "+a);
        super.a=50;
        System.out.println("Parent Variables : "+super.a);
    }
}

public class InheritanceExample{
    public static void main(String[] args) {
        Parent parent = new Parent();
        //parent.walk();
        //parent.run();

        Child child = new Child();
        child.run();
        child.showVariables();

    }
}

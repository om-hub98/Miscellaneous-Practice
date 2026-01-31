package OOP.Inheritance.StaticMethods;

public class Dog extends Animal{
    /* Child cannot inherit Static methods of parent class
    @Override
    void eat() {
        System.out.println("Dog eat...");
    }
    */

    @Override
    void sound() {
        System.out.println("Dog can bark...");
    }

    @Override
    protected void dance() {
        super.dance();
    }
}

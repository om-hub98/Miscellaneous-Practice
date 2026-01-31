package OOP.Inheritance.StaticMethods;

public class AnimalApp {
    public static void main(String[] args) {

        Animal.eat();   // Static method's can be accessed directly by class
        Animal a1 = new Animal();
        a1.sound();

        Dog d1 = new Dog();
        d1.sound();

        // Jiska object uska method.
        // Dynamic dispatch object creation
        Animal ad1 = new Dog();
        ad1.sound();
    }
}

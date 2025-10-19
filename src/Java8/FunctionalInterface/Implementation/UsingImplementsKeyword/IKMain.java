package Java8.FunctionalInterface.Implementation.UsingImplementsKeyword;

import Java8.FunctionalInterface.Implementation.Bird;

public class IKMain {
    public static void main(String[] args) {
        Bird bird = new BirdImpl();
        bird.canFly("vertical");
    }
}

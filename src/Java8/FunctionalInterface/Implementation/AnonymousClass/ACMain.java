package Java8.FunctionalInterface.Implementation.AnonymousClass;

import Java8.FunctionalInterface.Implementation.Bird;

public class ACMain {
    public static void main(String[] args) {
        Bird bird = new Bird() {
            @Override
            public void canFly(String value) {
                System.out.println("Can Fly from Anonymous Class : "+value);
            }
        };
        bird.canFly("horizontal");
    }
}

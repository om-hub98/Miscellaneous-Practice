package Java8.FunctionalInterface.Implementation.LambdaExpression;

import Java8.FunctionalInterface.Implementation.Bird;

public class LEMain {
    public static void main(String[] args) {
        Bird bird = (String value) -> System.out.println("Can fly from Lambda Expression : "+value);
        bird.canFly("Straight");
    }
}

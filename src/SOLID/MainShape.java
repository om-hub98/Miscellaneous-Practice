package SOLID;

public class MainShape {
    public static void main(String[] args) {

        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        double areaOfCircle = areaCalculator.areaOfCircle(circle);
        System.out.println("Area of Circle : "+areaOfCircle);
        Square square = new Square(5);
        double areaOfSquare = areaCalculator.areaOfSquare(square);
        System.out.println("Area of Square : "+areaOfSquare);
        System.out.println(circle instanceof Circle);
    }
}

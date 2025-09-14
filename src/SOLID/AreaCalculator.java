package SOLID;

public class AreaCalculator {

    public double areaOfCircle(Circle circle){
       double radius = circle.getRadius();
        double area = Math.PI*Math.pow(radius,2.0);
        return area;
    }
    public double areaOfSquare(Square square){
        double side = square.getSide();
        double area = Math.pow(side,2.0);
        return area;
    }
}

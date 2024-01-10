package jan9.shape;

public class Triangle implements Shape{
    private double side;

    @Override
    public double perimeter() {
        return 3 * side;
    }

    @Override
    public double area() {
        return 0;
    }
}

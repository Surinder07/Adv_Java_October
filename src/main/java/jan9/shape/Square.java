package jan9.shape;

public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

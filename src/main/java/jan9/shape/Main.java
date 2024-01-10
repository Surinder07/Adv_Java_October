package jan9.shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 20);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());


        Shape pentagon = new Shape() {
            @Override
            public double area() {
                return 12.0;
            }

            @Override
            public double perimeter() {
                return Shape.super.perimeter();
            }
        };

    }
}

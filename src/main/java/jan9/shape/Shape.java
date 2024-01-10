package jan9.shape;

@FunctionalInterface
public interface Shape {
    double area();
    default double perimeter(){
        return 10.0;
    }
}



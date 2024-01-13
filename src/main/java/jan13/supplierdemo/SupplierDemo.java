package jan13.supplierdemo;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        /*
        @FunctionalInterface
public interface Supplier<T> {

        T get();
    }
         */

        Supplier<String> supplier = () -> "Hello, World!";
        String s = supplier.get();
        System.out.println(s.toLowerCase());

        Supplier<Double> random = () -> Math.random();
        Double randomNumbers = random.get();
        System.out.println(randomNumbers);



    }
}

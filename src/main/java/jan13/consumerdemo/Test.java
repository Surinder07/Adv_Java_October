package jan13.consumerdemo;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {

        // void accept(T t);
        Consumer<String> cons = (s) -> s.toLowerCase();
        cons.accept("PRAGRA");

        BiConsumer<String, String> biConsumer = (x,y) -> {
            System.out.println(y);
            System.out.println(x);
        };
        biConsumer.accept("pragra","class");


    }




}

package jan13.functionDemo;

import java.util.function.Function;

public class FunctionalDemo {
    public static void main(String[] args) {
        /*
        public interface Function<T, R> {

        R apply(T t);
         */


        Function<String, String> func = (s) ->  s.toLowerCase();
        String result = func.apply("");
        if(result.length() <=0){
            System.out.println("you can not pass empty name ");
        }
        System.out.println(result);


    }


      // (a) ->  a.length();
    // String   --->  Integer
}

package jan13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

       /* int s = 10;
        if(s % 2 ==0){
            System.out.println("s is even");
        }*/
        Predicate<Integer> div2 = (s) -> s % 2 ==0; // 20/2 ---> 0

        Predicate<Integer> div3 = (s) -> s % 3 ==0; // 18 / 3  --> 2

        /* &&  T   T  --T
                      --F
                      && || !
         */

        // and
        boolean result = div2.and(div3).test(18);
        System.out.println(result);

        // or
        boolean result2 = div2.or(div3).test(20);
        System.out.println(result2);

        // negate
        boolean result3 = div2.negate().test(10); // true
        System.out.println("Not method");
        System.out.println(result3);

        // BiPredicate

        int age = 55;
        if(age> 18 && age < 60){
            System.out.println("You are allowed to go to gym ");
        }

       // BiPredicate

        BiPredicate<Integer, Integer> biPredicate = (a,b)  -> a > 18 || a < 60;
        System.out.println(biPredicate.test(10, 50));


        Predicate<String> stringDemo = (str) -> str.length() >10;
        System.out.println(stringDemo.test("I am learning Java"));

    }
}




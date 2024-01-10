package jan9.funcinf;

import java.util.function.Predicate;

public class FunctionalInfDemo {
    public static void main(String[] args) {

     // Predicate

        Predicate<Integer> predicate = (i) -> i%2 == 0;
        boolean test = predicate.test(11);

        if(test == true){
            System.out.println("number is even");
        }else {
            System.out.println("Number is odd");
        }

        // check if the length of given string is greater than 8
        // String input = "TestmeHere" ;

        // Fastest finger first.
        /*
        1. Sukhjeet - first Quiz
        2. rajan, Sukhjeet, Aneeta - Tie among 3

         */
        // Streams api in Java 8
    }
}

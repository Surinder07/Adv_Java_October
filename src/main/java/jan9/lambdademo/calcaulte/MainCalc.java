package jan9.lambdademo.calcaulte;

public class MainCalc {
    public static void main(String[] args) {
        /*
        public interface Calculator {
          double calculate(double a, double b);
}
         */

        Calculator addition = (num1, num2) ->  num1 + num2;
        System.out.println(addition.calculate(10, 20));

        /*
        Please implement the same for division, multiplication and sub
        10 mins.

  1. create a interface , with method :
  String apply(String input);

  user to enter a string :
  lambdas --- 1. to uppercase
  2. lowercase


         */
    }
}

package jan9.lambdademo;

public class TestAnimal {
    public static void main(String[] args) {
        // implemented class
       /* Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("Dog is eating.. ");
            }
        };*/

         // Animal animal = () -> System.out.println("Animal is eating..");
          callAnimal(() -> System.out.println("Animal is eating.."));
    }
    public static void callAnimal(Animal animal){
        System.out.println("Animal... ");
    }
}
@FunctionalInterface
interface Animal{
    void eat();
}
//class Dog implements Animal{
//    @Override
//    public void eat() {
//        System.out.println("dog is eating...");
//    }
//}

// 1. implemented class
// 2. Anonymous class


/*
create lambda for the following functional interface
interface Test {
    void test();
}
interface Vehicle {
    void run();
}
interface Mobile {
    void call(int phone);
}

interface Calculator {
    Double calcualte(double a, double b);
}
interface Computer {
    void surfInternet();
}

interface Greeting {
    String greet(String greet);
}
*/












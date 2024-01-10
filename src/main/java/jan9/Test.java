package jan9;

public class Test {
    public static void main(String[] args) {

    }
}

@FunctionalInterface
interface Student{
     void study();

     static void run(){
         System.out.println("Implemented static method");
     }
     default void sleep(){
         System.out.println("Default implementation in interface student");
     }
}

// it should have one and only 1 abstract method
// methods ? --- public and abstract
// fields --- > public static final

// funtional interfaces -- implement the functional programming
// Java 8 and above
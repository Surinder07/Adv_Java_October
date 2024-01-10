package jan6.functinf;

@FunctionalInterface
public interface Mobile {
    void call();

    // public protected private
    default void show(){
        System.out.println("Default show method ");
    }

    static void test(){

    }
}

// single abstract method - SAM
// SPA - Single page application react, angular, vue
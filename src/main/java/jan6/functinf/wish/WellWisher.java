package jan6.functinf.wish;

public class WellWisher {
    public static void main(String[] args) {
        Greeting englishGreeting = new EnglishGreeting();
       // englishGreeting.greet();
        greetMe(englishGreeting);

       greetMe(() -> System.out.println("Ola!"));





   /*     // Annoymous class ?
        Greeting frenchGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Bonjour!");
            }
        };
        frenchGreeting.greet();
    }*/

        // Annoymous class ?
        Greeting frenchGreeting = () -> System.out.println("Bonjour!");



        frenchGreeting.greet();
    }

    public static void greetMe(Greeting greeting){
        greeting.greet();
    }
}

// 1. implement an interface with class
// 2. annoymous class

//   functional interface - Bank ---> saving()
//  create lambda for it
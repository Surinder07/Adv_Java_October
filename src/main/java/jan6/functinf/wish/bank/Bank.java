package jan6.functinf.wish.bank;

public interface Bank {
    void savings();
}

class Main{
    public static void main(String[] args) {

        // () -> {sout("Savings...")}
        savingInBank(() -> System.out.println("more savings.. "));
    }

    public static void savingInBank(Bank bank){
        System.out.println("Savings...");
    }
}

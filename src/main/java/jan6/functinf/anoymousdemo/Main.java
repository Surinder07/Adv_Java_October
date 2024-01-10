package jan6.functinf.anoymousdemo;

public class Main {
    public static void main(String[] args) {

        // Annoymous classes
        Vehicle vehicle = new Vehicle() {
            @Override
            public void run() {
                System.out.println("car is running.. ");
            }
            @Override
            public void brake() {
                System.out.println("brake....");
            }
        };

        vehicle.brake();
        vehicle.run();

    }
}

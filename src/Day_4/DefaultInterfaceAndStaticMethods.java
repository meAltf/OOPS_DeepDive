package Day_4;

interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle about to stop...");
    }

    static void info() {
        System.out.println("Vehicles have engines...");
    }
}

class Bmw implements Vehicle {

    @Override
    public void start() {
        System.out.println("BMW my favorite..");
    }

    @Override
    public void stop() {
        Vehicle.super.stop();
    }
}

public class DefaultInterfaceAndStaticMethods {
}

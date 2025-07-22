package Day_4;

interface Flyable {
    void fly(); // implicitly public and abstract
}

class Birds implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        System.out.println("Example to show how can we implement interface and needs to override method");
    }
}

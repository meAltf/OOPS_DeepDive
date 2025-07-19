package Day_1;

/* Car | Class */
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("The car is driving!!!");
    }
}

public class DemoMain {

    public static void main(String[] args) {
        /* instance of Class car, object car */
        Car car = new Car();
        car.color = "Black";
        car.speed = 340;

        car.drive();
        System.out.println("Color " + car.color + " And " + "speed is " + car.speed);

    }

}

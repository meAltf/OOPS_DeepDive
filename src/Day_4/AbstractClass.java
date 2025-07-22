package Day_4;

abstract class Animal {
    abstract void makeSound(); // Abstract method should not have body

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks...");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        animal.sleep();
    }
}

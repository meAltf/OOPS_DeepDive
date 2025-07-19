package Day_2;


class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Dog Inherited from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks!");
    }
}

public class DemoInheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.eat(); // Inherited method
        System.out.println("Hope you understand inheritance concepts!");
    }
}

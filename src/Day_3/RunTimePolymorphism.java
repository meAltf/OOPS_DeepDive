package Day_3;

class Animal {
    void sound() {
        System.out.println("Animal makes sound!");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks!");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows!");
    }
}

public class RunTimePolymorphism {

    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Upcasting
        Animal animal2 = new Cat();

        animal1.sound(); // Dog
        animal2.sound(); // Cat

        /* InstanceOf() example */
        if (animal1 instanceof Dog) {
            System.out.println("animal1 is instance of Animal class");
        }
    }


}

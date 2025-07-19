package Day_2;

class AnimalMO {
    void makeSound() {
        System.out.println("Some animal sounds..");
    }
}

// Inherited and use method overriding
class Cat extends AnimalMO {

    @Override
    void makeSound() {
        System.out.println("Meow!!!!");
    }
}

public class DemoMethodOverriding {

    public static void main(String[] args) {

        AnimalMO cat = new AnimalMO();
        cat.makeSound();
    }
}

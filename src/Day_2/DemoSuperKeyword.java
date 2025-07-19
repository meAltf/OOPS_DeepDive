package Day_2;

class AnimalSuperKeyword {
    void display() {
        System.out.println("I am an animal");
    }
}

class Tiger extends AnimalSuperKeyword {
    void display() {
        super.display(); // call's animal already
        System.out.println("I am a dog");
    }
}

public class DemoSuperKeyword {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.display();
    }
}

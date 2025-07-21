package Day_3;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphism {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Integer sum of two " + calculator.add(2, 5));
        System.out.println("Double sum of two " + calculator.add(2.8, 5.6));
        System.out.println("Integer sum of three " + calculator.add(2, 5, 9));
    }
}

package Day_5;

// Violation
class DiscountCalculator {
    double calculate(String type) {
        if (type.equals("FESTIVE")) return 0.5;
        else return 0.2;
    }
}

// Correct way to do
interface DiscountStrategy {
    double getDiscount();
}

class FestiveDiscount implements DiscountStrategy {
    public double getDiscount() { return 0.5; }
}

class RegularDiscount implements DiscountStrategy {
    public double getDiscount() { return 0.2; }
}

public class DemoOCP {
}

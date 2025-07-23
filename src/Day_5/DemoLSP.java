package Day_5;

// Violation
class Bird {
    void fly() {}
}

class Ostrich extends Bird {
    void fly() { throw new UnsupportedOperationException(); }
}

// Correct way to do | Split the hierarchy

class BirdFix {}

class FlyingBird extends Bird {
    void fly() {}
}
class OstrichFix extends Bird {}


public class DemoLSP {
}

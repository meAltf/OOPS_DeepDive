package Day_5;

// Violation | Bad interface

interface Machine {
    void print();

    void scan();

    void fax();
}

class Printer implements Machine {
    public void print() {
    }

    public void scan() {
    } // unnecessary

    public void fax() {
    }  // unnecessary
}

// Correct way to do so..
interface PrinterFix {
    void print();
}

interface Scanner {
    void scan();
}

public class DemoISP {
}

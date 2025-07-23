package Day_5;

// Violation
class Report {
    void generate() {}
    void saveToFile() {} // file handling - extra responsibility
}

// Correct way
class ReportFix {
    void generate() {}
}

class FileSaver {
    void saveToFile(Report r) {}
}

public class DemoSRP {
}

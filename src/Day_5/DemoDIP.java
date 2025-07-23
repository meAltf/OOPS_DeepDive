package Day_5;

// Violation
class MySQLDatabase {
    void connect() {
    }
}

class OrderService {
    MySQLDatabase db = new MySQLDatabase();
}


// Correct way to do..
interface Database {
    void connect();
}

class MySQLDatabasefix implements Database {
    public void connect() {
    }
}

class OrderServiceFix {
    Database db;

    OrderServiceFix(Database db) {
        this.db = db;
    }
}

public class DemoDIP {
}

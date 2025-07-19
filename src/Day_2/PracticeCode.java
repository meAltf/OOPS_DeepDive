package Day_2;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("name: " + name + " Age: " + age);
    }
}

class Employee extends Person {
    double salary;
    String designation;

    Employee(String name, int age, double salary, String designation) {
        super(name, age); // calling person constructor
        this.salary = salary;
        this.designation = designation;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("salary: " + salary + " designation: " + designation);
    }

}

public class PracticeCode {

    public static void main(String[] args) {
        Employee employee = new Employee("Robert", 23, 350000.00, "Data Scientist");
        employee.displayInfo();
    }
}

package constructor;

public class Student {

    // Constructor 1: No arguments
    Student() {
        this("Aman");  // Calls Constructor 2
        System.out.println("Constructor 1: No-arg constructor");
    }

    // Constructor 2: One String argument
    Student(String name) {
        this(name, 20);  // Calls Constructor 3
        System.out.println("Constructor 2: Name = " + name);
    }

    // Constructor 3: String and int arguments
    Student(String name, int age) {
        System.out.println("Constructor 3: Name = " + name + ", Age = " + age);
    }

    public static void main(String[] args) {
        // Creating object using default (no-arg) constructor
        Student s = new Student();
    }
}



package constructor;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }
}

public class StudentPrivate{
    public static void main(String[] args) {
        Student s1 = new Student("Amresh");

        System.out.println("Accessing private variable from another class:");
        System.out.println("name: " + s1.getname());
    }
}

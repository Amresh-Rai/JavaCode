package constructor;

public class Amresh {

    String name;
    int age;

    Amresh() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Name"+name+", age="+age);
    }
    Amresh(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name="+name+",age="+age);
    }

    
    Amresh(Amresh obj) {
        this.name = obj.name;
        this.age = obj.age;
        System.out.println("Name="+name+", age"+age);
    }
    void fun() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Amresh obj1 = new Amresh(); 
        obj1.fun();

        Amresh obj2 = new Amresh("Amresh", 21); 
        obj2.fun();

        Amresh obj3 = new Amresh(obj2); 
        obj3.fun();
    }
}


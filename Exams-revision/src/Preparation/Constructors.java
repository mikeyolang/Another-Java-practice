package Preparation;

/* Constructors are of two types
     -Default - No parameters
     -Parameterized
 */
public class Constructors {
    String name;
    int id;
    int age;

    Constructors(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Constructors(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    void display() {
//        System.out.println("Parameterized Constructor Formed\n");
        System.out.println("Name =" + name + "\n " + "ID= " + id + "\n" + "Age =" + age);
    }

}

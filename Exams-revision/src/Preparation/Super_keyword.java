package Preparation;

public class Super_keyword {
    protected String name;
    protected int age;

    public Super_keyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name:" + name + "\n " + " Age:" + age);

    }
}

class Person extends Super_keyword {
     private int marks;

    public Person(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }
    void print(){
        System.out.println("\nName: "+name+" "+"Age: "+age+ " "+"Marks: "+marks);
    }
}

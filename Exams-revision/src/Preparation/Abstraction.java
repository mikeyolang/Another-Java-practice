package Preparation;

//Improve code structure by making it less complex and more scalable.
abstract class Abstraction {
    public abstract void printSound();  //Abstract method

    //Regular Method
    public void displayInfo() {
        System.out.println("I am an abstract class");
    }
}

class Dog extends Abstraction {
    //Implementing Abstract Method
    public void printSound() {
        System.out.println("\nDog barks");
    }
}

class Cat extends Abstraction {
    public void printSound() {
        System.out.println("Cat meows\n");

    }
}
class Monkey extends Abstraction{
    public void printSound(){
        System.out.println("Monkeys whoop");
    }
}

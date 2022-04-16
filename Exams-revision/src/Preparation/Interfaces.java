package Preparation;

interface Interfaces {
    int getServiceTime();

}

class Car implements Interfaces {
    //Implementing abstract method
    public int getServiceTime() {
        return 2;
    }
}

class Bike implements Interfaces {
    public int getServiceTime() {
        return 3;
    }
}
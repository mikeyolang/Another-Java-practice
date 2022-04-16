package Preparation;

//HAS-A relationship
public class Aggregation {
    String city, state, country;

    public Aggregation(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee {
    int id;
    String name;
    Aggregation address;
    public Employee(int id, String name , Aggregation address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Name: "+ name+ " \n" +"id: " + id );
        System.out.println("Address: "+address.city+" " +address.state+ " "+ address.country );
    }
}

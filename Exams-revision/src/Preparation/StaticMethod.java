package Preparation;

public class StaticMethod {
    int rollno;
    String nile;
    static String inst = "TUK";

    //    Static method to change the value static variable
    static void change() {
        inst = "University";
    }

    //    Constructor to initialize the variable
    StaticMethod(int rollno, String nile) {
        this.rollno = rollno;
        this.nile = nile;
    }

    void display() {
        System.out.println(rollno + " " + nile + " " + inst);
    }

    static int cube(int x) {
        return x * x * x;
    }

    void three() {
        int result = StaticMethod.cube(3);

        System.out.println("\n" + " cubed = " + result);
    }
}

package class_and_projects;

import java.util.Date;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        // write your code here
//        System.out.println("Hello world");
//        SimpleCircle c1 = new SimpleCircle();
//        System.out.println("The Area of a circle With radius " + c1.radius + "\tis " + c1.getArea());
//        SimpleCircle c2 = new SimpleCircle(25);
//        System.out.println("The Area of a circle with radius " + c2.radius + "\tis " + c2.getArea());
//        SimpleCircle c3 = new SimpleCircle(125);
//        System.out.println("The Area of a circle with radius " + c3.radius + "\tis " + c3.getArea());
////        Changing radius
//        c2.radius = 100;
//        System.out.println("The Area of a circle with radius " + c2.radius + "\tis " + c2.getArea());
//
//        java.util.Date date = new Date();
//
////        System.out.println(date.getTime());
//        System.out.println(date.toString());
//
//        Random r1 = new Random(4);
//        System.out.println("From random 1: ");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(r1.nextInt(1000) + " ");
//        }
//        ImmutableClass im = new ImmutableClass(11111, "Mikey");
//        java.util.Date dateCreated = new Date();
//        dateCreated.setTime(2000);
        Loan ln = new Loan();
        ln.input();
        ln.getMonthlyPayment();
        ln.getTotalPay();



    }
}
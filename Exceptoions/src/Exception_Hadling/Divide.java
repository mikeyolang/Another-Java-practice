package Exception_Hadling;

import java.util.Scanner;

public class Divide {
    Scanner sc = new Scanner(System.in);

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {

            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1 / number2;
    }

    void display() {
        System.out.println("Enter two Integers\n");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
//        If an arithmetic Exception occurs
        try {
            int result = quotient(num1, num2);
            System.out.println(num1 + "/" + num2 + " is equal to" + result);

        }
        catch (ArithmeticException ex){
            System.out.println("Exception: An integer can not be divided by 0");
        }
        System.out.println("Execution continues......");


    }
}

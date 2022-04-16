package Exception_Hadling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputing {
    boolean continueInput = true;
    Scanner sc = new Scanner(System.in);

 void error(){
     do {
         try {
             System.out.println("Enter an Integer\n");
             int number = sc.nextInt();
             System.out.println("The number entered is " + number + "\n");
             continueInput = false;
         }
         catch (InputMismatchException ex) {
             System.out.println("Try again (Incorrect Input: An integer is required)");
             sc.nextLine();  //Discarding the input
         }
     }
     while (continueInput);
 }

}

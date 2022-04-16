package Preparation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
  Scanner sc = new Scanner(System.in);
     int n;
     float a;
     double b;
     long c;
     short e;
     String single;
     String line;
     Boolean bool;
     char input;
     void display(){
         System.out.println("We are now working on User input of various data types\n");
         System.out.println("Reading an Integer\n");
         n=sc.nextInt();
         System.out.println(n);
         System.out.println("Reading a float\n");
         a=sc.nextFloat();
         System.out.println(a);
         System.out.println("Reading an double\n");
         b=sc.nextDouble();
         System.out.println(b);
         System.out.println("Reading a long\n");
         c=sc.nextLong();
         System.out.println(c);
         System.out.println("Reading an short\n");
         e=sc.nextShort();
         System.out.println(e);

         System.out.println("Reading a word\n");
         single=sc.next();
         System.out.println(single);
         System.out.println("Reading a sentence \n");
         line=sc.nextLine();
         System.out.println(line);
         System.out.println("Reading a character\n");
         input=sc.next().charAt(0);
         System.out.println(input);

     }
}

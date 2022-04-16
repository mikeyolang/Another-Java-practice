import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");
        System.out.println("Enter a Url\n");
        Scanner sc = new Scanner(System.in);
        String Url = sc.next();
        try {
            java.net.URL = new java.net.URL(Url);
        }
        

    }
}
package Exception_Hadling;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("HELLO THERE !\n");
        Divide div = new Divide();
        div.display();
        Inputing in = new Inputing();
        in.error();

        try {
            CircleException c1 = new CircleException(5);
            CircleException c2 = new CircleException(-5);
            CircleException c3 = new CircleException(0);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
        System.out.println("Number of objects created : "+CircleException.getNumberOfObjects());
    }
}

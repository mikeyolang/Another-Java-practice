package Preparation;
//Usage of the "this" keyword
public class This_keyword {
    int marks;
    String unit;
    This_keyword(String unit,int marks){
        this.unit = unit;
        this.marks  = marks;
    }
    void m(){
        System.out.println("This keyword to invoke current class method\n");
        System.out.println(unit + " " + marks);
    }
    void n(){
        System.out.println("Hello n function");
        this.m();
    }
}

package Preparation;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Logger L = new Logger();
        L.display();
        Constructors C = new Constructors("Mike", 23, 21);
        C.display();
        Constructors A = new Constructors("Quin", 44, 108);
        A.display();
        Constructors B = new Constructors("Kelly", 23, 34);
        B.display();
        StaticKeyWord S = new StaticKeyWord(30, "Egerton");
        S.display();
        StaticMethod M = new StaticMethod(24, "Jameni");
        M.display();
        M.three();
        StaticBlock K = new StaticBlock();
        This_keyword T = new This_keyword("Chemistr", 45);
        T.n();
        Input in = new Input();
        in.display();
        Student st = new Student();
        st.setStudentDetails("Mike",20,84);
        st.setStudentDetails("John",21,90);
        st.getStudentDetails();
        Teacher tc = new Teacher();
        tc.setTeacherDetails("Monica",30,34000);
        tc.setTeacherDetails("Wanjala",40,45000);
        tc.getTeacherDetails();
        Aggregation add1 = new Aggregation("Kisumu","Kisumu","Kenya");
        Aggregation add2 = new Aggregation("Njoro","Nakuru","Kenya");
        Employee emp1 = new Employee(11234,"Mike",add1);
        Employee emp2 = new Employee(367899,"Quinn",add2);
        emp1.display();
        emp2.display();
        Super_keyword sup = new Super_keyword("Mystical",23);
        sup.display();
        Person per = new Person("Man",39,400);
        per.print();
        Dog dg = new Dog();
        dg.printSound();
        dg.displayInfo();
        Monkey mon = new Monkey();
        mon.printSound();
        Cat ct = new Cat();
        ct.printSound();
        Car cr = new Car();
        Bike bk = new Bike();
        System.out.println(cr.getServiceTime());
        System.out.println(bk.getServiceTime());
    }
}
package Preparation;


//The IS-A relationship
/*Uses the protected access modifier
  Why Inheritance;
      -For method Overriding-to achieve Polymorphism
      -For code re-usability
   Types of Inheritance;
         -Single
         -Multi-level
         -Hierarchical
 */
public class Inheritance {
    protected int age;
    protected String name;

    public void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getPersonDetails() {
        System.out.println("Name " + name + "\n");
        System.out.println("Age " + age + "\n");
    }

}

//Subclass 1
class Student extends Inheritance {
    private int marks;

    public void setStudentDetails(String name, int age, int marks) {
        setPersonDetails(name, age);
        this.marks = marks;

    }

    public void getStudentDetails() {
        System.out.println("########DETAILS OF STUDENT#######\n");
        getPersonDetails();
        System.out.println("Marks " + marks + "\n");

    }
}

//Subclass 2
class Teacher extends Inheritance {
    private int salary;

    public void setTeacherDetails(String name, int age, int salary) {
        setPersonDetails(name, age);
        this.salary = salary;
    }

        public void getTeacherDetails(){
            System.out.println("##########DETAILS OF THE TEACHER##########\n");
            getPersonDetails();
            System.out.println("Salary " + salary + "\n");
        }
    }
package class_and_projects;

public class ImmutableClass {
    private int id;
    private String name;
    private java.util.Date dateCreated;
     public ImmutableClass(int ssn, String newName){
         id = ssn;
         name = newName;

     }
     public int getId(){
         return id;
     }

    public String getName() {
        return name;
    }
    public java.util.Date getDateCreated(){
         return dateCreated;
    }

}

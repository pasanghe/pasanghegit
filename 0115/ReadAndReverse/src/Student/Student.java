package Student;


public class Student {

    private String name;
    private int ID;
    private int maxHours;

    public Student() {
        this.name = "paul";
        this.ID = 991517263;
    }
// main constructor with name and ID as arguments
    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public String toString(){
        return "Student";
    }
}
//change

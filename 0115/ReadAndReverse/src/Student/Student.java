package Student;


public class Student {

    private String name;
    private int ID;

    public Student() {
        this.name = "paul";
        this.ID = 991517263;
    }

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

}

package Student;


public class StudentList {

    public static void main(String[] args) {
        Student[] studentList = new Student[2];
        Student s1 = new Student();
        Student s2 = new Student("gagan", 99171717);
        studentList[0] = s1;
        studentList[1] = s2;
        for (int i = 0; i < studentList.length; i++) {
            System.out.println("Student Name: " + studentList[i].getName() + "\nStudent Number: " + studentList[i].getID());
        }
    }
}

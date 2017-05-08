
// UGStudent.java
// Simple Inheritance class

public class UGStudent extends Student {
   
    public UGStudent() {};

    public UGStudent(String yr, double grades) {
        year = yr;
        gpa = grades;
    }

    public String year;
    public double gpa;
}

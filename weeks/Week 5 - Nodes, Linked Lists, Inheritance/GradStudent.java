
// GradStudent.java
// Simple Inheritance class

public class GradStudent extends Student {

    public GradStudent() {};

    public GradStudent(String degree, boolean plan) {
        degreeSought = degree;
        GradPlanFiled = plan;
        super.major = "CSci";
        super.first = "abc";
    }

    public String degreeSought;
    public boolean GradPlanFiled;
}

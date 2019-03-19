package Bodya;
/**
 * Created by asus on 24.02.2019.
 */
public class Student extends Human {
    private String university;
    private int course;

    public Student() {
        university = "SSAU";
        course = 5;
    }
    public Student(String university, int course){
        this.university = university;
        this.course = course;
    }

    public String getUniversity() {
        return university;
    }

    public int getCourse() {
        return course;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

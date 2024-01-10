package student;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student = new Student("23","232","23","32","32");
        System.out.println(student);
        student.getCourse();
        student.setCourse("Java");



    }
}

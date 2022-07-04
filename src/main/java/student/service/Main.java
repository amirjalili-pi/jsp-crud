package main.java.student.service;

import main.java.course.data.entity.Course;
import main.java.student.biz.StudentBizimpl;
import main.java.student.data.entity.Student;
import main.java.teacher.biz.TeacherBizImpl;
import main.java.teacher.data.entity.Teacher;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        String url = "jdbc:oracle:thin:@localhost:1521:XE";
//        String user = "amir";
//        String pass = "oracle";
//        try {
//            Connection conn = DriverManager.getConnection(url, user, pass);
//            System.out.println("Working");
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
        StudentBizimpl bizz = new StudentBizimpl();
        TeacherBizImpl teacherBiz = new TeacherBizImpl();
        Student jafar = new Student("Jafar", "Farhadi", "JafarJFar@gmail.com");
        Course fizik = new Course("fizik");
        Teacher babak = new Teacher("Babak", "Hamidi");
        babak.addCourse(new Course("Shimi"));
        babak.addCourse(new Course("dini"));
        babak.addCourse(fizik);
        jafar.setCourse(fizik);
        teacherBiz.save(babak);
        bizz.save(jafar);

    }
}

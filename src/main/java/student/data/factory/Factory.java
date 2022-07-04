package main.java.student.data.factory;

import main.java.course.data.entity.Course;
import main.java.student.data.entity.Student;
import main.java.teacher.data.entity.Teacher;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {
    private static final SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Teacher.class).addAnnotatedClass(Course.class).buildSessionFactory();

    public static SessionFactory getFactory() {
        return factory;
    }
}

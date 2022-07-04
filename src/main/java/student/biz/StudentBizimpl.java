package main.java.student.biz;

import main.java.base.biz.BaseBizImpl;
import main.java.student.data.entity.Student;
import main.java.student.data.factory.Factory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class
StudentBizimpl extends BaseBizImpl<Student> implements StudentBiz{
    static SessionFactory factory = Factory.getFactory();

    @Override
    public void update(Student student) {
        Session session = factory.getCurrentSession();
        Student oldStudent;
        try {
            session.beginTransaction();
            oldStudent = session.get(Student.class, student.getId());
            oldStudent.setFirstName(student.getFirstName()).setLastName(student.getLastName()).setEmail(student.getEmail());
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }
    //    public List<Student> read() {
//        SessionFactory factory = Factory.getFactory();
//        Session session = factory.getCurrentSession();
//        List<Student> students;
//        try {
//            session.beginTransaction();
//            students = session.createQuery("from Student s").getResultList();
//            session.getTransaction().commit();
//        }finally {
//            session.close();
//        }
//        return students;
//
//    }

//    public void save(Student student){
//        SessionFactory factory = Factory.getFactory();
//        Session session = factory.getCurrentSession();
//        try {
//            session.beginTransaction();
//            session.save(student);
//            session.getTransaction().commit();
//        }finally {
//            session.close();
//        }
//    }
//
//    public void delete(int id){
//        SessionFactory factory = Factory.getFactory();
//        Session session = factory.getCurrentSession();
//        try {
//            session.beginTransaction();
//            Student student = session.get(Student.class, id);
//            session.delete(student);
//            session.getTransaction().commit();
//        }finally {
//            session.close();
//        }
//    }
//
//    public Student get(int id){
//        SessionFactory factory = Factory.getFactory();
//        Session session = factory.getCurrentSession();
//        Student student;
//        try {
//            session.beginTransaction();
//            student = session.get(Student.class, id);
//            session.getTransaction().commit();
//        }finally {
//            session.close();
//        }
//        return student;
//    }
//
//    public void update(Student student1){
//        SessionFactory factory = Factory.getFactory();
//        Session session = factory.getCurrentSession();
//        try {
//            session.beginTransaction();
//            Student student = session.get(Student.class, student1.getId());
//            student.setFirstName(student1.getFirstName());
//            student.setLastName(student1.getLastName());
//            student.setEmail(student1.getEmail());
//            session.getTransaction().commit();
//        }finally {
//            session.close();
//        }
//    }
}

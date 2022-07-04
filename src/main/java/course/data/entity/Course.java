package main.java.course.data.entity;

import main.java.base.data.entity.BaseTO;
import main.java.student.data.entity.Student;
import main.java.teacher.data.entity.Teacher;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course extends BaseTO {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "title")
    private String title;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    private Student student;

    public Course(String title) {
        this.title = title;
    }

    public Course(){

    }

    public int getId() {
        return id;
    }

    public Course setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Course setTitle(String title) {
        this.title = title;
        return this;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Course setTeacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }

    public Student getStudent() {
        return student;
    }

    public Course setStudent(Student student) {
        this.student = student;
        return this;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}

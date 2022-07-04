package main.java.teacher.data.entity;

import main.java.base.data.entity.BaseTO;
import main.java.course.data.entity.Course;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "teacher")
public class Teacher extends BaseTO {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Course> courses;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Teacher(){

    }

    public int getId() {
        return id;
    }

    public Teacher setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Teacher setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Teacher setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Teacher setCourses(List<Course> courses) {
        this.courses = courses;
        return this;
    }

    public void addCourse(Course course){
        if(courses == null){
            courses = new ArrayList<>();
        }
        courses.add(course);
        course.setTeacher(this);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

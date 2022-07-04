package main.java.course.ui;

import main.java.course.biz.CourseBizzImpl;
import main.java.course.data.entity.Course;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/courses")
public class ReadCourseServlet extends HttpServlet {
    CourseBizzImpl bizz = new CourseBizzImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Course> courses = bizz.read("Course");
        if(courses == null){
            RequestDispatcher dispatcher = req.getRequestDispatcher("404.html");
            dispatcher.forward(req, resp);
        }else {
            req.setAttribute("courses", courses);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/course/courses.jsp");
            dispatcher.forward(req, resp);

        }
    }
}

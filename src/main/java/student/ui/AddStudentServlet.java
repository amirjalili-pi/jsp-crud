package main.java.student.ui;

import main.java.course.data.entity.Course;
import main.java.student.biz.StudentBizimpl;
import main.java.student.data.entity.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/student/add")
public class AddStudentServlet extends HttpServlet {
    StudentBizimpl bizz = new StudentBizimpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("student_addform.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student newStudent = new Student(req.getParameter("firstname"), req.getParameter("lastname"), req.getParameter("email"));
        bizz.save(newStudent);
        resp.sendRedirect("/home");

    }
}

package main.java.student.ui;

import main.java.student.biz.StudentBizimpl;
import main.java.student.data.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/student/delete")
public class DeleteStudentServlet extends HttpServlet {
    StudentBizimpl bizz = new StudentBizimpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Student student = new Student().setId(id);
        student = bizz.get(student, id);
        bizz.delete(student);
        resp.sendRedirect("/student");
    }
}

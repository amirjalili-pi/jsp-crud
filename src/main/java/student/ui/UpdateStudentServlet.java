package main.java.student.ui;

import main.java.student.biz.StudentBiz;
import main.java.student.biz.StudentBizimpl;
import main.java.student.data.entity.Student;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/student/update")
public class UpdateStudentServlet extends HttpServlet {
    StudentBizimpl bizz = new StudentBizimpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        Student student = new Student().setId(id);
        student  = bizz.get(student, id);

        req.setAttribute("student", student);
        RequestDispatcher dispatcher = req.getRequestDispatcher("student/student_update.jsp");
        dispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Student student = new Student(req.getParameter("firstname"), req.getParameter("lastname"), req.getParameter("email"));
        student.setId(id);
        bizz.update(student);
        resp.sendRedirect("/home");



    }
}

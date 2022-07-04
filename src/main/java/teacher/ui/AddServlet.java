package main.java.teacher.ui;

import main.java.teacher.biz.TeacherBizImpl;
import main.java.teacher.data.entity.Teacher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/teachers/add")
public class AddServlet extends HttpServlet {
    TeacherBizImpl teacherBiz = new TeacherBizImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/teacher/add_teacher.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Teacher teacher = new Teacher(req.getParameter("firstName"), req.getParameter("lastName"));
        teacherBiz.save(teacher);
        resp.sendRedirect("/teachers");
    }
}

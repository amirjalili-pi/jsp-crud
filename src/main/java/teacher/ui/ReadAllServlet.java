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
import java.util.List;

@WebServlet("/teachers")
public class ReadAllServlet extends HttpServlet {
    TeacherBizImpl biz = new TeacherBizImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Teacher> teachers = biz.read("Teacher");
        if(teachers == null){
            RequestDispatcher dispatcher = req.getRequestDispatcher("404.html");
            dispatcher.forward(req,resp);
        }else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("teacher/teachers.jsp");
            req.setAttribute("teachers", teachers);
            dispatcher.forward(req,resp);
        }
    }
}

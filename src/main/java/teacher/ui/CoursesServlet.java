package main.java.teacher.ui;

import main.java.course.biz.CourseBizzImpl;
import main.java.teacher.biz.TeacherBizImpl;
import main.java.teacher.data.entity.Teacher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/teachers/courses")
public class CoursesServlet extends HttpServlet {
    TeacherBizImpl teacherBiz = new TeacherBizImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Teacher teacher = new Teacher().setId(id);
        teacher = teacherBiz.get(teacher, id);

        req.setAttribute("course", teacher.getCourses());

        System.out.println("****");
        System.out.println(teacher.getCourses());
        System.out.println("****");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/teacher/teacher_course.jsp");
        dispatcher.forward(req, resp);

    }
}

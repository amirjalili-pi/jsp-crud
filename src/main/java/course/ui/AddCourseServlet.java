package main.java.course.ui;

import main.java.course.biz.CourseBizzImpl;
import main.java.course.data.entity.Course;
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

@WebServlet("/courses/add")
public class AddCourseServlet extends HttpServlet {
    TeacherBizImpl biz = new TeacherBizImpl();
    CourseBizzImpl courseBiz = new CourseBizzImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Teacher> teachers = biz.read("Teacher");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/course/course_addform.jsp");
        req.setAttribute("teachers", teachers);
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        int teacherId = Integer.parseInt(req.getParameter("teacher"));
        Teacher teacher = new Teacher().setId(teacherId);
        teacher = biz.get(teacher, teacherId);
        Course course = new Course(title);
        course.setTeacher(teacher);
        courseBiz.save(course);
        resp.sendRedirect("/courses");

    }
}

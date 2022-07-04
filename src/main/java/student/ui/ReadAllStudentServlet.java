package main.java.student.ui;

import main.java.student.biz.StudentBizimpl;
import main.java.student.data.entity.Student;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/students")
public class ReadAllStudentServlet extends HttpServlet {
    StudentBizimpl bizz = new StudentBizimpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get the items from database
        List<Student> students = bizz.read("Student");
        // set in session
        if(students == null){
            RequestDispatcher dispatcher = req.getRequestDispatcher("404.html");
            dispatcher.forward(req,resp);

        }else {
            req.setAttribute("studentList", students);
            RequestDispatcher dispatcher = req.getRequestDispatcher("student/Students.jsp");
            dispatcher.forward(req,resp);
        }

    }

}


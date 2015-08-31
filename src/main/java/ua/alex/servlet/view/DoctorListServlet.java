package ua.alex.servlet.view;

import ua.alex.dao.DoctorDao;
import ua.alex.dao.impl.DoctorDaoMysql;
import ua.alex.data.Doctor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Alex on 18.08.2015.
 */
public class DoctorListServlet extends HttpServlet {

    public DoctorDao doctorDao = new DoctorDaoMysql();

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        List<Doctor> doctorList = doctorDao.getAll();
        request.setAttribute("doctorList", doctorList);

        String nextJSP = "/doctorList.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }
}

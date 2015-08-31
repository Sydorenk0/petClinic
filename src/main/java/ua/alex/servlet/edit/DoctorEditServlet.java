package ua.alex.servlet.edit;

import ua.alex.dao.DoctorDao;
import ua.alex.dao.impl.DoctorDaoMysql;
import ua.alex.data.Doctor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alex on 19.08.2015.
 */
public class DoctorEditServlet extends HttpServlet {
    public DoctorDao doctorDao = new DoctorDaoMysql();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Doctor doctor = doctorDao.getById(Integer.valueOf(request.getParameter("id")));

        if (doctor.getId() !=0) {
            request.setAttribute("doctor", doctor);

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addDoctor.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("/doctor/list");
        }
    }
}

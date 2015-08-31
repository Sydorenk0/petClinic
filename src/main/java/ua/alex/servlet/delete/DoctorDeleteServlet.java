package ua.alex.servlet.delete;

import ua.alex.dao.DoctorDao;
import ua.alex.dao.impl.DoctorDaoMysql;
import ua.alex.data.Doctor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alex on 19.08.2015.
 */
public class DoctorDeleteServlet  extends HttpServlet {

    public DoctorDao doctorDao = new DoctorDaoMysql();

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Doctor doctor = new Doctor();
        doctor.id = Integer.valueOf(request.getParameter("id"));
        doctorDao.delete(doctor);

        response.sendRedirect("/doctor/list");
    }
}

package ua.alex.servlet.add;

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
public class AddDoctorServlet extends HttpServlet {

    public DoctorDao doctorDao = new DoctorDaoMysql();

    public void doPost (HttpServletRequest request,
                        HttpServletResponse response)
            throws ServletException, IOException {

        Doctor doc = new Doctor();

        if ("".equals(request.getParameter("id"))) {
            doc.id = 0;
        } else {
            doc.id = Integer.valueOf(request.getParameter("id"));
        }
        doc.firstName = request.getParameter("firstName");
        doc.lastName = request.getParameter("lastName");
        doc.specializ = request.getParameter("specializ");

        doctorDao.saveOrUpdate(doc);

        response.sendRedirect("/doctor/list");
    }
}

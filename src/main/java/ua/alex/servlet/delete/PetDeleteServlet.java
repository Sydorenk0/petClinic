package ua.alex.servlet.delete;

import ua.alex.dao.PetDao;
import ua.alex.dao.impl.PetDaoMysql;
import ua.alex.data.Pet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alex on 19.08.2015.
 */
public class PetDeleteServlet  extends HttpServlet {

    public PetDao petDao = new PetDaoMysql();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Pet pet = new Pet();
        pet.id = Integer.valueOf(request.getParameter("id"));

        petDao.delete(pet);

        response.sendRedirect("/pet/list");
    }
}

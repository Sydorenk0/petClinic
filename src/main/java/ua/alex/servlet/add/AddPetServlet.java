package ua.alex.servlet.add;

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
public class AddPetServlet extends HttpServlet {

    public PetDao petDao = new PetDaoMysql();

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        Pet pet = new Pet();

        if ("".equals(request.getParameter("id"))) {
            pet.id = 0;
        } else {
            pet.id = Integer.valueOf(request.getParameter("id"));
        }
        pet.species = request.getParameter("species");
        pet.alias = request.getParameter("alias");
        pet.age = new Integer(request.getParameter("age"));

        petDao.saveOrUpdate(pet);

        response.sendRedirect("/pet/list");
    }
}

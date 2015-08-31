package ua.alex.servlet.edit;

import ua.alex.dao.PetDao;
import ua.alex.dao.impl.PetDaoMysql;
import ua.alex.data.Pet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alex on 19.08.2015.
 */
public class PetEditServlet extends HttpServlet {

    public PetDao petDao = new PetDaoMysql();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Pet pet = petDao.getById(Integer.valueOf(request.getParameter("id")));

        if (pet.getId() !=0) {
            request.setAttribute("pet", pet);

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addPet.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("/pet/list");
        }
    }
}
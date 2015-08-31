package ua.alex.servlet.view;

import ua.alex.dao.PetDao;
import ua.alex.dao.impl.PetDaoMysql;
import ua.alex.data.Pet;

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
public class PetListServlet extends HttpServlet {

    public PetDao petDao = new PetDaoMysql();

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Pet> petList = petDao.getAll();
        request.setAttribute("petList", petList);

        String nextJSP = "/petList.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }

}

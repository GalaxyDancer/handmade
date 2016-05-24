package by.gal.handmade.controller;

import by.gal.handmade.command.CommandFactory;
import by.gal.handmade.command.ICommand;
import by.gal.handmade.constant.RoutePath;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Den Galax
 * @version 2016/05/11
 * Http controller
 */
@WebServlet(name = "Home", urlPatterns = {"/Home", "/home", "/"})
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        ICommand command = CommandFactory.getCommand(request);
        String page = command.execute(request);

//        List<String> models = new ArrayList<>();
//        models.add("1");
//        models.add("2");
//        request.setAttribute("models", models);
//        request.setAttribute("test", "test");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);


    }
}

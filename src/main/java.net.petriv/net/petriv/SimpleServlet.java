package net.petriv;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String name = "Hello";
request.setAttribute("massege", name);

        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/hello.jsp");
        view.forward(request, response);


    }

}

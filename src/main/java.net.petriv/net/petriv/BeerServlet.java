package net.petriv;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BeerServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
//
//        PrintWriter messageWriter = response.getWriter();
//        messageWriter.println("Beer Selection Advice<br>");
//        String c = request.getParameter("color");
//        messageWriter.println("<br> Got beer color " + c);
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/result.jsp");

        view.forward(request, response);


    }
}

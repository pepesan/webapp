package com.cursosdedesarrollo.app.servlets;

/**
 * Created by pepesan on 20/5/16.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ruta")
public class OtroServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {
        String param1=request.getParameter("param1");
        String param2=request.getParameter("param2");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hola Mundo desde Servlet!</h1>");
        out.println("<a href='/'>Inicio</a>");
        out.println("<h5>param1: "+param1+"</h5>");
        out.println("<h5>param2: "+param2+"</h5>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}

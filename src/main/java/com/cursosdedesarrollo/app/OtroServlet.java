package com.cursosdedesarrollo.app;

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
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hola Mundo desde Servlet!</h1>");
        out.println("<a href='/'>Inicio</a>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}

package com.cursosdedesarrollo.app.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pepesan on 20/5/16.
 */
@WebServlet("/redir")
public class RedirServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response){
        String variable="valor";
        request.setAttribute("variable",variable);
        request.setAttribute("numero",1);

        RequestDispatcher rd=getServletContext()
                .getRequestDispatcher("/redirigido.jsp");
        try {
            rd.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

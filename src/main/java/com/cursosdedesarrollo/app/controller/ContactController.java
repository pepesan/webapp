package com.cursosdedesarrollo.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pepesan on 20/5/16.
 */
public class ContactController extends ActionController{
    public void process(HttpServletRequest request,
                        HttpServletResponse response){
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Página de Contacto</h1>");
            out.println("<a href='/'>Inicio</a>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
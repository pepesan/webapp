package com.cursosdedesarrollo.app.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pepesan on 20/5/16.
 */
public class ContactController implements Controller{
    public void process(HttpServletRequest request,
                        HttpServletResponse response,
                        ServletContext servletContext){
        RequestDispatcher rd=servletContext
                .getRequestDispatcher("/contact.jsp");
        try {
            rd.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
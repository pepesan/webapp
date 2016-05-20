package com.cursosdedesarrollo.app.controller;

import com.cursosdedesarrollo.app.domain.Producto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pepesan on 20/5/16.
 */
public class ProductoController implements Controller{
    public void process(HttpServletRequest request,
                        HttpServletResponse response) {

    }
    public void process(HttpServletRequest request,
                        HttpServletResponse response,
                        ServletContext servletContext){
        Producto p=new Producto(1l,"iPhone");
        request.setAttribute("producto",p);

        RequestDispatcher rd=servletContext
                .getRequestDispatcher("/producto.jsp");
        try {
            rd.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

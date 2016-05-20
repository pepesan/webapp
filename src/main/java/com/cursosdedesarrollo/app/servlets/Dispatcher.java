package com.cursosdedesarrollo.app.servlets;

import com.cursosdedesarrollo.app.controller.ContactController;
import com.cursosdedesarrollo.app.controller.HomeController;
import com.cursosdedesarrollo.app.controller.ProductoController;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by pepesan on 20/5/16.
 */
@WebServlet("/modules")
public class Dispatcher extends HttpServlet{
    HomeController homeController;
    ContactController contactController;
    private ProductoController productoController;

    public Dispatcher(){
        homeController=new HomeController();
        contactController=new ContactController();
        productoController=new ProductoController();
    }
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response){
        processModule(request,response);
    }
    public void doPost(HttpServletRequest request,
                      HttpServletResponse response){
        processModule(request,response);
    }
    public void processModule(HttpServletRequest request,
                              HttpServletResponse response){
        String moduleName=request.getParameter("modulo");
        if (moduleName==null){
            moduleName="Home";
        }
        System.out.println(moduleName);
        if (moduleName.equals("Home")){

            homeController.process(request,response, getServletContext());
        }else if(moduleName.equals("Contact")){

            contactController.process(request,response, getServletContext());
        }else if(moduleName.equals("Producto")){
            productoController.process(request,response, getServletContext());
        }
    }

}

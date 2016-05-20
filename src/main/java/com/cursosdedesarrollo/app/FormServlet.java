package com.cursosdedesarrollo.app;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pepesan on 20/5/16.
 */
@WebServlet("/form")
public class FormServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response){
        PrintWriter out = null;
        try {
            String username=request.getParameter("usuario");
            String password=request.getParameter("pass");
            Boolean loginValido=false;
            if(username.equals("pepe") && password.equals("san")){
                loginValido=true;
            }
            out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Recibiendo los datos de formulario!</h1>");
            out.println("<a href='/'>Inicio</a>");
            if(loginValido){
                out.println("<h3>Bienvenido Pepe!</h3>");
            }else{
                out.println("<h3>Y tú de quien eres?</h3>");
                out.println("<h3><a href='/'>Vuelve a loguearte anda!</a></h3>");
            }
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();

    }
}

package com.cursosdedesarrollo.app.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Created by pepesan on 20/5/16.
 */
public class NavegadorCutre {
    public void main (String[] args){
        StringBuffer urlServlet=new StringBuffer();
        urlServlet.append("http://localhost:8080/pepe");
        urlServlet.append("?para1="+ URLEncoder.encode("valor"));
        urlServlet.append("&para2="+ URLEncoder.encode("valor2"));
        try {
            URL url=new URL(urlServlet.toString());
            URLConnection conexion=url.openConnection();
            InputStreamReader inputStream=
                    new InputStreamReader(conexion.getInputStream());
            BufferedReader bf=new BufferedReader(inputStream);
            String val=null;
            StringBuffer resultado=null;
            while ((val=bf.readLine())!=null){
                resultado.append(val);
            }
            System.out.println(resultado);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

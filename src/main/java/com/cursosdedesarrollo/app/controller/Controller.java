package com.cursosdedesarrollo.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by pepesan on 20/5/16.
 */
public interface Controller {
    public void process(HttpServletRequest request,
                        HttpServletResponse response);

}

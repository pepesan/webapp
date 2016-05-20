package com.cursosdedesarrollo.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by pepesan on 20/5/16.
 */
public abstract class ActionController {
    public abstract void process(HttpServletRequest request,
                        HttpServletResponse response);

}

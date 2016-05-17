package com.cursosdedesarrollo.app;

import java.io.Serializable;

/**
 * Created by pepesan on 17/5/16.
 */
public class JavaBean implements Serializable{

    private String propiedad;

    public JavaBean() {
        this.propiedad = "";
    }

    public JavaBean(String propiedad) {
        this.propiedad = propiedad;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaBean javaBean = (JavaBean) o;

        return propiedad != null ? propiedad.equals(javaBean.propiedad) : javaBean.propiedad == null;

    }

    @Override
    public int hashCode() {
        return propiedad != null ? propiedad.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "JavaBean{" +
                "propiedad='" + propiedad + '\'' +
                '}';
    }
}

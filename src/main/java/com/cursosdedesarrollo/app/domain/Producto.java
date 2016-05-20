package com.cursosdedesarrollo.app.domain;

import java.io.Serializable;

/**
 * Created by pepesan on 20/5/16.
 */
public class Producto implements Serializable{
    private Long id;
    private String name;
    public Producto() {
        this.id = 0l;
        this.name = "";
    }
    public Producto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto producto = (Producto) o;

        if (id != null ? !id.equals(producto.id) : producto.id != null) return false;
        return name != null ? name.equals(producto.name) : producto.name == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

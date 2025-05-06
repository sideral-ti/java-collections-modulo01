package com.sideralti.ejercicio_01.ejercicios_propuestos;

public class Producto {

    private String nombre;
    private Double precio;
    private Integer stock;

    public Producto() {
    }

    public Producto(String nombre, Double precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "\nProducto{" +
                "nombre='" + nombre + '\'' +
                ", precio= $ " + precio +
                ", stock= " + stock +
                '}';
    }
}

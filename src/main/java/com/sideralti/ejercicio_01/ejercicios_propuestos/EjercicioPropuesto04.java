package com.sideralti.ejercicio_01.ejercicios_propuestos;

import java.util.ArrayList;

/**
 * Ejercicio Propuesto 04. Creación de un ArrayList:
 *     - Crea un ArrayList de un Objeto llamado `Producto` (Producto.java) que debe tener los siguientes atributos:
 *          - nombre: String
 *          - precio: Double
 *          - stock: Integer
 *     - Imprime el ArrayList recién creado.
 */
public class EjercicioPropuesto04 {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Lechugas", 1500d, 60));
        productos.add(new Producto("Naranjas", 1200d, 120));
        productos.add(new Producto("Sandia", 3000d, 50));
        productos.add(new Producto("Papas", 500d, 500));
        productos.add(new Producto("Tomates", 1690d, 100));

        System.out.println("Lista de productos:  " + productos);
    }
}

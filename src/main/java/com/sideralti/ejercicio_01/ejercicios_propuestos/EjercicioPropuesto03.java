package com.sideralti.ejercicio_01.ejercicios_propuestos;

import java.util.ArrayList;

/**
 * Ejercicio Propuesto 03. Creación de un ArrayList:
 *     - Crea un ArrayList de tipo Float.
 *     - Imprime el ArrayList recién creado.
 */
public class EjercicioPropuesto03 {
    public static void main(String[] args) {

        ArrayList<Float> listaFlotanteFloat = new ArrayList<>();
        listaFlotanteFloat.add(45.2F);
        listaFlotanteFloat.add(1024.23F);
        listaFlotanteFloat.add(3.1415F);
        listaFlotanteFloat.add(33.333333333F);
        listaFlotanteFloat.add(24.6F);

        System.out.println("Lista de Float:  " + listaFlotanteFloat);

    }
}

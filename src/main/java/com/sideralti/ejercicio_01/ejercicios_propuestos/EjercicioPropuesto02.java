package com.sideralti.ejercicio_01.ejercicios_propuestos;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Ejercicio Propuesto 02. Creación de un ArrayList:
 *     - Crea un ArrayList de tipo Double.
 *     - Imprime el ArrayList recién creado.
 */
public class EjercicioPropuesto02 {
    public static void main(String[] args) {

        ArrayList<Double> puntoFlotante = new ArrayList<>();
        puntoFlotante.add(15.4);
        puntoFlotante.add(25.5);
        puntoFlotante.add(108.99);
        puntoFlotante.add(1000d);
        puntoFlotante.add(2000D);

        System.out.println("Lista tipo dato Float:  " + puntoFlotante);


    }
}

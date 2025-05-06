package com.sideralti.ejercicio_01.ejercicios_propuestos;

import java.util.ArrayList;

/**
 * Ejercicio Propuesto 01. Creación de un ArrayList:
 *     - Crea un ArrayList de tipo Integer.
 *     - Imprime el ArrayList recién creado.
 */
public class EjercicioPropuesto01 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(4);
        numeros.add(3);
        numeros.add(1);

        System.out.println(numeros);

    }
}

package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

    //EJERCICIO 03
        ArrayList<Integer> nuevaLista = new ArrayList<>();
        nuevaLista.add(1);
        nuevaLista.add(5);
        nuevaLista.add(5);
        nuevaLista.add(6);
        nuevaLista.add(7);
        nuevaLista.add(8);
        nuevaLista.add(8);
        nuevaLista.add(8);
        System.out.println("Ejercicio 03:");
        System.out.println(nuevaLista);

    //EJERCICIO 04
        Set<Integer> nuevoConjunto = new HashSet<>();
            nuevoConjunto.add(1);
            nuevoConjunto.add(5);
            nuevoConjunto.add(5);
            nuevoConjunto.add(6);
            nuevoConjunto.add(7);
            nuevoConjunto.add(8);
            nuevoConjunto.add(8);
            nuevoConjunto.add(8);
            System.out.println("Ejercicio 04:");
            System.out.println(nuevoConjunto);

    //EJERCICIO 05
        List<Integer> listaPrimerosCien = new ArrayList<>();
        System.out.println("Ejercicio 05");
        for (Integer i =0; i<100; i++) {
            System.out.println(i);
        }

    //EJERCICIO 06
        Set<Integer> conjuntoPrimerosCien = new HashSet<>();
        for (Integer i =0; i<100; i++) {
            conjuntoPrimerosCien.add(1);
        }
        System.out.println("Ejercicio 06");
        System.out.println(conjuntoPrimerosCien);
    }
    //EJERCICIO 07

}

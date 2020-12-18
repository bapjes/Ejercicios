package jStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DistanceArrays {

    public static void main(String[] args) {
        int[] lista = {3,2,1,2,3};
        //{3,2,1,2,3};{7, 1, 3, 4, 1, 7}
        int size = lista.length;
        int[][] vector = new int[size][size];

        int i,valor, x, y,min;

        ArrayList<Integer> numeros = new ArrayList();
        ArrayList<Integer> eliminar = new ArrayList();

        for (i = 0; i < size; i++) {
            numeros.add(lista[i]);
            eliminar.add(lista[i]);
        }

        min = 1000;

        Iterator<Integer> nombreIterator = eliminar.iterator();
        while (nombreIterator.hasNext()) {
            valor = eliminar.get(0);
            x = numeros.indexOf(valor);
            y = numeros.lastIndexOf(valor);

            if (x >= 0 && y > 0) {

                eliminar.remove(eliminar.indexOf(valor));
                if (x != y) {
                    eliminar.remove(eliminar.lastIndexOf(valor));
                    if (min > y - x)
                        min = y - x;
                }
            }
         }
        System.out.println("El valor minimo es :" + min);
    }
}

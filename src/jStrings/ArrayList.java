package jStrings;

import java.util.*;

public class ArrayList<I extends Number> {

    public static void main(String[] args) {

        //arreglo normal
        //int matriz[][] = new int[4][5];

      int matriz[][] = {
                {10,2,3,4,5},
                {8,6,7,9,10},
                {1,2,3,4,5},
                {6,7,8,9,12}
        };

        int i,j;
        for (i=0;i<4;i++)
        {
            System.out.println();
            for (j=0;j<5;j++)
            {
                System.out.println(matriz[i][j]+ " ");
            }
        }

      /*  for (int[] fila:matriz)
        {
            System.out.println();
            for (int z:fila)
            {
                System.out.println(z+ " ");
            }
        }*/

      /*  java.util.ArrayList<Empleado> lista = new java.util.ArrayList<Empleado>(); // por le constructor


        lista.add(new Empleado ("Bety",30));
        lista.add(new Empleado ("Jesus",30));
        //para poner un elemento en una posición en específico
        //este comando quita al elemento de la posicion 0 y se pone Jolie
        lista.set(0,new Empleado ("Jolie",30));

        //elimina el espacio sin ocupar
        //lista.trimToSize();

       for (Empleado e:lista)
       {
           System.out.println(e.dameDatos());
       }

      /* for (int i=0;i>lista.size();i++)
       {
           Empleado e = lista.get(i);
           System.out.println(e.dameDatos();
       }*/

       /* Iterator <Empleado> miIterador = lista.iterator();
        while (miIterador.hasNext())
        {
            System.out.println(miIterador.next().dameDatos());
        }
*/
    }
}

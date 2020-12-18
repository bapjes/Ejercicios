package mArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        reverse();
    }

    public static void reverse()
    {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(68);
        numeros.add(70);
        numeros.add(1050);

        List<String> letras = new ArrayList<>();
        letras.add("hola");
        letras.add("a");
        letras.add("cos");

        Collections.sort(letras);
        System.out.println(letras);
        Collections.sort(letras, Collections.reverseOrder());
        System.out.println(letras);



        Collections.sort(numeros);
        System.out.println("short minor to major: " + numeros);

        //ordenar de mayor a menor
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Short major to Minor: "+ numeros+"\n");
    }
}

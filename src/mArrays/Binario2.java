package mArrays;

import java.util.*;

public class Binario2 {
    public static void main(String[] args) {
        int dividendo;
        System.out.println("Introducir un número ");
        Scanner inputValue = new Scanner(System.in);
        dividendo = inputValue.nextInt();

        List<Integer> listnum = new ArrayList<Integer>();
        int numeroBinario;
        numeroBinario = dividendo % 2;
        listnum.add(numeroBinario);
        int cociente = (dividendo / 2);


        while (cociente >= 2) {
            numeroBinario = cociente % 2;
            listnum.add(numeroBinario);
            cociente = (cociente / 2);

        }

        listnum.add(cociente);

        Collections.reverse(listnum);
        System.out.println(listnum);



    }
}

package mArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Binario {

    public static void main(String[] args) {
        int dividendo;
        System.out.println("Introducir un número ");
        Scanner inputValue = new Scanner(System.in);
        dividendo = inputValue.nextInt();

        List<Integer> listnum = new ArrayList<Integer>();
        String numeroBinario = "";
        numeroBinario = Integer.toString(dividendo % 2);

        int cociente = (dividendo / 2);


        while (cociente >= 2) {
            numeroBinario = numeroBinario + Integer.toString(cociente % 2);
            cociente = (cociente / 2);

        }

        numeroBinario = numeroBinario + Integer.toString(cociente);
        int lonNumeroBinario;
        lonNumeroBinario = numeroBinario.length();

        char[] binarioFinal = new char[lonNumeroBinario];
        int j=0;
        for (int i = lonNumeroBinario-1; i >= 0; i--) {
            binarioFinal[j] = numeroBinario.charAt(i);
            j++;
            //System.out.println(numeroBinario.charAt(i));

        }
        System.out.println(binarioFinal);
    }
}

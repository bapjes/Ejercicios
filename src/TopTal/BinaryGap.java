package TopTal;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryGap {

    public static void main(String[] args) {

        int dividendo;
        System.out.println("Introducir un número ");
        Scanner inputValue = new Scanner(System.in);
        dividendo = inputValue.nextInt();

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
        //System.out.println("Numero binario: "  + numeroBinario);

        int[] binarioFinal = new int[lonNumeroBinario];

        int j = 0;
        for (int i = lonNumeroBinario-1; i >= 0; i--) {
            binarioFinal[j] = Integer.parseInt(String.valueOf(numeroBinario.charAt(i)));
            j++;
        }
        int inicioUno = -1;
        int contadorCero = 0;
        int binaryGap = 0;

        for (int i=0; i< lonNumeroBinario; i++)
        {
            if (binarioFinal[i] == 1) {
                if (inicioUno == -1)
                    inicioUno = i;
                else {
                    if (contadorCero > 0) {
                        inicioUno = i;
                        if (contadorCero > binaryGap) {
                            binaryGap = contadorCero;
                            contadorCero = 0;
                        }
                    }
                }

            } else {
                if (inicioUno != -1)
                    contadorCero = contadorCero + 1;
            }
        }
        //System.out.println("Binary Gap : " + binaryGap);
       }
}

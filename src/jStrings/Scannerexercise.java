package jStrings;



import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Scannerexercise {

    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);
        System.out.println("Introducir la cadena");

        String nombre = cadena.nextLine();
        System.out.println(nombre);
        System.out.println("Edad:");
        String edad = cadena.nextLine();

        try {
            int numero = Integer.parseInt(edad);
        }
        catch(Exception e)
        {
            System.out.println("La edad no es un número ");
        }

        char a = '1';
        if (Character.isDigit(a))
            System.out.println("Es un número");
        else
            System.out.println("no entre");

    }



}

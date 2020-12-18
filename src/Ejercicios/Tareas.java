package Ejercicios;

import java.util.Scanner;

public class Tareas {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();  //meter datos por teclado
        //ejercicio4();
        //ejercicio5();
        ejercicio6();  //numero primo

    }


    public static void ejercicio6()
    {
        if (numeroPrimo())
            System.out.println("El numero es primo");
        else
            System.out.println("El número no es primo");
    }


    public static boolean numeroPrimo()
    {
        int i,numero;
        boolean bandera = true;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el número : ");
        numero = teclado.nextInt();

        if (numero <= 1)
            System.out.println("El número no es primo");
        else
        {

            for (i=2;i<numero;i++)
            {
                if (numero%i == 0)
                {
                    bandera = false;
                    break;
                }
            }
        }
        return bandera;
    }


    public static void ejercicio4()
    {
        char characterValue = 'A';

        int asciiValue = (int) characterValue;
        System.out.println("El ascii es "+ asciiValue );

        int value = 65;
        char valuechar = (char)value;
        System.out.println("El valor es :" + valuechar);
    }


    public static void ejercicio5()
    {
        int numero;
        String numerot;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu numero: ");
        numero = teclado.nextInt();

        //el integer ayuda a pasar a un entero o a una caden
        numerot = Integer.toString(numero);


        System.out.println("La longitud de la cadena es : " + numerot.length());



    }

    public static void ejercicio3()
    {
        String nombre;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Meter una cadena : ");
        nombre = teclado.nextLine();
        System.out.println("Cadena " + nombre);
    }

    public static void ejercicio2()
    {
        String nombre = "Jesus";

        System.out.println("Bienvenido " + nombre);
    }



    public static void ejercicio1()
    {
        int a,b;
        a= 5;
        b= 2;
        System.out.println("La suma es : " +  (a+b));
        System.out.println("La resta es : " + (a-b));
        System.out.println("La multiplicacion es " + (a*b));
        System.out.println("La división es : " + (a/b));
        System.out.println("El modulo es : " + (a%b));
    }

}

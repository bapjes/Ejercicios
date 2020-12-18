package iLoops;

import libs.Input;

public class Mario {

    public static void main(String[] args) {
        int altura;

        altura = pedirAltura();
        imprimirPiramide(altura);

    }


    public static int pedirAltura()
    {
        int altura = -1;

        while (altura < 1)  {
            System.out.print("Favor de dar la altura : ");
            altura = Input.get_int();
        }
        return altura;
    }

    public static void imprimirPiramide(int altura)
    {
        String caracter = "#";
        String piramide = "#";
        String formato = "%" + (altura+1) + "s %-" + altura + "s%n";
        int i;

        for (i=1; i <= altura; i++)
        {

           piramide = piramide + caracter;
           System.out.printf(formato,piramide,piramide);
        }
    }
}

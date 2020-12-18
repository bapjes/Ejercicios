package gNumericTypes;

import libs.Input;

public class BotellasdeAgua {
    public static void main(String[] args) {
        int minutos;
        int botellas;

        minutos = pedirMinutos();
        botellas = calcularBotellasagua(minutos);
        System.out.println("Por " + minutos + " minutos en el agua llenas " + botellas + " botellas de agua" );
    }


    public static int pedirMinutos()
    {
        int minutos = -1;

        while (minutos < 0 || minutos >60)  {
            System.out.print("Cuantos minutos duras en el agua?  ");
            minutos = Input.get_int();
        }
        return minutos;
    }

    public static int  calcularBotellasagua(int minutos)
    {
        return (minutos * 12);
    }
}

package jStrings;

import libs.Input;

public class SegundosReproduccionDificil {

    public static void main(String[] args) {
        int segundos = pedirSegundos();
        obtenerTiempoMinutos(segundos);
    }


    public static void obtenerTiempoMinutos(int segundos)
    {
        int minutos;
        int segundosC;
        int tiempoenMinutos;

        minutos = segundos/60;
        segundosC = segundos/60;
        tiempoenMinutos = minutos + segundosC;

        System.out.println("El total de minutos es : " + tiempoenMinutos);
    }

    public static int pedirSegundos()
    {

        int minutos = -1;
        while (minutos < 0)
        {
               System.out.print("Introducir segundos (numero positivo) : ");
                minutos = Input.get_int();
         }
        return (minutos);
    }
}

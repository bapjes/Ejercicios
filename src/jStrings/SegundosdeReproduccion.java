package jStrings;
import libs.Input;

public class SegundosdeReproduccion {
    public static void main(String[] args) {

        String duracion;
        String[] duracionA;
        int minutos;
        int segundos;
        int numerodesegundos;

        System.out.print("Cuál es la duración del video (mm:ss) : ");
        duracion = Input.get_string();
        if (duracion.contains(":"))
            {
                //obtener los minutos y segundos
                duracionA = duracion.split(":");
                if (esNumerico(duracionA[0]) && esNumerico(duracionA[1])) {
                    minutos = Integer.parseInt(duracionA[0]);
                    segundos = Integer.parseInt(duracionA[1]);

                    //obtener numero de segundos
                    numerodesegundos = (minutos * 60) + segundos;

                    System.out.println("Los minutos son : " + minutos);
                    System.out.println("Los segundos son : " + segundos);
                    System.out.println("El número de segundos que hay que esperar es  : " + numerodesegundos);
                }
             }
        else
            System.out.println("Falta los puntos : ");
    }


    public static boolean esNumerico(String cadena)
    {
        try {
            Integer.parseInt(cadena);
            return true;
        }
        catch(NumberFormatException e)
        {
           System.out.println("Los valores no son numéricos : " + e.getMessage());
           return false;
        }
    }
}

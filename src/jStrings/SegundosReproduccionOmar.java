package jStrings;

import libs.Input;

public class SegundosReproduccionOmar {
    public static void main(String[] args) {
        String tiempoMinutosSegundos = pedirMinutosSegundos();
        mostrarSegundos(tiempoMinutosSegundos);
     }


    private static String pedirMinutosSegundos() {
        boolean formatoCorrecto = false;
        String minSegs = "";
        while(!formatoCorrecto) {
            System.out.print("Dame la duracion del video en formato mm:ss ");
            String temp = Input.get_string();
            if(temp.contains(":") && temp.split(":").length == 2) {
                String[] partes = temp.split(":");
                if(esValido(partes[0]) && esValido(partes[1])) {
                    minSegs = temp;
                    formatoCorrecto = true;
                } else {
                    System.out.println("El formato mm:ss esta incorrecto");
                }

            } else {
                System.out.println("El formato mm:ss esta incorrecto");
            }
        }
        return minSegs;
    }

    private static boolean esValido(String parte) {
        try {
            int num = Integer.parseInt(parte);
            return num >= 0 && num <= 59;
        } catch(NumberFormatException e) {
            System.out.println(parte + " no es un numero valido.");
            return false;
        }
    }



    private static void mostrarSegundos(String tiempoMinutosSegundos) {
        int numSegundos = Integer.parseInt(tiempoMinutosSegundos.split(":")[0]) * 60 + Integer.parseInt(tiempoMinutosSegundos.split(":")[1]);
        System.out.println("El video dura " + numSegundos + " segundos");
    }
}

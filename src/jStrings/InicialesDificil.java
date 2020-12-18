package jStrings;

import libs.Input;


public class InicialesDificil {

    public static void main(String[] args) {

        String nombreCompleto;
        String[] nombreCompletos;
        int longitud;
        boolean todasLetras;
        int contadorA;
        int contadorN;
        int longitudNombre;
        String iniciales = "";

        System.out.print("Introducir nombre completo : nombre(s) Apellido paterno y Apellido materno : ");
        nombreCompleto = Input.get_string();
        //Diviendo la cadena en arreglos
        nombreCompletos = nombreCompleto.split(" ");
        longitud = nombreCompletos.length;
        todasLetras = true;

        if (longitud >= 3) {
            for (contadorA = 0; contadorA < longitud; contadorA++) {
                //quitando los espacios
                String nombre = nombreCompletos[contadorA].trim();
                longitudNombre = nombre.length();
                if (longitudNombre > 0 ) {
                    iniciales = iniciales + nombre.charAt(0);

                    for (contadorN = 0; contadorN < longitudNombre; contadorN++) {
                        if (Character.isDigit(nombre.charAt(contadorN))) {
                            System.out.println("Hay numeros en la cadena : " + nombre);
                            todasLetras = false;
                            break;
                        }
                    }
                }
                if (!todasLetras) {
                    break;
                }
            }

            if (todasLetras)
                System.out.println("Las iniciales del nombre son : " + iniciales.toUpperCase());
        }
        else
            System.out.println("Ingrese Nombre, Apellido Paterno y Materno");
    }
}

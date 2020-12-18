package jStrings;

//pedir al usuario una fecha
//la vamos a imprimir
//dia:
//mes:
//anio:

import libs.Input;

public class convertidorFechas {

    public static void main(String[] args) {
        pedirFecha();

    }

    public static void pedirFecha()
     {
            String sfechaUser = "";

            //pedir fecha
            System.out.print("Favor de introducir una fecha con el formato dd/mm/yyyy:");
            sfechaUser = Input.get_string();

            //separar por el signo slash
            String sfechasplit[] = sfechaUser.split("/");

            int dia = Integer.parseInt(sfechasplit[0]);
            int mes = Integer.parseInt(sfechasplit[1]);
            int anio = Integer.parseInt(sfechasplit[2]);

            if (dia <= 31 && dia  > 0 && mes <= 12 && mes >= 1)
            {
                System.out.println("La fecha es : " + sfechaUser);
                System.out.println("El dia de la fecha es : " + sfechasplit[0]);
                System.out.println("El mes de la fecha es : " + sfechasplit[1]);
                System.out.println("El año de la fecha es : " + sfechasplit[2]);
            }
            else {
                System.out.println("La fecha es incorrecta : " + sfechaUser );
            }

    }
}

package jStrings;

import libs.Input;



public class Cifradocesar {
    public static void main(String[] args) {
        int clave;
        String cadena;
        String cadenaCifrada;

        clave = pedirClave();
        cadena = pedirCadena();
        cadenaCifrada = hacerCifrado(clave,cadena);
        hacerDescifrado(cadenaCifrada,clave);
    }

    public static String pedirCadena()
    {
        String cadena = "";

        while ((cadena.length() <= 0)) {
            System.out.print("Dar una cadena con solo letras : ");
            cadena  = Input.get_string();
            // se remueven los espacios
            //cadena = cadena.replaceAll("\\s", "");
        }
        return cadena;
    }


    public static boolean cadenaCorrecta(String cadena)
    {
        int longitud;
        boolean bandera;
        int contador;

        bandera = true;
        longitud = cadena.length();
        for (contador = 0; contador < longitud; contador++ ) {
            //validar que la cadena solo tenga letras
            if (!Character.isLetter(cadena.charAt(contador))) {
                bandera = false;
                break;
            }
        }
        return bandera;
    }

    public static int pedirClave()
    {
        int clave = -1;

        while (clave < 1 || clave > 25 ) {
            System.out.print("Dar una clave numérica positiva : ");
            clave = Input.get_int();
        }
        return clave;
    }

    public static String hacerCifrado(int clave, String cadena)
    {
        String cadenauppercase="";
        String cadenacifrada = "";

        //Se convierte la cadena a mayúsculas
        cadenauppercase = cadena.toUpperCase();

        for(int posicion = 0; posicion < cadena.length(); posicion++) {
            //convierte las letras a mayúsculas
            char actual = cadenauppercase.charAt(posicion);

          if (actual >= 'A' && actual <= 'Z')
          {
              int numeroActual =  ((int) actual) + clave;

              if(numeroActual > 90) {
                  numeroActual = numeroActual - 26;
              }
              char letraActual = (char) numeroActual;
              cadenacifrada = cadenacifrada + letraActual;
          }
          else
              cadenacifrada = cadenacifrada + actual;

        }
        System.out.println("La palabra original es : " + cadena);
        System.out.println("La palabra cifrada es : " + cadenacifrada);
        return cadenacifrada;
    }

    public static void hacerDescifrado(String cadenaC, int clave)
    {
            String cadenauppercase = "";
            String cadenadescifrada = "";

            for(int posicion = 0; posicion < cadenaC.length(); posicion++) {
                char actual = cadenaC.charAt(posicion);
                int numeroActual =  ((int) actual) - clave;
                if (actual >= 'A' && actual <= 'Z') {
                    // del 65 al 90 código ASCII
                    if (numeroActual < 65) {
                        numeroActual = numeroActual + 26;
                    }
                    char letraActual = (char) numeroActual;

                    cadenadescifrada = cadenadescifrada + letraActual;
                }
                else
                    cadenadescifrada = cadenadescifrada + actual;
            }
            System.out.println("La palabra descifrada es : " + cadenadescifrada);
        }

}

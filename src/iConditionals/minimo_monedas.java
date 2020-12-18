package iConditionals;

import libs.Input;

public class minimo_monedas {
    public static void main(String args[])
    {
        int centavos;

        System.out.print("Cuál es tu cambio? ");
        double cantidad = Input.get_double();

        //se hace un cast
        centavos  = (int) (cantidad * 100);
        int monedas25 = (int)(centavos/25);

        centavos = centavos % 25;
        System.out.println("Monedas 25 : " + monedas25);

        int monedas10 = centavos/10;
        centavos = centavos %10;
        System.out.println("Monedas 10 : " + monedas10);

        int monedas5 = centavos/5;
        centavos = centavos%5;
        System.out.println("Monedas 5: " + monedas5);

        int monedas1 = centavos;
        System.out.println("Monedas 1: " + centavos);

        System.out.println("Total monedas : " + (monedas25+monedas10+monedas5+monedas1));
    }
}

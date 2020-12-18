package jStrings;

public class Primo {


    public static void main(String[] args) {
        int number = 15;

        if (esPrimo(number))
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }

    public static boolean esPrimo(int number)
    {
        //0,1 y 4 no son  primos 
        
        int division;
        
        for (int i=2; i<number;i++)
        {
            division = number%i;
            if (division == 0)
                return false;
           }
        return true;
    }

    }

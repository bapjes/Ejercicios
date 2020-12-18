package gNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: "); // System: clase para imprimir en consola
	    int x = Input.get_int(); //  Se pide por un número entero x
	    
	    // prompt user for y
	    System.out.print("y is: ");  // System: clase para imprimir en consola
	    int y = Input.get_int(); //  Se pide por un número entero y
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n");   //Manda a consola el resultado de la suma de "x" y "y"
	}
}
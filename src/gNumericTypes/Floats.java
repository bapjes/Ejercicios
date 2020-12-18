package gNumericTypes;

import libs.Input;

public class Floats {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is ");    //System. Clase que imprime en consola
	    float x = Input.get_float();  // Pide un valor de X
	    
	    // prompt user for y
	    System.out.print("y is ");  //System. Clase que imprime en consola
	    float y = Input.get_float(); // Pide un valor de y
	    
	    // perform division for user
	    System.out.print(x + " divided by " + y + " is " + ( x / y) + "\n");  //manda el resultado de la operación x/y
	}
}



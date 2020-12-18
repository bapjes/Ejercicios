package gNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); //System. Clase que imprime en consola
	    int x = Input.get_int();  //Pide por el valor de x
	    
	    // prompt user for y
	    System.out.print("y is "); //System. Clase que imprime en consola
	    int y = Input.get_int();  // Pide por el valor de Y
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n"); // Se imprime la suma de x + y
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n"); // Se imprime la resta  de x - y
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n"); // Se imprime la multiplicación de x * y
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n"); // Se imprime la división de x / y
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n"); // Se imprime el residuo de x/y
	}
}



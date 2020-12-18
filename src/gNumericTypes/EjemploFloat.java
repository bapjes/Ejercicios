package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		float f = Input.get_float();  // Se pide un flotante
		
		float f2 = Input.get_float(); // Se pide un flotante
		
		Input.print("f/f2 = " + (f/f2));  // Se muestra la división de f/f2
	}

}

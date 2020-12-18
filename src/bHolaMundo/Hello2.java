package bHolaMundo.fHelloWorld;

import libs.Input;

public class Hello2 {

	public static void main(String args[])
	{
		System.out.println("Cual es tu nombre? "); //System : clase para imprimir en consola
		String name = Input.get_string();  // Espera a que se ingrese una cadena
		System.out.println("hello, "+ name );  // Imprime en consola  Hello <name>
	}
}
package gNumericTypes;

public class Overflow {

	public static void main(String args[])
	{
		int n = 1;
		// va a existir un overflow porque el valor de los enteros
		// es de 0 al 4294967295 y este ciclo no considera esta condición
	    for (int i = 0; i < 64; i++)  // Ciclo para recorrer del 0 al 63
	    {
			System.out.println(i);  //Imprimir en consola el valor de i
	    	System.out.print("n: " + n + "\n");  // imprimir el valor de n
	        n = n * 2;  // Se duplica el valor de n
	    }
	}
}




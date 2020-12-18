package jStrings;

public class Empleado {

    String nombre;
    int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }


    public String dameDatos()
    {
        return ("El empleado se llama : " + nombre + " y la edad es " +  edad);
    }
}

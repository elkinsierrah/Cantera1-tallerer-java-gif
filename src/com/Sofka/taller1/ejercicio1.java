package com.Sofka.taller1;
import java.util.Scanner;
public class ejercicio1 {

    public void llamadaE1() {

        Scanner tem = new Scanner(System.in);
        String nombre;
        String apellido;
        String edad;
        String estatura;
        System.out.println("Ingrese Su Nombre");
        nombre = tem.nextLine();
        System.out.println("Ingrese Su Apellido");
        apellido = tem.nextLine();
        System.out.println("Los datos ingresados fueron");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Muchas gracias por ingresar sus datos");
        System.out.println("");
        System.out.println("Presione 'c' para continuar");
        String esperar = tem.nextLine();

    }
}



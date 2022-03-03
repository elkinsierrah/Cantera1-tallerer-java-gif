package com.Sofka.taller1;

import java.util.Scanner;

public class ejercicio3 {
    public void llamadaE3(){
        Scanner tem = new Scanner(System.in);
        System.out.println("Ingrese Su Nombre");
        String nombre = tem.nextLine();
        System.out.println("Ingrese Su Nombre de su Padre");
        String nombrep = tem.nextLine();
        System.out.println("Ingrese Su Apellido de su Padre");
        String apellidop = tem.nextLine();
        System.out.println("Ingrese Su Nombre de su Madre");
        String nombrem = tem.nextLine();
        System.out.println("Ingrese Su Apellido de su Madre");
        String apellidom = tem.nextLine();
        System.out.println("Los datos ingresados fueron");
        System.out.println( "Nombre Completo: "+ nombre +" " + apellidop +" " + apellidom +" " + "Soy hijo de " + nombrep + " " + apellidop +" y  "  + nombrem + " " + apellidom);
        System.out.println( "Muchas gracias por ingresar sus datos");
        System.out.println("");
        System.out.println("Presione 'c' para continuar");
        String esperar = tem.nextLine();
    }
}

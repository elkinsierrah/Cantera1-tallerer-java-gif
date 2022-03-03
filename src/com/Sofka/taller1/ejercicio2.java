package com.Sofka.taller1;
import java.util.Scanner;


public class ejercicio2 {
    public void llamadaE2(){
        Scanner tem = new Scanner(System.in);
        String nombre;
        String apellido;
        String edad;
        String estatura;

        System.out.println("Ingrese Su Nombre");
        nombre = tem.nextLine();
        System.out.println("Ingrese Su Apellido");
        apellido = tem.nextLine();
        System.out.println("Ingrese Su Edad");
        edad = tem.nextLine();
        System.out.println("Ingrese Su Estatura");
        estatura = tem.nextLine();
        System.out.println("Los datos ingresados fueron");
        System.out.println( "Nombre Completo: "+ nombre +" " + apellido);
        System.out.println( "Edad: "+ edad);
        System.out.println( "Estatura: "+ estatura);
        System.out.println( "Muchas gracias por ingresar sus datos");
        System.out.println("");
        System.out.println("Presione 'c' para continuar");
        String esperar = tem.nextLine();
    }

}




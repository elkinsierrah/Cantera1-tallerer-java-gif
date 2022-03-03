package com.Sofka.taller1;

import java.util.Scanner;

public class ejercicio5 {
    public void llamadaE5(){

        Scanner tem = new Scanner(System.in);
        System.out.println("Ingrese Su Nombre de la Mascota");
        String nombre_mascota = tem.nextLine();
        System.out.println("Ingrese el tipo de la Mascota");
        String tipo = tem.nextLine();
        System.out.println("Ingrese la edad de la Mascota");
        String edad_m = tem.nextLine();
        System.out.println("Ingrese Su Nombre del Dueño de la Mascota");
        String nombre_dueño = tem.nextLine();


        System.out.println("Nombre de la Mascota es : " + nombre_mascota + " El cual tiene " + edad_m + " años de Edad, y  " + nombre_dueño + " es su Dueño actual");
        System.out.println("");
        System.out.println("Presione 'c' para continuar");
        String esperar = tem.nextLine();


    }
}

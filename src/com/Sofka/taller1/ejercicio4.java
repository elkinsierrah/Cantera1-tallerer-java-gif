package com.Sofka.taller1;

import java.util.Scanner;

public class ejercicio4 {
    public void llamadaE4(){

        Scanner tem = new Scanner(System.in);
        System.out.println("Ingrese una Ciudad Capital");
        String ciudadc = tem.nextLine();
        System.out.println("Ingrese el País cuya Ciudad Capital ingreso anteriormente");
        String pais = tem.nextLine();

        System.out.println(ciudadc + " es la capital de " + pais);

        System.out.println("");
        System.out.println("Presione 'c' para continuar");
        String esperar = tem.nextLine();


    }
}

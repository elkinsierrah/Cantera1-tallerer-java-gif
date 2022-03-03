package com.Sofka.taller2;
import java.util.Scanner;
public class ejercicio1T2 {
    public void llamadaE1t2() {
        Scanner num = new Scanner(System.in);
        Scanner texto= new Scanner(System.in);
        System.out.println("Esto es ejercicio1 del taller 2");
        System.out.println("");
        System.out.println("Condicional de MAyoria de Edad");
        System.out.println("Ingrese su Edad");
        Integer edad = num.nextInt();
        if (edad >= 18){
            System.out.println("Usted es Mayor de edad");

        }

        System.out.println("");
        System.out.println("Presione 'c' y Enter para continuar");
        String esperar = texto.nextLine();
    }
}
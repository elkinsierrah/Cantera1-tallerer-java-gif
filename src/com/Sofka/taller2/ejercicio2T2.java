package com.Sofka.taller2;
import java.util.Scanner;
public class ejercicio2T2 {
    public void llamadaE2t2() {
        Scanner tem = new Scanner(System.in);
        System.out.println("Esto es ejercicio2 del taller 2");
        System.out.println("");
        System.out.println("Condicional de Menor de Edad");
        System.out.println("Ingrese su Edad");
        Integer edad = tem.nextInt();
        if (edad <= 18){
            System.out.println("Usted es un NIÑO");
        }
        Scanner leer= new Scanner(System.in);

        System.out.println("");
        System.out.println("Presione 'c' y Enter para continuar");
        String esperar = leer.nextLine();
    }
}
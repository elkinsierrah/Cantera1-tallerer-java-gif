package com.Sofka.taller2;
import java.util.Scanner;
public class ejercicio3T2 {
    public void llamadaE3t2() {
        Scanner tem = new Scanner(System.in);
        System.out.println("Esto es ejercicio2 del taller 2");
        System.out.println("Ingrese Su Nombre");
        String nombre = tem.nextLine();
        System.out.println("Ingrese Su Apellido");
        String apellido = tem.nextLine();
        System.out.println("");
        System.out.println("Ingrese su Edad");
        Integer edad = tem.nextInt();
        if (edad >= 18){
            System.out.println("Sr(a) " + nombre + " " +apellido + " Usted es Mayor de Edad por lo tanto puede entrar a la Fiesta" );
        }else{
            System.out.println("Sr(a) " + nombre + " " +apellido + " Usted es Menor de Edad por lo tanto No puede entrar a la Fiesta" );
        }
        Scanner leer= new Scanner(System.in);
        System.out.println("");
        System.out.println("Presione 'c' y Enter para continuar");
        String esperar = leer.nextLine();
    }
}

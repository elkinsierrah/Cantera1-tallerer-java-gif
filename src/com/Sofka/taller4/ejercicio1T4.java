package com.Sofka.taller4;
import java.util.Scanner;

public class ejercicio1T4 {
    Scanner num = new Scanner(System.in);
    int  ingresar, i, control= 4, esperar;
    int [] numeros = new int[5];
    public void llamadaE1t4(){
        System.out.println("           Programa para ingresar 5 números en un Vector Unidimensional");

        System.out.println("Ingrese el 1er Número");
        numeros[0]=num.nextInt();
        System.out.println("Ingrese el 2do Número");
        numeros[1]=num.nextInt();
        System.out.println("Ingrese el 3er Número");
        numeros[2]=num.nextInt();
        System.out.println("Ingrese el 4to Número");
        numeros[3]=num.nextInt();
        System.out.println("Ingrese el 5to Número");
        numeros[4]=num.nextInt();
        mostrar();
    }

    private void mostrar() {
        System.out.println("Los Números Ingresados Son: \n");
        i= 0;
       for (i = 0; i <= control; i++){
           System.out.println("Los Numero Ingresados Son: "+ numeros[i]);

       }
       pausa();
    }
    private void pausa() {
        System.out.println("");
        System.out.println("Ingrese que dese hacer 1. Ingresar otros Numeros / 2. Salir del Ejercicio");
        esperar = num.nextInt();
        if(esperar==1){
            llamadaE1t4();
        }

    }

}

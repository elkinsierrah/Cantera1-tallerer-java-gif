package com.Sofka.taller3;
import java.util.Scanner;
public class ejercicio1T3 {
    int i; int control= 9; int aster;
    public void llamadaE1t3() {
        System.out.println("Asteriscos Inclinados \n");
        for (i = 1; i <= control; i++) {
            for (aster = 1; aster <= i; aster++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        pausa();
    }
    private void pausa() {
        Scanner texto = new Scanner(System.in);
        System.out.println("Presione Enter para continuar");
        String esperar = texto.nextLine();

    }
}


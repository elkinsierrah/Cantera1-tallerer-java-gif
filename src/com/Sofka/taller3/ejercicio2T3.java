package com.Sofka.taller3;
public class ejercicio2T3 {
    int i; int a; int b;
    int aster;
    int right = 20;

    public void llamadaE2t3() {
        for ( i = 0; i < right; i++) {
            for (a = 0; a < right; a++) {
                System.out.print(" ");
            }
            for (b = 0; b < aster; b++){
                System.out.print("*");
            }
            System.out.println();
            aster++;
            right--;
        }

    }
}

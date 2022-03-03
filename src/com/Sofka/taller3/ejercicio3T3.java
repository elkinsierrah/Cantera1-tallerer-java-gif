package com.Sofka.taller3;

import java.util.Scanner;

public class ejercicio3T3 {
    public void llamadaE3t3() {
        int i, j, k, n;
        n = 10;
        for (i = 1; i < n + (n / 2); i++) {
            for (j = n + (n / 2); j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        n=9;
        for (i = 1; i < n - (n / 2); i++) {
           for (j = n + (n / 2); j > 1; j--) {
                System.out.print(" ");
          }
            for (k = n / 2; k <= (n / 2) + 4; k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        n=7;
        for (i = 1; i < n - (n / 2); i++) {
            for (j = n + (n / 2); j > 1; j--) {
                System.out.print(" ");
            }
            for (k = n / 2; k <= (n / 2) + 10; k++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }

        pausa ();
    }

    private void pausa () {
        Scanner texto = new Scanner(System.in);
        System.out.println("Presione Enter para continuar");
        String esperar = texto.nextLine();
    }
}




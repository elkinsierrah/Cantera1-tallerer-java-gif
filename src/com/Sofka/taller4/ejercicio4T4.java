package com.Sofka.taller4;

import java.util.Scanner;

public class ejercicio4T4 {
    Scanner num = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    int i, j, cont = 0, cont2 = 11, cont3 = 10, cont4 = 21, control = 5;
    String result, result2, result3, result4;
    String[][] matriz = new String[5][6];

    public void llamadaE4t4(){

        System.out.println("Matríz Bidimensional forma de Serpiente ");
        del1al5();
    }

    public void del1al5() {
        for (i = 0; i == 0; i++) {
            for (j = 1; j <= control; j++) {
                cont = cont + 1;
                result = String.valueOf("0" + cont);
                matriz[i][j] = result;
                System.out.print(matriz[i][j] + " ");
            }


        }
        System.out.println(" ");
        del10aL6();
    }



    public void del10aL6() {
        for (i = 1; i == 1; i++) {
            for (j = 1; j <= control; j++) {
                cont2 = cont2 - 1;
                if (cont2 == 10) {
                    result2 = String.valueOf(cont2);
                    matriz[i][j] = result2;

                } else {
                    result2 = String.valueOf("0" + cont2);
                    matriz[i][j] = result2;

                }
                System.out.print(matriz[i][j] + " ");
            }

        }
        System.out.println(" ");
        del11aL15();
    }

        public void del11aL15() {
            for (i = 2; i == 2; i++) {
                for (j = 1; j <= control; j++) {
                    cont3 = cont3 + 1;
                    result3 = String.valueOf(cont3);
                    matriz[i][j] = result3;
                    System.out.print(matriz[i][j] + " ");
                }

            }
            System.out.println(" ");
            del16aL20();
        }
    public void del16aL20(){
        for (i = 3; i == 3; i++) {
            for (j = 1; j <= control; j++) {
                cont4 = cont4 - 1;
                result4 = String.valueOf(cont4);
                matriz[i][j] = result4;
                System.out.print(matriz[i][j] + " ");

            }

        }
        System.out.println(" ");
    }
}
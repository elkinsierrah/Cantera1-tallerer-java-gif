package com.Sofka.taller4;

import java.util.Scanner;

public class ejercicio5T4 {
    Scanner num = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    int i,n,p,j, res1,res2,res3,res4,res5,res6,res7,res8,res9,res10;
    int fila, columna,resultado;
    int [][] matriz = new int[11][12];
    public void  llamadaE5t4(){

        System.out.print("                       Programa de resultado de tabla de multiplicar del 1 al 10\n");


        //codigo de la tabla del 1 al 9
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                  C O L U M N A ");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("  |   |    0   |     1    |    2     |    3    |    4    |    5    |    6    |   7     |   8     |    9    |");
        System.out.println( "------------------------------------------------------------------------------------------------------------------");
        System.out.println( "  | 0 |  1 X 1  |  2 X 1  |  3 X 1  |  4 X 1  |  5 X 1  |  6 X 1  |  7 X 1  |  8 X 1  |  9 X 1  |  10 X 1  |");
        System.out.println( "------------------------------------------------------------------------------------------------------------------");
        System.out.println( "  | 1 |  1 X 2  |  2 X 2  |  3 X 2  |  4 X 2  |  5 X 2  |  6 X 2  |  7 X 2  |  8 X 2  |  9 X 2  |  10 X 2  |");
        System.out.println( "------------------------------------------------------------------------------------------------------------------");
        System.out.println("F | 2 |  1 X 3  |  2 X 3  |  3 X 3  |  4 X 3  |  5 X 3  |  6 X 3  |  7 X 3  |  8 X 3  |  9 X 3  |  10 X 3  |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("I | 3 |  1 X 4  |  2 X 4  |  3 X 4  |  4 X 4  |  5 X 4  |  6 X 4  |  7 X 4  |  8 X 4  |  9 X 4  |  10 X 4  |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("L | 4 |  1 X 5  |  2 X 5  |  3 X 5  |  4 X 5  |  5 X 5  |  6 X 5  |  7 X 5  |  8 X 5  |  9 X 5  |  10 X 5  |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("A | 5 |  1 X 6  |  2 X 6  |  3 X 6  |  4 X 6  |  5 X 6  |  6 X 6  |  7 X 6  |  8 X 6  |  9 X 6  |  10 X 6  |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("S | 6 |  1 X 7  |  2 X 7  |  3 X 7  |  4 X 7  |  5 X 7  |  6 X 7  |  7 X 7  |  8 X 7  |  9 X 7  |  10 X 7  |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("  | 7 |  1 X 8  |  2 X 8  |  3 X 8  |  4 X 8  |  5 X 8  |  6 X 8  |  7 X 8  |  8 X 8  |  9 X 8  |  10 X 8  |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("  | 8 |  1 X 9  |  2 X 9  |  3 X 9  |  4 X 9  |  5 X 9  |  6 X 9  |  7 X 9  |  8 X 9  |  9 X 9  |  10 X 9  |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("  | 9 |  1 X 10 | 2 X 10  |  3 X 10 |  4 X 10 |  5 X 10 |  6 X 10 |  7 X 10 |  8 X 10 |  9 X 10 |  10 X 10 |");
        System.out.println("------------------------------------------------------------------------------------------------------------------\n");
        //fin de codigo para alinear tabla del 10
        tabladel1();

    }

    public void tabladel1(){
        i=0;
        p = -1;
        for (i = 1; i <= 10; i++){
        for (j = 0; j == 0; j++) {
            p = p + 1;
            res1 = 1 * i;
            matriz[p][0] = res1;
        }
        }


        tabladel2();
    }
    public void tabladel2(){
        i=0;
        p = -1;
        for (i = 1; i <= 10; i++){
            for (j = 0; j == 0; j++) {
                p = p + 1;
                res2 = 2 * i;
                matriz[p][1] = res2;
            }
        }


        tabladel3();
    }
    public void tabladel3(){

        i=0;
        p = -1;
        for (i = 1; i <= 10; i++){
            for (j = 0; j == 0; j++) {
                p = p + 1;
                res3 = 3 * i;
                matriz[p][2] = res3;
            }
        }
        tabladel4();
    }
    public void tabladel4(){
        i=0;
        p = -1;
        for (i = 1; i <= 10; i++){
            for (j = 0; j == 0; j++) {
                p = p + 1;
                res4 = 4 * i;
                matriz[p][3] = res4;
            }
        }

        tabladel5();
    }
    public void tabladel5(){
        i=0;
        p = -1;
        for (i = 1; i <= 10; i++){
            for (j = 0; j == 0; j++) {
                p = p + 1;
                res5 = 5 * i;
                matriz[p][4] = res5;
            }
        }

        tabladel6();
    }
    public void tabladel6(){
        i=0;
        p = -1;
        for (i = 1; i <= 10; i++){
            for (j = 0; j == 0; j++) {
                p = p + 1;
                res6 = 6 * i;
                matriz[p][5] = res6;
            }
        }

        tabladel7();
    }
    public void tabladel7(){
        i=0;
        p = -1;
        for (i = 1; i <= 10; i++){
            for (j = 0; j == 0; j++) {
                p = p + 1;
                res7 = 7 * i;
                matriz[p][6] = res7;
            }
        }

        tabladel8();
    }
    public void tabladel8(){

        i=0;
        p = -1;
        for (i = 1; i <= 10; i++){
            for (j = 0; j == 0; j++) {
                p = p + 1;
                res8 = 8 * i;
                matriz[p][7] = res8;
            }
        }
        tabladel9();
    }
    public void tabladel9(){

        i=0;
        p = -1;
        for (i = 1; i <= 10; i++){
            for (j = 0; j == 0; j++) {
                p = p + 1;
                res9 = 9 * i;
                matriz[p][8] = res9;
            }
        }
        tabladel10();
    }
    public void tabladel10(){
        i=0;
        p = -1;
        for (i = 1; i <= 10; i++){
            for (j = 0; j == 0; j++) {
                p = p + 1;
                res10 = 10 * i;
                matriz[p][9] = res10;
            }
        }
        resMultiplicar();
    }
    public void resMultiplicar(){
        System.out.println("Ingrese la coordenada de resultado según el cuadro\n");
        System.out.println("Ingrese la Fila");
        fila = num.nextInt();
        System.out.println("Ingrese la Fila");
        columna = num.nextInt();
        resultado = matriz[fila][columna];

        System.out.println("Resultado de la multiplicación De: Fila # "+ fila+ " y la columna # "+ columna + " la Multiplicación es: " +  resultado +"\n");
        System.out.println("Desea realizar otro calculo?   1. Si / 2. No");
        int regresar = texto.nextInt();
        if (regresar == 1){
            resMultiplicar();
        }

    }


}

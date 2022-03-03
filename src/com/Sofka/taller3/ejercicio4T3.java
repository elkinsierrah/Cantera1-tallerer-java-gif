package com.Sofka.taller3;
import java.util.Scanner;

public class ejercicio4T3 {
    int nume; int i; int n=10; int res;
    Scanner num = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    public void  llamadaE4t3(){
        System.out.println("Bienvenido Tabla de Multiplicar");
        System.out.println("Ingrese el número a multiplicar");
        nume=num.nextInt();
        for (i=1; i<=n; i++){
            res=nume * i;
            System.out.println( nume +" X " + i + " = " + res);

        }
         pausa();

        }
    private void pausa() {
        Scanner texto = new Scanner(System.in);
        System.out.println("Presione Enter para continuar");
        String esperar = texto.nextLine();
    }
}

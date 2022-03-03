package com.Sofka.taller3;
import java.util.Scanner;
public class ejercicio5T3 {
    Scanner num = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    int fin;
    int opcion = 1;
    String nombres;


    public void llamadaE5t3() {
        fin = opcion;
        do {
            System.out.println("Bienvenido escoja una opción \n");
            System.out.println("1. Capturar nombre");
            System.out.println("2. Saludar Persona");
            System.out.println("0. Salir del Menú");
            opcion = num.nextInt();
            switch (opcion) {
                case 1 -> capturarNombre();
                case 2 -> saludarPerson();

            }
        }while(fin == 0 );

    }

        public void capturarNombre () {
            System.out.println("Ingrese Su Nombre y apellido");
            nombres = texto.nextLine();
            llamadaE5t3();

        }
        public void saludarPerson () {
            System.out.println("Hola Sr(a) " + nombres + " tenga usted un excelente día");
            System.out.println("");
            System.out.println("Presione  Enter para continuar");
            String esperar = texto.nextLine();
            llamadaE5t3();

        }

    }





package com.Sofka.taller3;
import java.util.Scanner;

public class ejercicio6T3 {
    Scanner num = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    int contacto1 = 0, contacto2 = 0, contacto3 = 0, opcion = 1, opcion2;
    String nombre1, nombre2, nombre3, org1, org2, org3, tlf1, tlf2, tlf3, salir, esperar;
     static volatile boolean fin = true;
    public void llamadaE6T3() {

        System.out.println("Sistema de Almacenamiento de contactos \n");
        System.out.println("Bienvenido escoja una opción");
        System.out.println("1. Agregar un Contacto");
        System.out.println("2. Consultar Contactos");
        System.out.println("3. Salir del Menú");
        opcion = num.nextInt();
        switch (opcion) {
            case 1 -> agregarContacto();
            case 2 -> consultarContactos();
            case 3 -> salir();
        }
    }




        public void agregarContacto () {
            if (contacto1 == 0) {
                System.out.println("Ingrese el Nombre y apellido del 1er contacto");
                nombre1 = texto.nextLine();
                System.out.println("Ingrese el telefono del 1er contacto");
                tlf1 = texto.nextLine();
                System.out.println("Ingrese la organización del 1er contacto");
                org1 = texto.nextLine();
                contacto1 = 1;
            } else {
                System.out.println("Ya existe un 1er contactacto en tu agenda \n");

                if (contacto2 == 0) {
                    System.out.println("Ingrese el Nombre y apellido del 2do contacto");
                    nombre2 = texto.nextLine();
                    System.out.println("Ingrese el telefono del 2do contacto");
                    tlf2 = texto.nextLine();
                    System.out.println("Ingrese la organización del 2do contacto");
                    org2 = texto.nextLine();
                    contacto2 = 1;
                } else {
                    System.out.println("Ya existe un 2do contactacto en tu agenda \n");

                    if (contacto3 == 0) {
                        System.out.println("Ingrese el Nombre y apellido del 3er contacto");
                        nombre3 = texto.nextLine();
                        System.out.println("Ingrese el telefono del 3er contacto");
                        tlf3 = texto.nextLine();
                        System.out.println("Ingrese la organización del 3er contacto");
                        org3 = texto.nextLine();
                        contacto3 = 1;
                    } else {
                        System.out.println("Ya existe un 3er contactacto en tu agenda \n");
                        System.out.println("¡¡¡Atención!!!... Agenda Llena no puede Agregar más contactos \n");
                    }

                }

            }
            pausa();
        }

        private void pausa () {
            System.out.println("");
            System.out.println("Presione Enter para continuar");
            esperar = texto.nextLine();
            llamadaE6T3();
        }

        public void consultarContactos () {
            System.out.println("Consulta de Contactos de Agenda \n");
            System.out.println(" 1er Contacto de la agenda");
            System.out.println("Nombre y Apellido " + nombre1);
            System.out.println("Telefono del Contacto " + tlf1);
            System.out.println("Organización " + org1);
            System.out.println(" ________________________________________________");
            System.out.println(" 2do Contacto de la agenda");
            System.out.println("Nombre y Apellido " + nombre2);
            System.out.println("Telefono del Contacto " + tlf2);
            System.out.println("Organización " + org2);
            System.out.println(" ________________________________________________");
            System.out.println(" 3er Contacto de la agenda");
            System.out.println("Nombre y Apellido " + nombre3);
            System.out.println("Telefono del Contacto " + tlf3);
            System.out.println("Organización " + org3);
            pausa();

        }
        public void salir(){
                System.out.println(" Se perderán los datos. ¿Seguro que desea Salir de La agenda? 1. Si / 2. No");
                opcion2 = num.nextInt();
                if (opcion2 == 1) {
                    fin = false;
                }else { if (opcion2 == 2) {
                        llamadaE6T3();
                    }
                }
            }

        }


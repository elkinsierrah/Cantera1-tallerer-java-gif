package com.Sofka.taller2;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;

public class ejercicio6T2 {
    Scanner num = new Scanner(System.in);
    Scanner texto= new Scanner(System.in);

    String nombre; String placa; String marca; String tipo; String tipofalla; String status; String retrazo; String esperar;
    String comentariomecanico; String placaB; String placaC; String user="cliente" ; int pass=1234;

    private static boolean validar = true;
    private static int opcion;

    public void llamadaE6T2() throws IOException {
        do {
            menu1();
            opcion = addOpcion();
            validar = Opciones(opcion);
        } while (validar==false);
    }
    private static void menu1() {
        System.out.println("Escoja  una opción del taller Mécanico");
        System.out.println("1. Ingresar servicio mecanico");
        System.out.println("2. Finalizar servicio");
        System.out.println("3  ingreso a portal");
        System.out.println("0. Finalizar programa");
    }
    private static int addOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private void ingresoServicio() {
        System.out.println("Bienvenido Zona de Servicio de Mécanico");
        System.out.println("");
        System.out.println("ingrese el Nombre del Cliente");
        nombre = texto.nextLine();
        System.out.println("ingrese la placa de la Moto");
        placa = texto.nextLine();
        System.out.println("ingrese la marca de la Moto");
        marca = texto.nextLine();
        System.out.println("ingrese la tipo de la Moto");
        tipo = texto.nextLine();
        System.out.println("ingrese el tipo de falla");
        tipofalla = texto.nextLine();
        status="En reparación";
        try {
            mostrarDato();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mostrarDato() throws IOException {
        Scanner texto= new Scanner(System.in);
        System.out.println("Ha ingresado correctamente a Servicio mecanico los siguente datos");
        System.out.println("Moto: " +marca + " tipo " +tipo+ " placa " + placa +" del cliente: " +nombre );
        System.out.println("la cual presenta la siguiente falla " + tipofalla);
        System.out.println("Su Status actual es: " + status);
        pausa();
    }

    private void finalServicio() {
        System.out.println("Bienvenido Finalizar Servicio  Mécanico");
        System.out.println("" );
        System.out.println("ingrese la placa de la Moto");
        placaB = texto.nextLine();

        if (Objects.equals(placa, placaB)){
                retiroServicio();
        }else{
            System.out.println("La placa " +placaB + " que ingreso no es correcta");
        }
        pausa();
        }
    private void pausa() {
        System.out.println("");
        System.out.println("Presione Enter para continuar");
        esperar = texto.nextLine();
        try {
            llamadaE6T2();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void retiroServicio() {
        System.out.println("La moto  placa " + placa + " en fin de servicio");
        System.out.println("Desea ( 1. Finanlizar el servicio ) o (2. comentar)");
        int retiro = num.nextInt();
        switch (retiro){
            case 1:
                System.out.println("La placa de retiro es " + placaB);
                System.out.println("seguro que desea Finalizar el servicio use (1. Si ) o (2. No)");
                    int finNo = num.nextInt();
                if (finNo==1){
                    System.out.println("Que respuestos uso para reparar la Motos placa " + placaB);
                    String repuesto = texto.nextLine();
                    status = "Lista para entregar";
                    System.out.println("");
                    System.out.println("La Moto esta lista para entregar el status " + status);
                    System.out.println("La Moto Marca " + marca);
                    System.out.println("tipo: " + tipo);
                    System.out.println("Placa: " + placaB);
                    System.out.println(" Con la Falla: " + tipofalla);
                    System.out.println("La cual se uso los respuestos:  " + repuesto);
                    System.out.println("Informar al Sr(a): " + nombre + " que su moto esta lista ");



                }else{
                    System.out.println("Indique el comentarios de la moto placa " + placaB+ " que inconveniente tiene");
                    comentariomecanico = texto.nextLine();
                    status =  "Moto con problemas aún en taller";



                }
                pausa();
            case 2:
                System.out.println("Indique la causa del retrazo de la entrega de la moto");
                retrazo = texto.nextLine();
                System.out.println("Su comentario ha sido guardado con exito");

                pausa();
        }
    }
    private void ingresoPortal() {
        System.out.println("Bienvenidos al Portal de Mécanica de Moto");
        System.out.println("Aquí puede consultar el estado de su moto");
        System.out.println("Ingrese su usuario");
        String userent = texto.nextLine();
        System.out.println("Ingrese su Clave");
        int passent = num.nextInt();
        if (user.equals(userent) & (pass == passent)) {
            System.out.println("ingrese la placa de la Moto");
            placaC = texto.nextLine();
            if (Objects.equals(placa, placaC)){
                System.out.println("Sr(a) " +nombre + " su moto es: ");
                System.out.println("Moto placa:" + placa);
                System.out.println("Marca:" + marca );
                System.out.println("Tipo:" + tipo);
                System.out.println("Tipo de Falla:" + tipofalla);
                System.out.println("Status de reparación :" + status);
                System.out.println("Comentario :" + comentariomecanico);
                System.out.println("Causa de retrazo:" + retrazo);
                pausa();

            }else{
                System.out.println("La placa " +placaC + " que ingreso no es correcta");
            }
            pausa();
        } else {


            System.out.println("La placa " + placaB + " que ingreso no es correcta intente nuevamente");

            pausa();


        }
    }

    private boolean Opciones(int opcion) throws IOException {
        switch (opcion) {
            case 1 ->ingresoServicio();

            case 2 ->finalServicio();

            case 3 ->ingresoPortal();

        }
        return true;
    }


}















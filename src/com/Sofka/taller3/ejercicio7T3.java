package com.Sofka.taller3;
import java.awt.*;
import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;
import java.text.SimpleDateFormat;
public class ejercicio7T3 {
    Scanner num = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);

    boolean salir =true, fin;
    int opcion, opcion2, ingreso = 0;
    String control1="Vacio",control2="Vacio",control3="Vacio",control4="Vacio",control5="Vacio";
    String placa1="Vacio",placa2="Vacio",placa3="Vacio",placa4="Vacio",placa5="Vacio";
    String nombre1="Vacio", nombre2="Vacio", nombre3="Vacio", nombre4="Vacio", nombre5="Vacio";
    String tlf1="Vacio", tlf2="Vacio",tlf3="Vacio", tlf4="Vacio", tlf5="Vacio", marca1="Vacio";
    String marca2="Vacio", marca3="Vacio", marca4="Vacio", marca5="Vacio", retirar="Vacio", esperar;
    String fechain1="Vacio",fechain2="Vacio",fechain3="Vacio",fechain4="Vacio",fechain5="Vacio";
    String fechaout1="Vacio",fechaout2="Vacio",fechaout3="Vacio",fechaout4="Vacio",fechaout5="Vacio";


    public void llamadaE7T3() throws IOException {
        do {
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (!salir);

    }
    public void menu(){
        System.out.println("Bienvenido escoja una opción \n");
        System.out.println("1. Ingresar Vehiculo al Parqueadero");
        System.out.println("2. Consultar parqueadero");
        System.out.println("3. Retirar Vehiculo de Parqueadero");
        System.out.println("4. Salir de Sistema");
    }
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1-> ingresarVehiculo();

            case 2-> consultarParqui();

            case 3-> retirarVehiculo();

            case 4-> salirSistema();

            default->{
                System.out.println("Opción incorrecta");
                menu();
            }
        }
        return true;
    }
    private void ingresarVehiculo() throws IOException {
        if (ingreso == 5){ System.out.println("Parqueadero lleno, No puede ingresar más vehiculos"); menu();}
        System.out.println("Ingreso al Parqueadero");
        System.out.println("Indique en el puesto del parquedero que desee usar\n");
        System.out.println("Hasta ahora se han ingresado " + ingreso + " vehiculos");
        System.out.print("1. Parquedadero A1 ");if (placa1.equals("Vacio")) {System.out.print("Disponible\n");} else {System.out.print("En Uso\n");}
        System.out.print("2. Parquedadero A2 ");if (placa2.equals("Vacio")) {System.out.print("Disponible\n");} else {System.out.print("En Uso\n");}
        System.out.print("3. Parquedadero A3 ");if (placa3.equals("Vacio")) {System.out.print("Disponible\n");} else {System.out.print("En Uso\n");}
        System.out.print("4. Parquedadero A4 ");if (placa4.equals("Vacio")) {System.out.print("Disponible\n");} else {System.out.print("En Uso\n");}
        System.out.print("5. Parquedadero A6 ");if (placa5.equals("Vacio")) {System.out.print("Disponible\n");} else {System.out.print("En Uso\n");}
        System.out.println("Escoja que Puesto ocupara el Vehiculo");
        opcion2 = num.nextInt();
        if (ingreso != 5) {
            switch (opcion2) {
                case 1 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese la placa del vehiculo");
                    placa1 = texto.nextLine();
                    System.out.println("Ingrese la marca del vehiculo");
                    marca1 = texto.nextLine();
                    System.out.println("Ingrese el Nombre del conductor del vehiculo");
                    nombre1 = texto.nextLine();
                    System.out.println("Ingrese el teléfono del conductor del vehiculo");
                    tlf1 = texto.nextLine();
                    fechain1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    control1="Parqueado";

                }
                case 2 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese la placa del vehiculo");
                    placa2 = texto.nextLine();
                    System.out.println("Ingrese la marca del vehiculo");
                    marca2 = texto.nextLine();
                    System.out.println("Ingrese el Nombre del conductor del vehiculo");
                    nombre2 = texto.nextLine();
                    System.out.println("Ingrese el teléfono del conductor del vehiculo");
                    tlf2 = texto.nextLine();;
                    fechain2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    control2="Parqueado";
                }
                case 3 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese la placa del vehiculo");
                    placa3 = texto.nextLine();
                    System.out.println("Ingrese la marca del vehiculo");
                    marca3 = texto.nextLine();
                    System.out.println("Ingrese el Nombre del conductor del vehiculo");
                    nombre3 = texto.nextLine();
                    System.out.println("Ingrese el teléfono del conductor del vehiculo");
                    tlf3 = texto.nextLine();
                    fechain3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    control3="Parqueado";
                }
                case 4 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese la placa del vehiculo");
                    placa4 = texto.nextLine();
                    System.out.println("Ingrese la marca del vehiculo");
                    marca4 = texto.nextLine();
                    System.out.println("Ingrese el Nombre del conductor del vehiculo");
                    nombre4 = texto.nextLine();
                    System.out.println("Ingrese el teléfono del conductor del vehiculo");
                    tlf4 = texto.nextLine();
                    fechain4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    control4="Parqueado";
                }
                case 5 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese la placa del vehiculo");
                    placa5 = texto.nextLine();
                    System.out.println("Ingrese la marca del vehiculo");
                    marca5 = texto.nextLine();
                    System.out.println("Ingrese el Nombre del conductor del vehiculo");
                    nombre5 = texto.nextLine();
                    System.out.println("Ingrese el teléfono del conductor del vehiculo");
                    tlf5 = texto.nextLine();
                    fechain5 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    control5="Parqueado";
                }
            }pausa();
        }else{System.out.println("Parqueadero lleno, No puede ingresar más vehiculos"); pausa(); }

    }

    private void consultarParqui() throws IOException {
        System.out.println("                           Consulta de Puestos");
        System.out.println("                   Vehiculos ingresados al Parqueadero");
        System.out.println("____________________________________________________________________________________________");
        if (placa1=="Vacio"){ System.out.println("Parqueadero A-1 (Disponible)");}else{
            System.out.println("Parqueadero A-1 ----------- Vehiculo " + control1);
            System.out.println("Placa del vehiculo" + placa1 + "------------ Marca " + marca1);
            System.out.println("nombre del Conductor " + nombre1);
            System.out.println("Teléfono del Conductor " + tlf1);
            System.out.println("Fecha y Hora de Entrada " + fechain1 );
            if(control1 == "Retirado"){  System.out.println("Fecha de retiro " + fechaout1+ "\n");}

        }
        System.out.println("____________________________________________________________________________________________");
        if (placa2=="Vacio"){ System.out.println("Parqueadero A-2 (Disponible)");}else{
            System.out.println("Parqueadero A-2 ----------- Vehiculo " + control2);
            System.out.println("Placa del vehiculo" + placa2 + "------------ Marca " + marca2);
            System.out.println("nombre del Conductor " + nombre2);
            System.out.println("Teléfono del Conductor " + tlf2);
            System.out.println("Fecha y Hora de Entrada " + fechain2 );
            if(control2 == "Retirado"){  System.out.println("Fecha de retiro " + fechaout2+ "\n");}

        }
        System.out.println("____________________________________________________________________________________________");
        if (placa3=="Vacio"){ System.out.println("Parqueadero A-3 (Disponible)");}else{
            System.out.println("Parqueadero A-3 ----------- Vehiculo " + control3);
            System.out.println("Placa del vehiculo" + placa3 + "------------ Marca " + marca3);
            System.out.println("nombre del Conductor " + nombre3);
            System.out.println("Teléfono del Conductor " + tlf3);
            System.out.println("Fecha y Hora de Entrada " + fechain3 );
            if(control3 == "Retirado"){  System.out.println("Fecha de retiro " + fechaout3+ "\n");}

        }
        System.out.println("____________________________________________________________________________________________");
        if (placa4=="Vacio"){ System.out.println("Parqueadero A-4 (Disponible)");}else{
            System.out.println("Parqueadero A-4 ----------- Vehiculo " + control4);
            System.out.println("Placa del vehiculo" + placa4 + "------------ Marca " + marca4);
            System.out.println("nombre del Conductor " + nombre4);
            System.out.println("Teléfono del Conductor " + tlf4);
            System.out.println("Fecha y Hora de Entrada " + fechain4 );
            if(control4 == "Retirado"){  System.out.println("Fecha de retiro " + fechaout4+ "\n");}

        }
        System.out.println("____________________________________________________________________________________________");
        if (placa5=="Vacio"){ System.out.println("Parqueadero A-5 (Disponible)");}else{
            System.out.println("Parqueadero A-5 ----------- Vehiculo " + control5);
            System.out.println("Placa del vehiculo" + placa5 + "------------ Marca " + marca5);
            System.out.println("nombre del Conductor " + nombre5);
            System.out.println("Teléfono del Conductor " + tlf5);
            System.out.println("Fecha y Hora de Entrada " + fechain5 );
            if(control5 == "Retirado"){  System.out.println("Fecha de retiro " + fechaout5+ "\n");}

        }
        llamadaE7T3();

    }
    private void retirarVehiculo() throws IOException {
        System.out.println("Retirar Vehiculo del parqueadero \n");
        System.out.println("Ingrese la placa del vehiculo que se retira");
        retirar = texto.nextLine();
        if (Objects.equals(retirar, placa1)) {
            fechaout1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
            control1 = "Retirado";
        } else {
            if (Objects.equals(retirar, placa2)) {
                fechaout2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                control2 = "Retirado";
            } else {
                if (Objects.equals(retirar, placa3)) {
                    fechaout3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    control3 = "Retirado";
                } else {
                    if (Objects.equals(retirar, placa4)) {
                        fechaout4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                        control4 = "Retirado";
                    } else {
                        if (Objects.equals(retirar, placa5)) {
                            fechaout5 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                        } else {
                            System.out.println("La placa que Introdujo no es Correta verifique e intente nuevamente");
                            control5 = "Retirado";
                        }
                    }
                }
            }
        }
        llamadaE7T3();
    }



            private void pausa () throws IOException {
                System.out.println("");
                System.out.println("Presione Enter para continuar");
                esperar = texto.nextLine();
                llamadaE7T3();
            }
            private void salirSistema () throws IOException {
                System.out.println(" Se perderán los datos. ¿Seguro que desea Salir del Parquedero? 1. Si / 2. No");
                opcion2 = num.nextInt();
                if (opcion2 == 1) {
                    salir = false;
                } else {
                    if (opcion2 == 2) {
                        llamadaE7T3();
                    }
                }
            }

        }



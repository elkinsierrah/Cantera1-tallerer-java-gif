package com.Sofka.taller2;
import java.util.Objects;
import java.util.Scanner;
public class ejercicio10T2 {
    Scanner num = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    String user = "admin"; int pass=1234; String nombres; String cc;
    int opcion; String tipoCuenta; int opciontipo; int numcuenta;
    int cont=100001; int cont2=100001; float cantidad; int consul;
    String buscarCc; String esperar; int consult2; float retiro; int opcion2;
    public void llamadaE10T2() {
        System.out.println("            Bienvenido a su Banco Fíel");
        System.out.println(" Menú de Instruciones ");
        System.out.println(" 1. Crear Cuenta");
        System.out.println(" 2. Consultar Cuentas");
        System.out.println(" 3. Cambio de Clave");
        System.out.println(" 4. retiro");
        System.out.println(" 0. Salir");

        opcion = num.nextInt();
        switch (opcion) {
            case 1 -> abrirCuenta();
            case 2 -> consulta();
            case 3 -> cambioClave();
            case 4 -> retiroCuenta();
        }
    }

    public void abrirCuenta() {
        System.out.println("            Bienvenido a zona de Apertura de Cuenta");
        System.out.println(" ");
        System.out.println("ingrese el Tipo de cuenta 1. Ahorro / 2. Corriente");
        opciontipo = num.nextInt();
        if (opciontipo == 1) { tipoCuenta = "Ahorro";  } else { tipoCuenta = "Corriente"; }
        if (tipoCuenta.equals("Ahorro")) { cont = cont + 1; numcuenta= cont; } else{  cont2 = cont2 + 1; numcuenta= cont2;}
        System.out.println("Número de cuenta: " + cont);
        System.out.println("ingrese el Nombre completo del titular de la Cuenta");
        nombres = texto.nextLine();
        System.out.println("ingrese la cédula del Titular de la Cuenta");
        cc = texto.nextLine();
        System.out.println("ingrese la cantidad de Depósito");
        cantidad=num.nextFloat();
        System.out.println("La cuenta ha sido agregada satisfactoriamente");
        System.out.println(" ");
        System.out.println("¿Desea consultar? 1. Si / 2. No");
        consul=num.nextInt();
        if (consul==1){ consulta(); }else{ llamadaE10T2();  }



    }
    private void consulta(){
        System.out.println("ingrese el numero de Cédula del Titular de la cuenta");
        buscarCc=texto.nextLine();
        System.out.println("            Consultas de Cuentas");
        if (Objects.equals(buscarCc, cc)){
            System.out.println("Cuenta de: "+ tipoCuenta + " Número "+ numcuenta);
            System.out.println("Nombres del titular: "+ nombres);
            System.out.println("Número de Cédula: "+ cc);
            System.out.println("Cantidad en Cuenta: "+ cantidad);


        }else{
            System.out.println("El número de Cédula que introdujo no es correcta");
            System.out.println("¿Desea intentar de nuevor? 1. Si / 2. No");
            consult2=num.nextInt();
            if (consult2==1){ consulta(); }else{ llamadaE10T2();  }
        }
            pausa();
    }
    private void pausa() {
        System.out.println("");
        System.out.println("Presione Enter para continuar");
        esperar = texto.nextLine();
        llamadaE10T2();
    }

    public void cambioClave(){
        System.out.println("Bienvenido a su cambio de Clave");
        System.out.println(" ");
        System.out.println("Ingrese su Usuario");
        String bUser = texto.nextLine();
        System.out.println("Ingrese su Clave");
        int bPass = num.nextInt();
        if (user.equals(bUser) & pass==bPass ){
            System.out.println("Bienvenido Sr(a) " + nombres + " Cuenta de " + tipoCuenta + " Número " + numcuenta);
            System.out.println(" ");
            System.out.println("Ingrese su nueva Clave");
            int nclave = num.nextInt();
            pass = nclave;
            System.out.println("Su Clave se ha  Cambiado Correctamente");
            System.out.println("Gracias por Preferirnos");
            pausa();

        }else{
            System.out.println("El Usuario o la Clave que introdujo no es correcta");
            System.out.println("¿Desea intentar de nuevo? 1. Si / 2. No");
            consult2=num.nextInt();
            if (consult2==1){ cambioClave(); }else{ llamadaE10T2();  }
        }


    }
    public void retiroCuenta(){
        System.out.println("Ingrese su Clave");
        int bPass = num.nextInt();
        if (pass==bPass ){
            System.out.println("Bienvenido Sr(a) " + nombres + " Cuenta de " + tipoCuenta + " Número " + numcuenta);
            System.out.println(" ");
            System.out.println("                   Retiros de Efectivo");
            System.out.println("1.  20.000                                       5.  400.000   ");
            System.out.println("2.  50.000                                       6.  500.000   ");
            System.out.println("3. 100.000                                       7.  600.000   ");
            System.out.println("4. 200.000                                       8.  Otro monto");
            opcion2=num.nextInt();
            switch (opcion2) {
                case 1 -> {
                    retiro = cantidad - 20000;
                    cantidad = retiro;
                    System.out.println("Bienvenido Sr(a) " + nombres + " Operación Satisfactoria ");
                    System.out.println(" Su nuevo saldo es: " + cantidad);
                }
                case 2 -> {
                    retiro = cantidad - 50000;
                    cantidad = retiro;
                    System.out.println("Bienvenido Sr(a) " + nombres + " Operación Satisfactoria ");
                    System.out.println(" Su nuevo saldo es: " + cantidad);
                }
                case 3 -> {
                    retiro = cantidad - 100000;
                    cantidad = retiro;
                    System.out.println("Bienvenido Sr(a) " + nombres + " Operación Satisfactoria ");
                    System.out.println(" Su nuevo saldo es: " + cantidad);
                }
                case 4 -> {
                    retiro = cantidad - 200000;
                    cantidad = retiro;
                    System.out.println("Bienvenido Sr(a) " + nombres + " Operación Satisfactoria ");
                    System.out.println(" Su nuevo saldo es: " + cantidad);
                }
                case 5 -> {
                    retiro = cantidad - 400000;
                    cantidad = retiro;
                    System.out.println("Bienvenido Sr(a) " + nombres + " Operación Satisfactoria ");
                    System.out.println(" Su nuevo saldo es: " + cantidad);
                }
                case 6 -> {
                    retiro = cantidad - 500000;
                    cantidad = retiro;
                    System.out.println("Bienvenido Sr(a) " + nombres + " Operación Satisfactoria ");
                    System.out.println(" Su nuevo saldo es: " + cantidad);
                }
                case 7 -> {
                    retiro = cantidad - 600000;
                    cantidad = retiro;
                    System.out.println("Bienvenido Sr(a) " + nombres + " Operación Satisfactoria ");
                    System.out.println(" Su nuevo saldo es: " + cantidad);
                }
                case 8 -> {
                    System.out.println("Por favor ingrese la cantidad que desea retirar");
                    retiro = num.nextFloat();
                    cantidad = retiro;
                    System.out.println("Bienvenido Sr(a) " + nombres + " Operación Satisfactoria ");
                    System.out.println(" Su nuevo saldo es: " + cantidad);
                }
            }
            pausa();

        }else{
            System.out.println("El Usuario o la Clave que introdujo no es correcta");
            System.out.println("¿Desea intentar de nuevo? 1. Si / 2. No");
            consult2=num.nextInt();
            if (consult2==1){ cambioClave(); }else{ llamadaE10T2();  }
        }



    }
}

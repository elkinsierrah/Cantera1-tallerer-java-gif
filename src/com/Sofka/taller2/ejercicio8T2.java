package com.Sofka.taller2;
import com.Sofka.Main;

import java.util.Objects;
import java.util.Scanner;
public class ejercicio8T2 {
    Scanner num = new Scanner(System.in);
    Scanner texto= new Scanner(System.in);
    String nombres; int opcion; String pedido;
    int opcion1; int opcion2; int opcion3;
    int opcion4; int opcion5; int opcion6;
    String forma; String sabor; String relleno;
    String direccion; int fin; int precio; int preciochis;
    int cant; int subprecio; String user="user"; int pass=1234;

    public void llamadaE8T2() {
        System.out.println("Bienvenido a su Pasteleria preferida");
        System.out.println("Para personalizar su pedido indiquenos su Nombre y Apellido");
        nombres = texto.nextLine();
        System.out.println("Bienvenido Sr(a) " + nombres + " Indique sus preferencias");
        menu1();
    }

    private void menu1() {
        System.out.println("Escoja una opción");
        System.out.println("1. Realizar Pedido");
        System.out.println("2. Consultar Lista de Producto");
        System.out.println("3. Zona de Empleado");
        opcion = num.nextInt();
        switch (opcion){
            case 1-> pedidos();
            case 2-> consultas();
            case 3-> empleados();
        }
    }

    private void pedidos() {
        System.out.println("¿Que desea pedir?");
        System.out.println("1. Tortas");
        System.out.println("2. Muffins");
        System.out.println("3. Postres Frios");
        opcion2 = num.nextInt();
        switch (opcion2) {
            case 1-> {
                pedido = "Torta";
                System.out.println("¿Que que forma quiere en la Torta?");
                System.out.println("1. Redonda");
                System.out.println("2. Cuadrada");
                System.out.println("3. Rectancular");
                opcion3 = num.nextInt();
                switch (opcion3) {
                    case 1 -> forma = "Redonda";
                    case 2 -> forma = "Cuadrada";
                    case 3 -> forma = "Rectangular";
                }
                sabor();
            }


            case 2-> {
                pedido = "Muffins";
                System.out.println("Indique la  cantidad de Muffins que quiere pedir?");
                cant = num.nextInt();
                sabor();
            }

            case 3-> {
                pedido = "Postre Frio";
                System.out.println("¿Que que sabor desea llevar?");
                System.out.println("1. Chocolate con Mantecado");
                System.out.println("2. Fresa con Vainilla");
                System.out.println("3. Tres Leches");
                System.out.println("4. Chocolate con Oreo");
                opcion3 = num.nextInt();
                switch (opcion3){
                    case 1-> {
                        sabor = "Chocolate con Mantecado";
                        precio=12000;
                        relleno=" ";
                    }
                    case 2-> {
                        sabor = "Fresa con Vainilla";
                        precio=12000;
                        relleno=" ";
                    }
                    case 3-> {
                        sabor = "Tres Leches";
                        precio=12000;
                        relleno=" ";

                    }
                    case 4-> {
                        sabor = "Chocolate con Oreo";
                        precio=12000;
                        relleno=" ";
                    }

                }
                resutadoPedido();
            }
        }
    }


        private void sabor() {
            System.out.println("¿Indique Sabor?");
            System.out.println("1. Chocolate");
            System.out.println("2. Fresa");
            System.out.println("3. Vainilla");
            opcion4 = num.nextInt();
            switch (opcion4) {
                case 1 -> sabor = "Chocolate";

                case 2 -> sabor = "Fresa";

                case 3 -> sabor = "Vainilla";
            }
                rellenos();
        }

        private void rellenos() {
            System.out.println("¿Desea " + pedido + " con relleno? 1. Si / 2. No");
            opcion5 = num.nextInt();
            if (opcion5 == 1) {
                relleno = "con Relleno";
                precio = 12000;
            }
            if (opcion5 == 2) {
                relleno = "sin Relleno";
                precio = 10000;
            }
            if (opcion5 != 1 & opcion5 != 2) {

                System.out.println("El valor ingresado no es correcto vuelva a intentar");
                rellenos();
            } else {
                if (pedido == "Torta") {
                    resutadoPedido();
                } else {
                    if (pedido == "Muffins") {
                        chispas();
                    }
                }
            }
        }


    private void chispas() {
        System.out.println("¿Desea " + pedido + " con chispas? 1. Si / 2. No");
        opcion5 = num.nextInt();
        if (opcion5 == 1) {
            relleno = "con Chispas";
            preciochis = 500 * cant;
            subprecio = 2000 * cant;
            precio = subprecio + preciochis;
        } if (opcion5 == 2) {
                relleno = "sin Chispas";
                precio = 10000 * cant;
            }  if (opcion5 !=1 & opcion5 !=2 ){

            System.out.println("El valor ingresado no es correcto vuelva a intentar");
            chispas();
        }


        resutadoPedido();
    }


    private void consultas() {
        System.out.println("Consultas de Productos");
        System.out.println("");
        System.out.println("Lista de Tortas");
        System.out.println("");
        System.out.println("Tortas de Chocolate ..........10000 mil pesos c/u");
        System.out.println("Tortas de Fresa...............10000 mil pesos c/u");
        System.out.println("Tortas de Vainilla............10000 mil pesos c/u");
        System.out.println("Tortas con relleno ...........12000 mil pesos c/u");
        System.out.println("");
        System.out.println("Lista de Muffins");
        System.out.println(" ");
        System.out.println("Muffins de Chocolate ..........2000 mil pesos c/u");
        System.out.println("Muffins de Fresa...............2000 mil pesos c/u");
        System.out.println("Muffins de Vainilla............2000 mil pesos c/u");
        System.out.println("Muffins con Chispas ...........2500 mil pesos c/u");
        System.out.println("");
        System.out.println("Lista de Totas Frias");
        System.out.println(" ");
        System.out.println("Chocolate con Mantecado..... ..12000 mil pesos c/u");
        System.out.println("Fresa con Vainilla.............12000 mil pesos c/u");
        System.out.println("Tres Leches....................12000 mil pesos c/u");
        System.out.println("Chocolate con Oreo.............12000 mil pesos c/u");
        System.out.println("");
        System.out.println("Desea ir al menu    1. Si / 2. No");
        fin = num.nextInt();
        if (fin == 1) {
            menu1();
        }

        }
        private void empleados() {
            System.out.println("Sr(a) Bienvenidos Zona de Empleado" );
            System.out.println("ingrese su Usuario" );
            String userin = texto.nextLine();
            System.out.println("ingrese su Contraseña" );
            int passin = num.nextInt();
            if (Objects.equals(user, userin) & pass==passin ){
                System.out.println("Sr(a) Bienvenidos a la zona de Empleado" );
                System.out.println(" " );
                System.out.println("En este entorno puede ver la Venta diaria" );
                System.out.println(" " );
                System.out.println("¿Desea Volver al menú? 1. Si / 2. No");
                fin = num.nextInt();
                if (fin == 1) {
                    menu1();
                }
            }else{
                System.out.println("El Usuario o Contraseña que introdujo es incorrecta" );
                System.out.println("¿Desea volver a intentar? 1. Si / 2. No");
                fin = num.nextInt();
                if (fin == 1) {
                    menu1();
                }

            }


        }

        private void resutadoPedido () {
            System.out.println("Sr(a) " + nombres + " Su pedido esta listo");
            System.out.println("Su pedido es: " + pedido + " de " + sabor + " " + relleno);
            System.out.println("valor cancelar es: " + precio + " mil pesos ");

            System.out.println("¿Desea que le enviemos su pedido? Gratis!!!    1. Si / 2. No");
            opcion6 = num.nextInt();
            if (opcion6 == 1) {
                System.out.println("Sr(a) " + nombres + " inidique su dirección de envio");
                direccion = texto.nextLine();
                System.out.println("Muchas gracias le enviaremos su pedido a la dirección indicada por usted");
            } else {
                System.out.println("Muchas gracias Sr(a) " + nombres + " podrá venir a buscar su pedido  dentro de 6 horas");
            }
            finalizar();
        }


        private void finalizar () {
            System.out.println("¿Desea finaliza o realizar otro pedido? 1. Si / 2. No");
            fin = num.nextInt();
            if (fin == 1) {
                menu1();
            }

        }

    }



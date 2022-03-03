package com.Sofka.taller2;
import java.util.Scanner;
public class ejercicio5T2 {
    public void llamadaE5t2() {

        Scanner tem = new Scanner(System.in);
        int precio = 0;
        String medicamento = "vacio";
        System.out.println("Esto es ejercicio5 del taller 2");
        System.out.println("");
        System.out.println("Bienvenidos a **** Drogueria Mi Salud ****");
        System.out.println("Ingrese su Nombre y Apellido");
        String nombre = tem.nextLine();
        System.out.println("");
        System.out.println("Elija una opción");
        System.out.println("1. Comprar Medicamentos");
        System.out.println("2. Consultar Medicamentos disponibles");
        System.out.println("3. Devolver Medicamentos");
        int opcion = tem.nextInt();
        Scanner leer = new Scanner(System.in);
        if (opcion == 1) {
            System.out.println("Bienvenido a la venta de medicamentos por favor elija su opción");
            System.out.println("1. Pastillas para el dolor de cabeza");
            System.out.println("2. Pasti8llas para el Dolor muscular");
            System.out.println("3. pastillas apra el dolor de estomago");
            int opcion2 = tem.nextInt();
            if (opcion2 == 1) {
                System.out.println("Estas son las opciones de pastillas para el dolor de cabeza");
                System.out.println("1. Dol Forte");
                System.out.println("2. Tylenol");
                System.out.println("3. Ibuprofeno");
                System.out.println("4. Aspirina");
                int opcion3 = tem.nextInt();

                switch (opcion3) {
                    case 1 -> {
                        System.out.println("1. Dol Forte");
                        medicamento = "Dol Forte";
                        precio = 3000;
                    }
                    case 2 -> {
                        System.out.println("2. Tylenol");
                        medicamento = "Tylenol";
                        precio = 4000;
                    }
                    case 3 -> {
                        System.out.println("3. Ibuprofeno");
                        medicamento = "Ibuprofeno";
                        precio = 3000;
                    }
                    case 4 -> {
                        System.out.println("4. Aspirina");
                        medicamento = "Aspirina";
                        precio = 2000;
                    }
                }
                System.out.println("");
                System.out.println("Sr(a)" + nombre + "El Medicamento comprado es: " + medicamento);
                System.out.println("El Costo a pagar es de: " + precio + " mil pesos pase a caja para cancelar");
                System.out.println("              Muchas gracias por su compraq");

                System.out.println("");
                System.out.println("Presione 'c' y Enter para continuar");
                String esperar = leer.nextLine();


            } else {
                if (opcion2 == 2) {
                    System.out.println("Estas son las opciones de pastillas para el dolor de Muscular");
                    System.out.println("1. Naproxeno");
                    System.out.println("2. Algidol");
                    System.out.println("3. Flanax");

                    int opcion3 = tem.nextInt();

                    switch (opcion3) {
                        case 1 -> {
                            System.out.println("1. Naproxeno");
                            medicamento = "Naproxeno";
                            precio = 3000;
                        }
                        case 2 -> {
                            System.out.println("2. Algidol");
                            medicamento = "Algidol";
                            precio = 4000;
                        }
                        case 3 -> {
                            System.out.println("3. Flanax");
                            medicamento = "Flanax";
                            precio = 5000;
                        }

                    }
                    System.out.println("Sr(a)" + nombre + "El Medicamento comprado es: " + medicamento);
                    System.out.println("El Costo a pagar es de: " + precio + " mil pesos pase a caja para cancelar");
                    System.out.println("              Muchas gracias por su compraq");
                    ;
                    System.out.println("");
                    System.out.println("Presione 'c' y Enter para continuar");
                    String esperar = leer.nextLine();

                } else {
                    if (opcion2 == 3) {
                        System.out.println("Estas son las opciones de pastillas para el dolor de Estomago");
                        System.out.println("1. Butilhioscina");
                        System.out.println("2. Algidol");
                        System.out.println("3. Flanax");

                        int opcion3 = tem.nextInt();

                        switch (opcion3) {
                            case 1 -> {
                                System.out.println("1. Butilhioscina");
                                medicamento = "Butilhioscina";
                                precio = 8000;
                            }
                            case 2 -> {
                                System.out.println("2. Dolbutin");
                                medicamento = "Dolbutin";
                                precio = 7000;
                            }
                            case 3 -> {
                                System.out.println("3. Panclasa");
                                medicamento = "Panclasa";
                                precio = 6000;
                            }

                        }
                        System.out.println("Sr(a)" + nombre + "El Medicamento comprado es: " + medicamento);
                        System.out.println("El Costo a pagar es de: " + precio + " mil pesos pase a caja para cancelar");
                        System.out.println("              Muchas gracias por su compraq");

                        System.out.println("");
                        System.out.println("Presione 'c' y Enter para continuar");
                        String esperar = leer.nextLine();

                    }
                }
            }

        } else {
            if (opcion == 2) {
                System.out.println("Bienvenido a la Consulta de Medicamentos");
                System.out.println("Pastillas para el dolor de cabeza");
                System.out.println("1. Dol Forte.....3000");
                System.out.println("2. Tylenol.......4000");
                System.out.println("3. Ibuprofeno....3000");
                System.out.println("4. Aspirina......2000");
                System.out.println("");
                System.out.println("Pastillas para los Dolores Musculares");
                System.out.println("1. Naproxeno.....3000");
                System.out.println("2. Algidol.......4000");
                System.out.println("3. Flanax........5000");
                System.out.println("");
                System.out.println("Pastillas para el Dolor de Estomago");
                System.out.println("1. Butilhioscina..8000");
                System.out.println("2. Dolbutin.......7000");
                System.out.println("3. Panclasa.......6000");

                System.out.println("");
                System.out.println("Estos son los productos disponible si desea comprar vaya a nuesta zona de ventas");
                System.out.println("");
                System.out.println("Presione 'c' y Enter para continuar");
                String esperar = leer.nextLine();


            }else{
                if (opcion==3){
                    System.out.println("Bienvenido Devolución de Medicamentos");
                    System.out.println("");
                    System.out.println("Sr(a) "+ nombre + " usted procede a devolver un medicamento, por favor indique el nombre del medicamento");
                    medicamento = leer.nextLine();
                    System.out.println("Por favor indique sla causa de devolución de " + medicamento + " si tiene deterioro, daño o vencimiento");
                    String devolucion = leer.nextLine();
                    System.out.println("Sr(a) " + nombre + " usted a devuelto es: " + medicamento);
                    System.out.println("El motivo o causa de devolución es: " + "(" + devolucion + ")");
                    System.out.println("          Muchas gracias por preferirnos ");
                    System.out.println("");
                    System.out.println("Presione 'c' y Enter para continuar");
                    String esperar = leer.nextLine();

                }
            }
        }
    }
}
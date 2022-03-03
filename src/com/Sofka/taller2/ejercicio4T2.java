package com.Sofka.taller2;
import java.util.Scanner;
public class ejercicio4T2 {
    public void llamadaE4t2() {
        Scanner tem = new Scanner(System.in);
        System.out.println("Esto es ejercicio4 del taller 2");
        System.out.println("Bienvenido a su VIDEO TIENDA PORVENIR");
        System.out.println("Gracias por Preferirnos");
        System.out.println("Indique su Nombre y Apellido por favor");
        String nombre = tem.nextLine();
        System.out.println("");
        System.out.println("Elija ima opción");
        System.out.println("1. Alquilar una pelicula");
        System.out.println("2. Consultar una Pelicula");
        System.out.println("3. Devolver Pelicula");
        int precio = 40000;
        int opcion = tem.nextInt();
                switch (opcion) {
                    case 1:
                        Scanner leer = new Scanner(System.in);
                        System.out.println(" Datos de Alquiler de Pelicula");
                        System.out.println("");
                        System.out.println("Bienvenidos, Ingrese la pelicula que quiere llevarse");
                        String peliculaa = leer.nextLine();
                        System.out.println("");
                        System.out.println("Sr(a) " + nombre + " Su pelicula " + "( " + peliculaa + " )");
                        System.out.println("El Precio a Pagar es de: " + precio);
                        break;

                    case 2:
                        System.out.println("Bienvenido Indique de la lista que pelicula desea llevar");
                        System.out.println("1. Los Inmortales");
                        System.out.println("2. El Pianista");
                        System.out.println("3. Los Invensibles");
                        System.out.println("4. Los Miserables ");
                        int opcion2 = tem.nextInt();
                        switch (opcion2) {

                            case 1: {
                                System.out.println(" Datos de Alquiler de Pelicula");
                                String pelicula = "Los Inmortales";
                                System.out.println("Sr(a) " + nombre + " Su pelicula " + "( " + pelicula + " )");
                                System.out.println("El Precio a Pagar es de: " + precio);
                                break;
                            }
                            case 2: {
                                System.out.println(" Datos de Alquiler de Pelicula");
                                String pelicula2 = "El Pianista";
                                System.out.println("Sr(a) " + nombre + " Su pelicula " + "( " + pelicula2 + " )");
                                System.out.println("El Precio a Pagar es de: " + precio);
                                break;
                            }
                            case 3: {
                                System.out.println(" Datos de Alquiler de Pelicula");
                                String pelicula3 = "Los Invensibles";
                                System.out.println("Sr(a) " + nombre + " Su pelicula " + "( " + pelicula3 + " )");
                                System.out.println("El Precio a Pagar es de: " + precio);
                                break;
                            }
                            case 4: {
                                System.out.println(" Datos de Alquiler de Pelicula");
                                String pelicula4 = "Los Miserables";
                                System.out.println("Sr(a) " + nombre + " Su pelicula " + "( " + pelicula4 + " )");
                                System.out.println("El Precio a Pagar es de: " + precio);
                                break;
                            }
                        }

                        break;

                    case 3:
                    System.out.println("3. Devolver Pelicula");
                        System.out.println("");
                        Scanner leer2 = new Scanner(System.in);
                        System.out.println(" Escriba el Nombre de la Pelicula que desea Devolver");
                        String peliculas = leer2.nextLine();
                        System.out.println("");
                        System.out.println("Por favor indique si la película devuelta tiene algún deterioro o daño a continuación");
                        String devolucion = leer2.nextLine();
                        System.out.println("");
                        System.out.println("Sr(a) " + nombre + " Usted a devuelto la pelicula " + "( " + peliculas + " )");
                        System.out.println("con las siguientes novedades: " + devolucion);
                        break;

                }
        Scanner leer= new Scanner(System.in);
        System.out.println("");
        System.out.println("Presione 'c' y Enter para continuar");
        String esperar = leer.nextLine();
    }
}

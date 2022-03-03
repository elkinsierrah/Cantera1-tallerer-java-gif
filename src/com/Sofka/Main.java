package com.Sofka;

import com.Sofka.taller1.ejercicio1; import com.Sofka.taller1.ejercicio2; import com.Sofka.taller1.ejercicio3;
import com.Sofka.taller1.ejercicio4;import com.Sofka.taller1.ejercicio5;
//-------------------------------import Taller 2------------------------------------------------------------------------
import com.Sofka.taller2.ejercicio1T2; import com.Sofka.taller2.ejercicio2T2; import com.Sofka.taller2.ejercicio3T2;
import com.Sofka.taller2.ejercicio4T2; import com.Sofka.taller2.ejercicio5T2; import com.Sofka.taller2.ejercicio6T2;
import com.Sofka.taller2.ejercicio7T2; import com.Sofka.taller2.ejercicio8T2;import com.Sofka.taller2.ejercicio9T2;
import com.Sofka.taller2.ejercicio10T2;
//-------------------------------import taller 3------------------------------------------------------------------------
import com.Sofka.taller3.ejercicio1T3; import com.Sofka.taller3.ejercicio2T3; import com.Sofka.taller3.ejercicio3T3;
import com.Sofka.taller3.ejercicio4T3; import com.Sofka.taller3.ejercicio5T3; import com.Sofka.taller3.ejercicio6T3;
import com.Sofka.taller3.ejercicio7T3; import com.Sofka.taller3.ejercicio8T3;
//-------------------------------import taller 4------------------------------------------------------------------------
import com.Sofka.taller4.ejercicio1T4; import com.Sofka.taller4.ejercicio2T4; import com.Sofka.taller4.ejercicio3T4;
import com.Sofka.taller4.ejercicio4T4; import com.Sofka.taller4.ejercicio5T4;
import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        int menus = 1;
        int menus2, menus3;
        System.out.println(menus);
        while (menus > 0) {
            // Instruccion para ver todos los talleres de cantera 1
            Scanner leer = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Elija que grupo de talleres  de la cantera 1 quiere ver? \n");
            System.out.println("1. Ver los Ejercicios del Taller #1 Variables");
            System.out.println("2. Ver los Ejercicios del Taller #2 Condicionales");
            System.out.println("3. Ver los Ejercicios del Taller #3 Ciclos");
            System.out.println("4. Ver los Ejercicios del Taller #4 Matrices y Vectores");
            System.out.println("0. Salir o Detener el programa \n");
            System.out.print("El sistema espera por su elección: ");
            menus = leer.nextInt();
            //Mostrara todas las opciones del taller 1
            if (menus == 1) {
                System.out.println("Opciones de revisión de los Ejercicios del Taller 1 \n");
                System.out.println("Elija que Ejercicio del taller #1 Variables desea ver?");
                System.out.println("1. Ver el Ejercicio  #1 Petición de Nombre y Apellido");
                System.out.println("2. Ver el Ejercicio  #2 Petición de Datos y Estatura");
                System.out.println("3. Ver el Ejercicio  #3 Petición de Datos de Parentezco");
                System.out.println("4. Ver el Ejercicio  #4 Inforamación  de Capital y País");
                System.out.println("5. Ver el Ejercicio  #5 Datos de Mascotas y Dueño \n");
                System.out.print("El sistema espera por su elección: \n");
                menus2 = leer.nextInt();
                switch (menus2) {
                    case 1 -> {
                        System.out.println("Su elección fue ver el ejercicio 1 del taller 1 ");
                        ejercicio1 e1 = new ejercicio1();
                        e1.llamadaE1();
                    }
                    case 2 -> {
                        System.out.println("Su elección fue ver el ejercicio 2 del taller 1 ");
                        ejercicio2 e2 = new ejercicio2();
                        e2.llamadaE2();
                    }
                    case 3 -> {
                        System.out.println("Su elección fue ver el ejercicio 3 del taller 1 ");
                        ejercicio3 e3 = new ejercicio3();
                        e3.llamadaE3();
                    }
                    case 4 -> {
                        System.out.println("Su elección fue ver el ejercicio 4 del taller 1 ");
                        ejercicio4 e4 = new ejercicio4();
                        e4.llamadaE4();
                    }
                    case 5 -> {
                        System.out.println("Su elección fue ver el ejercicio 5 del taller 1 ");
                        ejercicio5 e5 = new ejercicio5();
                        e5.llamadaE5();
                    }
                    default -> System.out.println("Opción incorrecta");
                }

            } else {
                if (menus == 2) {
                    System.out.println(" ");
                    System.out.println("Opciones de revisión de los Ejercicios del Taller 2 Condicionales");
                    System.out.println("Elija que Ejercicio del taller #2 de Condicionales que desea ver?");
                    System.out.println(" ");
                    System.out.println("1.  Ver el Ejercicio  #1  Condicional de Mayoria de Edad ");
                    System.out.println("2.  Ver el Ejercicio  #2  Condicional de Menor de Edad");
                    System.out.println("3.  Ver el Ejercicio  #3  Condicional de Entrada a la Fiesta");
                    System.out.println("4.  Ver el Ejercicio  #4  Sistema de Video Tienda");
                    System.out.println("5.  Ver el Ejercicio  #5  Sistema de Drogueria");
                    System.out.println("6.  Ver el Ejercicio  #6  Sistema del taller de Motos");
                    System.out.println("7.  Ver el Ejercicio  #7  Sistema de Cálculo de IMC ");
                    System.out.println("8.  Ver el Ejercicio  #8  Sistema de Pasteleria");
                    System.out.println("9.  Ver el Ejercicio  #9  Sistema de Calculo de Área");
                    System.out.println("10. Ver el Ejercicio  #10 Sistema del Banco Fiel");
                    System.out.println(" ");
                    System.out.print("El sistema espera por su elección: ");
                    menus2 = leer.nextInt();
                    System.out.println(" ");

                    switch (menus2) {
                        case 1 -> {
                            System.out.println("Su elección fue ver el ejercicio 1 del taller 2 ");
                            ejercicio1T2 e1t2 = new ejercicio1T2();
                            e1t2.llamadaE1t2();
                        }
                        case 2 -> {
                            System.out.println("Su elección fue ver el ejercicio 2 del taller 2 ");
                            ejercicio2T2 e2T2 = new ejercicio2T2();
                            e2T2.llamadaE2t2();
                        }
                        case 3 -> {
                            System.out.println("Su elección fue ver el ejercicio 3 del taller 2 ");
                            ejercicio3T2 e3T2 = new ejercicio3T2();
                            e3T2.llamadaE3t2();
                        }
                        case 4 -> {
                            System.out.println("Su elección fue ver el ejercicio 4 del taller 2 ");
                            ejercicio4T2 e4T2 = new ejercicio4T2();
                            e4T2.llamadaE4t2();
                        }
                        case 5 -> {
                            System.out.println("Su elección fue ver el ejercicio 5 del taller 2 ");
                            ejercicio5T2 e5T2 = new ejercicio5T2();
                            e5T2.llamadaE5t2();
                        }
                        case 6 -> {
                            System.out.println("Su elección fue ver el ejercicio 6 del taller 2 ");
                            ejercicio6T2 e6T2 = new ejercicio6T2();
                            e6T2.llamadaE6T2();
                        }
                        case 7 -> {
                            System.out.println("Su elección fue ver el ejercicio 7 del taller 2 ");

                            ejercicio7T2 e7T2 = new ejercicio7T2();
                            e7T2.llamadaE7T2();
                        }
                        case 8 -> {
                            System.out.println("Su elección fue ver el ejercicio 8 del taller 2 ");
                            ejercicio8T2 e8T2 = new ejercicio8T2();
                            e8T2.llamadaE8T2();
                        }

                        case 9 -> {
                            System.out.println("Su elección fue ver el ejercicio 9 del taller 2 ");
                            ejercicio9T2 e9T2 = new ejercicio9T2();
                            e9T2.llamadaE9T2();
                        }
                        case 10 -> {
                            System.out.println("Su elección fue ver el ejercicio 10 del taller 2 ");
                            ejercicio10T2 e10T2 = new ejercicio10T2();
                            e10T2.llamadaE10T2();
                        }
                        default -> System.out.println("Opción incorrecta");

                    }

                } else {
                    if (menus == 3) {
                        System.out.println("Opciones de revisión de los Ejercicios del Taller 3 Cliclos");
                        System.out.println("Elija que Ejercicio del taller #3 de Ciclos que desea ver?");
                        System.out.println(" ");
                        System.out.println("1.  Ver el Ejercicio  #1 Arco de Asteriscos a la izquierda");
                        System.out.println("2.  Ver el Ejercicio  #2 Arco de Asteriscos a la derecha");
                        System.out.println("3.  Ver el Ejercicio  #3 Arbol de Navidad");
                        System.out.println("4.  Ver el Ejercicio  #4 Tabla de multiplicar del 1");
                        System.out.println("5.  Ver el Ejercicio  #5 Menú pequeño");
                        System.out.println("6.  Ver el Ejercicio  #6 Agenda telefonica");
                        System.out.println("7.  Ver el Ejercicio  #7 Parquedero");
                        System.out.println("8.  Ver el Ejercicio  #8 Escuela de Conduccion");
                        System.out.println(" ");
                        System.out.print("El sistema espera por su elección: ");
                        menus3 = leer.nextInt();
                        System.out.println(" ");

                        switch (menus3) {
                            case 1 -> {
                                System.out.println("Su elección fue ver el ejercicio 1 del taller 3 ");
                                ejercicio1T3 e1t3 = new ejercicio1T3();
                                e1t3.llamadaE1t3();
                            }
                            case 2 -> {
                                System.out.println("Su elección fue ver el ejercicio 2 del taller 3 ");
                                ejercicio2T3 e2T3 = new ejercicio2T3();
                                e2T3.llamadaE2t3();
                            }
                            case 3 -> {
                                System.out.println("Su elección fue ver el ejercicio 3 del taller 3 ");
                                ejercicio3T3 e3T3 = new ejercicio3T3();
                                e3T3.llamadaE3t3();
                            }
                            case 4 -> {
                                System.out.println("Su elección fue ver el ejercicio 4 del taller 3 ");
                                ejercicio4T3 e4T3 = new ejercicio4T3();
                                e4T3.llamadaE4t3();
                            }
                            case 5 -> {
                                System.out.println("Su elección fue ver el ejercicio 5 del taller 3 ");
                                ejercicio5T3 e5T3 = new ejercicio5T3();
                                e5T3.llamadaE5t3();
                            }
                            case 6 -> {
                                System.out.println("Su elección fue ver el ejercicio 6 del taller 3 ");
                                ejercicio6T3 e6T3 = new ejercicio6T3();
                                e6T3.llamadaE6T3();
                            }
                            case 7 -> {
                                System.out.println("Su elección fue ver el ejercicio 7 del taller 3 ");

                                ejercicio7T3 e7T3 = new ejercicio7T3();
                                e7T3.llamadaE7T3();
                            }
                            case 8 -> {
                                System.out.println("Su elección fue ver el ejercicio 8 del taller 3 ");
                                ejercicio8T3 e8T3 = new ejercicio8T3();
                                e8T3.llamadaE8T3();
                            }

                            default -> System.out.println("Opción incorrecta");

                        }


                    } else {
                        if (menus == 4) {
                            System.out.println("Opciones de revisión de los Ejercicios del Taller 4 matrices y Vectores");
                            System.out.println("Elija que Ejercicio del taller #4 de matrices y Vectores que desea ver?");
                            System.out.println(" ");
                            System.out.println("1.  Ver el Ejercicio  #1 Vector de 5 posiciones Solicitado por el usuario");
                            System.out.println("2.  Ver el Ejercicio  #2 Arreglo al Azar, Pas e Impar ");
                            System.out.println("3.  Ver el Ejercicio  #3 Numero Primos del 1 al 1000");
                            System.out.println("4.  Ver el Ejercicio  #4 Matriz Bidimensional");
                            System.out.println("5.  Ver el Ejercicio  #5 Impresión de Cuadro Fila y Columna");
                            System.out.println(" ");
                            System.out.print("El sistema espera por su elección: ");
                            menus3 = leer.nextInt();
                            System.out.println(" ");
                            switch (menus3) {
                                case 1 -> {
                                    System.out.println("Su elección fue ver el ejercicio 1 del taller 4 ");
                                    ejercicio1T4 e1t4 = new ejercicio1T4();
                                    e1t4.llamadaE1t4();
                                }
                                case 2 -> {
                                    System.out.println("Su elección fue ver el ejercicio 2 del taller 4");
                                    ejercicio2T4 e2T4 = new ejercicio2T4();
                                    e2T4.llamadaE2t4();
                                }
                                case 3 -> {
                                    System.out.println("Su elección fue ver el ejercicio 3 del taller 4");
                                   ejercicio3T4 e3T4 = new ejercicio3T4();
                                   e3T4.llamadaE3t4();
                                }
                                case 4 -> {
                                    System.out.println("Su elección fue ver el ejercicio 4 del taller 4 ");
                                    ejercicio4T4 e4T4 = new ejercicio4T4();
                                    e4T4.llamadaE4t4();
                                }
                                case 5 -> {
                                    System.out.println("Su elección fue ver el ejercicio 5 del taller 4 ");
                                    ejercicio5T4 e5T4 = new ejercicio5T4();
                                    e5T4.llamadaE5t4();
                                }

                                default -> System.out.println("Opción incorrecta");

                            }

                        }

                    }

                }

            }

        }
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static class llamadaE1 {
        public void llamaraE1() {
            ejercicio1 e1 = new ejercicio1();
            e1.llamadaE1();
        }
    }


}


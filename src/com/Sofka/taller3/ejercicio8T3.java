package com.Sofka.taller3;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class ejercicio8T3 {
    Scanner num = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    boolean salir = true, fin;
    int opcion, opcion2, ingreso = 1, esperar, bbc, aprobar;
    String almno1 = "Vacio", almno2 = "Vacio", almno3 = "Vacio", almno4 = "Vacio", almno5 = "Vacio", almno6 = "Vacio", almno7 = "Vacio", almno8 = "Vacio";
    String cc1 = "Vacio", cc2 = "Vacio", cc3 = "Vacio", cc4 = "Vacio", cc5 = "Vacio", cc6 = "Vacio", cc7 = "Vacio", cc8 = "Vacio", buscarcc;
    String curso1 = "Vacio", curso2 = "Vacio", curso3 = "Vacio", curso4 = "Vacio", curso5 = "Vacio", curso6 = "Vacio", curso7 = "Vacio", curso8 = "Vacio";

    public void llamadaE8T3() throws IOException {
        do {
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (!salir);

    }

    public void menu() {
        System.out.println("Bienvenido escoja una opción \n");
        System.out.println("1. Ingresar un Estudiante");
        System.out.println("2. Consultar Licenciados");
        System.out.println("3. Aprobar a Estudiantes");
        System.out.println("4. SReprobar Estudiante");
        System.out.println("5. Salir de Sistema");
    }

    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1 -> ingresarEstudiante();

            case 2 -> consultar();

            case 3 -> aprobarEstu();

            case 4 -> reprobarEstu();

            case 5 -> outSystem();

            default -> {
                System.out.println("Opción incorrecta");
                menu();
            }
        }
        return true;
    }

    private void consultar() throws IOException {
        System.out.println("                           Consulta de Aprobados y Reprobados");
        System.out.println("                      Curso de Conduccion para optar por la Licencia");
        System.out.println("____________________________________________________________________________________________");
        if (curso1=="Vacio"){ System.out.println("Cupo del curso sin Estudiante)");}else{
            System.out.println(" Nombre de Estudiante " + almno1);
            System.out.println(" Cédula del Estudiante " + cc1);
            System.out.println(" Curso de Conducción:  " + curso1);

        }
        System.out.println("____________________________________________________________________________________________");
        if (curso2=="Vacio"){ System.out.println("Cupo del curso sin Estudiante)");}else{
            System.out.println(" Nombre de Estudiante " + almno2);
            System.out.println(" Cédula del Estudiante " + cc2);
            System.out.println(" Curso de Conducción:  " + curso2);


        }
        System.out.println("____________________________________________________________________________________________");
        if (curso3=="Vacio"){ System.out.println("Cupo del curso sin Estudiante)");}else{
            System.out.println(" Nombre de Estudiante " + almno3);
            System.out.println(" Cédula del Estudiante " + cc3);
            System.out.println(" Curso de Conducción:  " + curso3);


        }
        System.out.println("____________________________________________________________________________________________");
        if (curso4=="Vacio"){ System.out.println("Cupo del curso sin Estudiante)");}else{
            System.out.println(" Nombre de Estudiante " + almno4);
            System.out.println(" Cédula del Estudiante " + cc4);
            System.out.println(" Curso de Conducción:  " + curso4);


        }
        System.out.println("____________________________________________________________________________________________");
        if (curso5=="Vacio"){ System.out.println("Cupo del curso sin Estudiante)");}else{
            System.out.println(" Nombre de Estudiante " + almno5);
            System.out.println(" Cédula del Estudiante " + cc5);
            System.out.println(" Curso de Conducción:  " + curso5);


        }
        System.out.println("____________________________________________________________________________________________");
        if (curso6=="Vacio"){ System.out.println("Cupo del curso sin Estudiante)");}else{
            System.out.println(" Nombre de Estudiante " + almno6);
            System.out.println(" Cédula del Estudiante " + cc6);
            System.out.println(" Curso de Conducción:  " + curso6);


        }
        System.out.println("____________________________________________________________________________________________");
        if (curso7=="Vacio"){ System.out.println("Cupo del curso sin Estudiante)");}else{
            System.out.println(" Nombre de Estudiante " + almno7);
            System.out.println(" Cédula del Estudiante " + cc7);
            System.out.println(" Curso de Conducción:  " + curso7);


        }
        System.out.println("____________________________________________________________________________________________");
        if (curso8=="Vacio"){ System.out.println("Cupo del curso sin Estudiante)");}else{
            System.out.println(" Nombre de Estudiante " + almno8);
            System.out.println(" Cédula del Estudiante " + cc8);
            System.out.println(" Curso de Conducción:  " + curso8);


        }
        llamadaE8T3();

    }

    private void outSystem() throws IOException {
        System.out.println(" Se perderán los datos. ¿Seguro que desea Salir del Parquedero? 1. Si / 2. No");
        opcion2 = num.nextInt();
        if (opcion2 == 1) {
            salir = false;
        } else {
            if (opcion2 == 2) {
                llamadaE8T3();
            }
        }

    }

    private void ingresarEstudiante() throws IOException {
        if (ingreso == 8) {
            System.out.println("Parqueadero lleno, No puede ingresar más Estudiantes");
            menu();
        }

        System.out.println("Ingreso de Estudiante");
        System.out.println("Hasta ahora se han ingresado " + ingreso + " vehiculos");
        if (ingreso==1){opcion2=1;}if (ingreso==2){opcion2=2;}  if (ingreso==3){opcion2=3;}if (ingreso==4){opcion2=4;}
        if (ingreso==5){opcion2=5;}if (ingreso==6){opcion2=6;}  if (ingreso==7){opcion2=7;}if (ingreso==8){opcion2=8;}
        if (ingreso != 8) {
            switch (opcion2) {
                case 1 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese el nombre del Estudiante");
                    almno1 = texto.nextLine();
                    System.out.println("Ingrese la Cédula");
                    cc1 = texto.nextLine();
                    curso1 = "Inscrito";

                }
                case 2 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese el nombre del Estudiante");
                    almno2 = texto.nextLine();
                    System.out.println("Ingrese la Cédula");
                    cc2 = texto.nextLine();
                    curso2 = "Inscrito";
                }


                case 3 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese el nombre del Estudiante");
                    almno3 = texto.nextLine();
                    System.out.println("Ingrese la Cédula");
                    cc3 = texto.nextLine();
                    curso3 = "Inscrito";

                }
                case 4 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese el nombre del Estudiante");
                    almno4 = texto.nextLine();
                    System.out.println("Ingrese la Cédula");
                    cc4 = texto.nextLine();
                    curso4 = "Inscrito";

                }
                case 5 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese el nombre del Estudiante");
                    almno5 = texto.nextLine();
                    System.out.println("Ingrese la Cédula");
                    cc5 = texto.nextLine();
                    curso5 = "Inscrito";

                }
                case 6 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese el nombre del Estudiante");
                    almno6 = texto.nextLine();
                    System.out.println("Ingrese la Cédula");
                    cc6 = texto.nextLine();
                    curso6 = "Inscrito";

                }
                case 7 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese el nombre del Estudiante");
                    almno7 = texto.nextLine();
                    System.out.println("Ingrese la Cédula");
                    cc7 = texto.nextLine();
                    curso7 = "Inscrito";

                }
                case 8 -> {
                    ingreso = ingreso + 1;
                    System.out.println("Ingrese el nombre del Estudiante");
                    almno8 = texto.nextLine();
                    System.out.println("Ingrese la Cédula");
                    cc8 = texto.nextLine();
                    curso8 = "Inscrito";

                }
            }

        } else {
            System.out.println("Curso lleno, No puede ingresar más Estudiante");

        }
        llamadaE8T3();
    }

    private void aprobarEstu() throws IOException {
        System.out.println("Aprobar a Estudiantes del Curso de Manejo \n");
        System.out.println("Ingrese la Cédula del Estudiante");
        buscarcc = texto.nextLine();
        if (Objects.equals(buscarcc, cc1)) {
            curso1 = "Aprobado";
            System.out.println("Ha Concedido al  Estudiante " + almno1 + " La Licencia de Manejo");
        } else {
            if (Objects.equals(buscarcc, cc2)) {
                curso2 = "Aprobado";
                System.out.println("Ha Concedido al  Estudiante " + almno2 + " La Licencia de Manejo");
            } else {
                if (Objects.equals(buscarcc, cc3)) {
                    curso3 = "Aprobado";
                    System.out.println("Ha Concedido al  Estudiante " + almno3 + " La Licencia de Manejo");
                } else {
                    if (Objects.equals(buscarcc, cc4)) {
                        curso4 = "Aprobado";
                        System.out.println("Ha Concedido al  Estudiante " + almno4 + " La Licencia de Manejo");
                    } else {
                        if (Objects.equals(buscarcc, cc5)) {
                            curso5 = "Aprobado";
                            System.out.println("Ha Concedido al  Estudiante " + almno5 + " La Licencia de Manejo");
                        } else {
                            if (Objects.equals(buscarcc, cc6)) {
                                curso6 = "Aprobado";
                                System.out.println("Ha Concedido al  Estudiante " + almno6 + " La Licencia de Manejo");
                            } else {
                                if (Objects.equals(buscarcc, cc7)) {
                                    curso1 = "Aprobado";
                                    System.out.println("Ha Concedido al  Estudiante " + almno7 + " La Licencia de Manejo");
                                } else {
                                    if (Objects.equals(buscarcc, cc8)) {
                                        curso8 = "Aprobado";
                                        System.out.println("Ha Concedido al  Estudiante " + almno8 + " La Licencia de Manejo");
                                    } else {
                                        System.out.println("La Cedula que ingreso no es correcta, verifique e intente de nuevo");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        llamadaE8T3();
    }

    private void reprobarEstu() throws IOException {
        System.out.println("Aprobar a Estudiantes del Curso de Manejo \n");
        System.out.println("Ingrese la Cédula del Estudiante");
        buscarcc = texto.nextLine();
        if (Objects.equals(buscarcc, cc1)) {
            curso1 = "Reprobado";
            System.out.println("Ha Reprobado al  Estudiante " + almno1 + " La Licencia de Manejo");
        } else {
            if (Objects.equals(buscarcc, cc2)) {
                curso2 = "Reprobado";
                System.out.println("Ha Reprobado al  Estudiante " + almno2 + " La Licencia de Manejo");
            } else {
                if (Objects.equals(buscarcc, cc3)) {
                    curso3 = "Reprobado";
                    System.out.println("Ha Reprobado al  Estudiante " + almno3 + " La Licencia de Manejo");
                } else {
                    if (Objects.equals(buscarcc, cc4)) {
                        curso4 = "Reprobado";
                        System.out.println("Ha Reprobado al  Estudiante " + almno4 + " La Licencia de Manejo");
                    } else {
                        if (Objects.equals(buscarcc, cc5)) {
                            curso5 = "Reprobado";
                            System.out.println("Ha Reprobado al  Estudiante " + almno5 + " La Licencia de Manejo");
                        } else {
                            if (Objects.equals(buscarcc, cc6)) {
                                curso6 = "Reprobado";
                                System.out.println("Ha Reprobado al  Estudiante " + almno6 + " La Licencia de Manejo");
                            } else {
                                if (Objects.equals(buscarcc, cc7)) {
                                    curso1 = "Reprobado";
                                    System.out.println("Ha Reprobado al  Estudiante " + almno7 + " La Licencia de Manejo");
                                } else {
                                    if (Objects.equals(buscarcc, cc8)) {
                                        curso8 = "Reprobado";
                                        System.out.println("Ha Reprobado al  Estudiante " + almno8 + " La Licencia de Manejo");
                                    } else {
                                        System.out.println("La Cedula que ingreso no es correcta, verifique e intente de nuevo");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        llamadaE8T3();
    }
}
























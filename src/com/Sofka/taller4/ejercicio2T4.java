package com.Sofka.taller4;

    public class ejercicio2T4 {
        int[] numeros = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int control = 19, i, i1 = 0, i2 = 0;

        public void llamadaE2t4() {

            for (int i = 0; i <= control; i++)

                numeros[i] = (int) Math.floor(Math.random() * (100 + 1) + 1);

            mostrarAzar();
        }

        private void mostrarAzar() {
            System.out.println("Los Números al Azar del 1 al 100 Son: \n");

            i = 0;
            for (i = 0; i <= control; i++) {

                System.out.print(numeros[i] + " ");
            }
            System.out.println(" \n");
            System.out.println("_________________________________________________________________________");
            generaPareImpar();

        }

        private void generaPareImpar() {
            for (i = 0; i <= control; i++)
                if (numeros[i] % 2 == 0) {
                    i1 = i1 + 1;
                    par[i1] = numeros[i];
                }else{
                    i2 = i2 + 1;
                    impar[i2] = numeros[i];
                }

            mostrarPar();
        }

        private void mostrarPar() {
            System.out.println("Mostrar los Números pares sacados de la Matriz \n");

            while (i1 < control) {
                for (i = 0; i1 <= control; i1++) {
                    i = i + 1;
                    System.out.print(par[i] + " ");

                }
                System.out.println(" \n");
                System.out.println("_________________________________________________________________________");
                mostrarImpar();
            }
        }

            private void mostrarImpar() {
                    System.out.println("Mostrar los Números Impares sacados de la Matriz \n");

                    while (i2 < control) {
                        for (i = 0; i2 <= control; i2++) {
                            i = i + 1;
                            System.out.print(impar[i] + " ");

                        }
                        System.out.println( " \n");
                    }
                }
            }








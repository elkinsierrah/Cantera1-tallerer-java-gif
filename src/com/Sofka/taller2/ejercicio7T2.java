package com.Sofka.taller2;

import java.util.Scanner;

public class ejercicio7T2 {
    Scanner num = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    String nombres; int edad; float peso; float estatura;
    String estado; int res;
    float estaturam2; float imc;

    public void llamadaE7T2() {
        System.out.println("ingrese el Nombre completo del paciente");
        nombres = texto.nextLine();
        System.out.println("ingrese la edad  del paciente");
        edad = num.nextInt();
        System.out.println("ingrese la estatura  del paciente");
        estatura = num.nextFloat ();
        System.out.println("ingrese la peso  del paciente");
        peso= num.nextFloat();
        calculo();

    }
    private void calculo() {
        estaturam2 = estatura * 2;
        imc = peso / estaturam2;
        if (imc <= 18.5) {
            estado = "Categoria de Peso es Bajo";

        }else{
            if(imc>=18.5 & imc<=24.5){
                estado = "Categoria de Peso es Normal";

            }else{
                if (imc >24.5){
                    estado = "Categoria de Peso es Obeso";
                }
            }
        }
        resultado();
    }

    private void resultado() {
        System.out.println("Estimado paciente " + nombres);
        System.out.println("Su estado coorporal de IMC esta en la " + estado);
        decidir();
    }
    private void decidir() {
        System.out.println("¿Desea realizar otro calculo? 1. SI / 2. NO");
        res = num.nextInt();
        if (res == 1) {
            llamadaE7T2();
        }
    }
}
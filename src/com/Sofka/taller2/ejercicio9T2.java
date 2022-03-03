package com.Sofka.taller2;
import java.util.Objects;
import java.util.Scanner;
public class ejercicio9T2 {
    Scanner num = new Scanner(System.in);
    Scanner texto = new Scanner(System.in);
    int opcion; Float area; Float altura; Float base; Float base2;
    int res;
    public void llamadaE9T2() {

        System.out.println(" ");
        System.out.println("sistema para Calculo del Área?");

        System.out.println("Indique que cálculo desea realizar");
        System.out.println(" ");
        System.out.println("1. Área de un Rectángulo");
        System.out.println("2. Área de un trapecio");
        opcion = num.nextInt();
        switch (opcion) {
            case 1 -> arearectangulo();
            case 2 -> areatrapecio();
        }
    }

    public void arearectangulo(){
        System.out.println("Ingrese los datos para realizar los cálculos");
        System.out.println(" ");
        System.out.println("Ingrese la base o largo ");
        base= num.nextFloat();
        System.out.println("Ingrese la Altura o Anchura");
        altura = num.nextFloat();
        System.out.println("Estructura Mátematica usada ");
        System.out.println("a -> área");
        System.out.println("b -> base");
        area =  base * altura;
        System.out.println(" ");
        System.out.println("El Área del Rectángulo es: " + area + " cm2 ");
        System.out.println(" ");
        decidir();
    }

    public void areatrapecio(){
        System.out.println("Ingrese los datos para realizar los cálculos");
        System.out.println(" ");
        System.out.println("Ingrese la 1era base o 1er largo ");
        base= num.nextFloat();
        System.out.println("Ingrese la 2da base o 2do largo ");
        base2= num.nextFloat();
        System.out.println("Ingrese la Altura o Anchura");
        altura = num.nextFloat();
        System.out.println("Estructura Mátematica usada ");
        System.out.println("a -> área");
        System.out.println("b -> 1ra base");
        System.out.println("b2 -> 2da base");
        System.out.println("h -> altura");
        System.out.println("La fórmula ulitizada es: a =(b + b2) x h  / 2");
        area =  (base + base2) * altura / 2;
        System.out.println(" ");
        System.out.println("El Área del Trapecio es: " + area + " cm2 ");
        System.out.println(" ");
        decidir();

    }
    private void decidir() {
        System.out.println("¿Desea realizar otro calculo? 1. SI / 2. NO");
        res = num.nextInt();
        if (res == 1) {
            llamadaE9T2();
        }
    }
}

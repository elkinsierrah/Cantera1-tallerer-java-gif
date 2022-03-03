package com.Sofka.taller4;

public class ejercicio3T4 {
    int x,i, num=1000, contador;
    public void llamadaE3t4(){
        System.out.println("Mostrar Números primos entre el 1 y el 1000 \n");

        for( i = 1; i <= num; i++){
            contador =0;
            for(x = 1; x <= i;x++){
                if(i % x == 0){
                    contador ++;
                }
            }
            if(contador == 2){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}

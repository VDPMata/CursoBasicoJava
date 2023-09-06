package com.example;

import java.util.Arrays;

public class Bucles {
    public static int[] numeros = {12,25,36,95,1,3};
    public static void main(String[] args) {
        System.out.println(sumaElementos(numeros));
        System.out.println(mayorElementos(numeros));
        System.out.println(numerosPares(numeros));
        int [] arrays = numerosOrdenados(numeros);
        System.out.println(Arrays.toString(arrays));
    }

    
    /***************** Bucles *****************/
    
    // Usa un for para sumar todos los numeros que hay dentro de 2 numeros, inclusive los ingresados
    // Ejemplo: 5 + 10 ===> 45
    public static int sumaFor(int num1, int num2){
        //Tu codigo:
        int suma = 0;
        for(int i = num1; i<=num2; i++){
            suma += i;
        }
        return suma;
    }

    // Dado un array de numeros retornar la suma de todos los elementos
    // Ejemplo: array = {10, 20, 30} debe retornar ---> 60
    public static int sumaElementos(int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma+=numeros[i];
        }
        return suma;
    }
    
    // Dado un array de numeros retornar el mayor de todos los elementos
    // Ejemplo: array = {10, 20, 30} debe retornar ---> 30
    public static int mayorElementos(int[] numeros){
        int mano = 999;
        for (int i = 0; i < numeros.length; i++) {
            if(mano>numeros[i]){
                mano = numeros[i];
            }
        }
        return mano;
    }

    // Dado un array de numeros retornar la cantidad de numeros pares
    // Ejemplo: array = {12,25,36,95,1,3} debe retornar ---> 2
    public static int numerosPares(int[] numeros){
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                contador++;
            }
        }
        return contador;
    }

    // Dado un array de numeros retornar el mismo ordenado de menor a mayor.
    // ***NO PUEDES USAR EL SORT***
    // Ejemplo: array = {12,25,36,95,1,3} debe retornar ---> {1,3,12,25,36,95}
    public static int[] numerosOrdenados(int[] numeros){
        int aux = 0;

        for (int i = 0; i < numeros.length; i++) {
           for (int j = i+1; j < numeros.length; j++) {
            if(numeros[i]>numeros[j]){
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux; 
            }
           }
        }
        return numeros;
    }

    
    
}

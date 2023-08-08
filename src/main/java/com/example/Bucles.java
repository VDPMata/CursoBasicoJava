package com.example;

public class Bucles {
    
    
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
    
}
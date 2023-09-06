package com.example;

import java.util.Scanner;

public class Practica {


    public static void main(String[] args) {
       // System.out.println("El sueldo de la persona es: " + sueldoPersona());
       //  System.out.println(compraHeladera());
       // System.out.println(determinarAngulo());
       // System.out.println(importeEstacionamiento());
        // sueldosPagar();
        //cantidadPositivos();
         edades();
        // mostrarEnteros();
        // edadMaxima();
    }
    
    // Calcular el sueldo de una persona, conociendo la cantidad de horas que
    // trabaja en el mes y el valor de la hora.
    public static double sueldoPersona() {
        // Tu codigo:
        double horasMes = 160.00;
        double valor = 8.58;
        return horasMes * valor;
        
    }
    
    // Una persona compra una heladera de pesos X y por pagar en efectivo le hacen
    // 10% de descuento ¿Cuanto abona?
    public static double compraHeladera() {
        // Tu codigo:
        double precioHeladera = 1900;
        double descuento = precioHeladera * 0.10;
        double montoApagar = precioHeladera - descuento;
        return montoApagar;
    }

    // Ingresar la medida de un angulo y determinar si es agudo, obtuso, recto, nulo
    // o llano.
    // Ejemplo:
    // Si es agudo retornar = "agudo"
    // Si es mayor a 180° retornar = "angulo invalido"
    public static String determinarAngulo() {
        // Tu codigo:
        int angulo = 90; 
        if (angulo > 0 && angulo < 90){
            return "agudo";
        } else if (angulo == 90){
            return "recto";
        } else if (angulo > 90 && angulo < 180){
            return "obtuso";
        } else if (angulo == 180){
            return "llano";
        } else {
            return "angulo invalido";
        }        
    }

    // Construir un programa que calcule el importe que debe pagar un auto en un
    // estacionamiento teniendo en cuenta como datos las horas y minutos de uso. El
    // valor de la hora y tiempo seran recibidas por parametro. Si los minutos
    // exceden de 15 se incrementa 1 hora.
    //Ejemplo:
    public static double importeEstacionamiento(){
        // Tu codigo:
        double valor = 2.25;
        int hora = 10;
        int minutos = 1;
        if(minutos > 15 ){
            hora++;
        }
        return hora*valor;
    }
    
    // Una empresa desea conocer el total de sueldos de sus empleados. Hasta que se utilice 0 para dejar de cargar sueldos
    public static void sueldosPagar(){
        // Tu codigo:
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        boolean bandera = true;
        
        do {
            System.out.println("Ingrese el sueldo");
            int numeroIngresado = scanner.nextInt();
            if(numeroIngresado == 0){
                bandera = false;
                scanner.close();
            }else{
              suma +=numeroIngresado;  
            }
            
        } while (bandera);
        System.out.println(suma);
    }

    // Ingresar numeros hasta que el ultimo sea 0. Calcular la cantidad de positivos.
    public static void cantidadPositivos(){
        // Tu codigo:
        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;
        boolean bandera = true;
        while(bandera){
            System.out.println("Ingrese un numero");
            int numero = scanner.nextInt();
            if (numero == 0){
                bandera = false;
                scanner.close();
            }else if (numero > 0){
                contadorPositivos++;
            }
        }
        System.out.println("Cantidad de numeros positivos: " + contadorPositivos);
        
    }

    // Leer edades hasta que la suma de las edades sea = 200. Mostrar: cantidad de personas menores de edad, la cantidad entre 21 y 40 y los mayores a 40
    public static void edades(){
        // Tu codigo:
        Scanner scanner = new Scanner(System.in);
        int sumaEdad = 0;
        int edad = 0;
        int menoresDeEdad = 0;
        int entre18y40 = 0;
        int mayoresDe40 = 0;
        boolean bandera = true;
        while(bandera){
            System.out.println("Ingrese la edad: ");
            edad = scanner.nextInt();
            sumaEdad += edad;
            if (edad < 18){
                menoresDeEdad++;
            } else if (edad > 18 && edad <= 40) {
                entre18y40++;
            } else {
                mayoresDe40++;
            }
            if (sumaEdad >= 200){
                bandera = false;
                scanner.close();
            }
        }
        System.out.println("Menores de edad: " + menoresDeEdad+ " entre 18 y 40: " + entre18y40+ " mayores: " +mayoresDe40 +" la suma es: " + sumaEdad);
    }

    // Mostrar los numeros enteros del a 1 al 50.
    public static void mostrarEnteros(){
        // Tu codigo:
        for(int i=1; i < 51; i++){
            System.out.println("Numero entero: " + i);
        }
    }

    // Mostrar la altura maxima de los jugadores
    public static double edadMaxima(){
        // Tu codigo:
        double[] alturas = {1.97, 1.87, 1.88, 2.09, 2.03, 1.67, 1,87};
        double alturaMax = 0;
        for (int i = 0; i < alturas.length; i++) {
                if(alturas[i]>alturaMax){
                    alturaMax = alturas[i];
                }  
        }
        return alturaMax;
    }

}

# Conceptos Básicos de Java

En este documento, exploraremos algunos conceptos básicos de programación en Java. Estos conceptos son fundamentales para comprender la sintaxis y estructura de un programa en este lenguaje.

## Sintaxis y estructura de un programa Java

Un programa en Java está compuesto por clases y métodos. La estructura básica de un programa Java es la siguiente:

```java
public class MiClase {
    public static void main(String[] args) {
        // Aquí va el código del programa
    }
}
```
- La palabra clave public indica que la clase es accesible desde cualquier lugar.
class indica que estamos definiendo una clase.
- MiClase es el nombre de la clase, que debe comenzar con una letra mayúscula.
- El método main es el punto de entrada del programa y se ejecutará primero cuando inicies el programa.

## Variables y tipos de datos
En Java, las variables son utilizadas para almacenar datos. Antes de usar una variable, debemos declararla y especificar su tipo de dato. Algunos tipos de datos comunes en Java son:


- int: para números enteros, ejemplo:
- 'int' es el tipo de dato.
- 'edad' es el nombre de la variable a la cual se le asigna el valor: 25 
```java
    int edad = 25;
```

- double: para números con decimales, ejemplo:
```java
    double precio = 10.99;
```
- boolean: para valores true o false, ejemplo:
```java
    boolean trueOrFalse = true;
```
- String: para cadenas de texto, ejemplo:
```java
    String nombre = "Nicolas";
```

## Operadores aritméticos y lógicos
Java ofrece varios operadores para realizar operaciones aritméticas y lógicas. Algunos ejemplos de operadores aritméticos son:

- Suma: +
```java
    int sum = num1 + num2;
```
- Resta: -
```java
    int res = num1 - num2;
```
- Multiplicación: *
```java
    int mult = num1 * num2;
```
- División: /
```java
    int div = num1 / num2;
```
- Módulo: % (obtiene el resto de la división)
```java
    int mod = num1 % num2;
```
## Entrada y salida de datos

- Para interactuar con el usuario, necesitamos entrada y salida de datos. En Java, podemos utilizar la clase Scanner para obtener datos del usuario y la clase System.out para mostrar resultados.

```java
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + ". ¡Bienvenido!");
    }
}
```
- El código proporcionado es un programa simple en Java que permite al usuario ingresar su nombre y luego muestra un mensaje de bienvenida personalizado. Vamos a analizarlo línea por línea:

- import java.util.Scanner; En la primera línea, importamos la clase Scanner desde el paquete java.util. El Scanner nos permitirá leer la entrada del usuario desde la consola.

- public class EntradaDatos { Definimos una clase llamada EntradaDatos. El nombre de la clase debe coincidir con el nombre del archivo en el que se encuentra el código (en este caso, se espera que el archivo se llame EntradaDatos.java).}

- public static void main(String[] args) { Aquí, definimos el método principal main. Es el punto de entrada del programa y se ejecutará primero cuando inicies el programa. Este método debe tener exactamente esta firma para que Java pueda encontrarlo y ejecutarlo.}

- Scanner scanner = new Scanner(System.in); Creamos una instancia de la clase Scanner llamada scanner. Esta instancia nos permitirá leer la entrada del usuario desde la consola.

- System.out.print("Ingresa tu nombre: "); Mostramos en la consola el mensaje "Ingresa tu nombre: ". El método print no agrega una nueva línea después del mensaje, por lo que el cursor permanecerá en la misma línea para que el usuario pueda ingresar su nombre a continuación.
Consola:
```bash
Ingresa tu nombre
```
- String nombre = scanner.nextLine(); Leemos la entrada del usuario utilizando el método nextLine() del objeto scanner y almacenamos el resultado en una variable llamada nombre de tipo String. nextLine() lee la línea completa que ingrese el usuario y la asigna a la variable nombre.

- System.out.println("Hola, " + nombre + ". ¡Bienvenido!"); Mostramos en la consola un mensaje de bienvenida personalizado utilizando la variable nombre que hemos leído previamente. La función println agrega una nueva línea después del mensaje, por lo que el siguiente texto se mostrará en una nueva línea.
Consola:
```bash
Hola Nicolas. ¡Bienvenido!
```
## Ejemplo de salida:

```java
public class SalidaDatos {
    public static void main(String[] args) {
        String mensaje = "Hola, este es tu primer mensaje guardado en una variable";
        System.out.println(mensaje);
    }
}
```
Consola:
```bash
Hola, este es tu primer mensaje guardado en una variable
```

## Control de Flujo
En programación, el control de flujo se refiere a la forma en que se ejecutan las instrucciones y cómo se toman decisiones basadas en condiciones específicas. En Java, podemos utilizar estructuras condicionales y estructuras de bucle para controlar el flujo de ejecución de un programa.

## Estructuras Condicionales (if, else if, else)
 Las estructuras condicionales nos permiten tomar decisiones en función de condiciones específicas. En Java, utilizamos las siguientes palabras clave para definir estructuras condicionales:

## Algunos ejemplos de operadores lógicos son:
    
- AND: && (retorna verdadero si ambas condiciones son verdaderas)
- OR: || (retorna verdadero si al menos una de las condiciones es verdadera)
- NOT: ! (niega el resultado de una condición)
    
## Operadores de Comparación
En las estructuras condicionales, utilizamos operadores de comparación para evaluar condiciones. Los operadores de comparación permitencomparar valores y producir resultados booleanos (verdadero o falso). Aquí están algunos ejemplos de operadores de comparación en Java:
    
- " == " Igual a (compara si dos valores son iguales).
- " != " Diferente de (compara si dos valores son diferentes).
- " > " Mayor que (compara si el valor de la izquierda es mayor que el valor de  la derecha).
- " < " Menor que (compara si el valor de la izquierda es menor que el valor de  la derecha).
- " >= " Mayor o igual que (compara si el valor de la izquierda es mayor o igual que el valor de la derecha).
- " <= " Menor o igual que (compara si el valor de la izquierda es menor o igual que el valor de la derecha).

## if
 La estructura if permite ejecutar un bloque de código si se cumple una condición determinada. La sintaxis es la siguiente:

```java
if (condicion) {
    // código a ejecutar si la condición es verdadera
}
```
## else if
 La estructura else if nos permite evaluar múltiples condiciones en caso de que la condición del if no sea verdadera. La sintaxis es la siguiente:

```java
if (condicion1) {
    // código a ejecutar si la condición1 es verdadera
} else if (condicion2) {
    // código a ejecutar si la condicion1 es falsa y la condicion2 es verdadera
}
```

## else
La estructura else se utiliza para definir un bloque de código que se ejecutará si ninguna de las condiciones anteriores es verdadera. La sintaxis es la siguiente:

```java
if (condicion1) {
    // código a ejecutar si la condicion1 es verdadera
} else {
    // código a ejecutar si la condicion1 es falsa
}
```

```java
if (numero1 > numero2) {
    return numero1;
} else {
    return numero2;
}
```
- 'numero1' y 'numero2' son dos variables que se comparan en la condición del if.
- La condición dentro del if es 'numero1' > 'numero2', lo que significa que se evaluará si el valor de numero1 es mayor que el valor de 'numero2'.
- Si la condición ('numero1' > 'numero2') es verdadera, entonces se ejecutará el bloque de código dentro del if, que es retornar el 'numero1'.
- Si la condición 'numero1' > 'numero2' es falsa, entonces se ejecutará el bloque de código dentro del else, que es retornar el 'numero2' .

## Extras

Es comprensible que en este punto puedas tener algunas dudas, ya que aprender a programar no es algo que ocurra de manera instantánea. En este proceso de aprendizaje, es natural que necesitemos realizar investigaciones adicionales y cultivar una actitud curiosa para mejorar nuestras habilidades.

Con este enfoque, ahora procederemos a abordar los [Primeros Pasos](PrimerosPasos.java). En esta etapa, podremos aplicar los conocimientos adquiridos hasta el momento y enfrentarnos a desafíos prácticos que fortalecerán nuestras habilidades de programación en Java.

Recuerda que el aprendizaje de la programación es un viaje continuo, y cada obstáculo que superamos nos acerca un paso más a la maestría. ¡Sigamos adelante con entusiasmo y determinación en este emocionante mundo de la programación!
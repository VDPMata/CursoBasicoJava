## Estructuras de Bucle (for, while, do-while)
Las estructuras de bucle nos permiten repetir un bloque de código varias veces. En Java, tenemos tres tipos de estructuras de bucle:

## for
La estructura for se utiliza para ejecutar un bloque de código un número específico de veces. La sintaxis es la siguiente:
```java
for (inicialización; condición; actualización) {
    // código a ejecutar en cada iteración
}
```
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("El indice es: " + i);
}
```

- En el bucle for, definimos una variable i e inicializamos su valor en 1 (int i = 1).
- La condición del bucle es i <= 5, lo que significa que el bucle se ejecutará siempre que el valor de i sea menor o igual a 5.
- Después de cada iteración del bucle, se ejecuta la expresión i++, que incrementa el valor de i en 1.
- El bloque de código dentro del bucle for es System.out.println(i); que imprime el valor actual de i en cada iteración.
- El resultado de este código será:
Consola:
```bash
El indice es: 1
El indice es: 2
El indice es: 3
El indice es: 4
El indice es: 5
```

## while
La estructura while se utiliza para repetir un bloque de código mientras se cumpla una condición específica. La sintaxis es la siguiente:
```java
while (condición) {
    // código a ejecutar mientras la condición sea verdadera
}
```
```java
int = numero = 1;
while (numero <= 5) {
    System.out.println("El numero es: " + numero);
    numero++;
}
```
- Definimos una variable 'numero' e inicializamos su valor en 1.
- Usamos un bucle while que ejecutará el bloque de código dentro de él mientras la condición (numero <= 5) sea verdadera.
- En cada iteración del bucle, imprimimos el valor actual de numero usando System.out.println(numero) y luego incrementamos el valor de numero en 1 con numero++.

Consola:
```bash
El numero es: 1
El numero es: 2
El numero es: 3
El numero es: 4
El numero es: 5
```

## do-while
La estructura do-while es similar a while, pero garantiza que el bloque de código se ejecutará al menos una vez, ya que la condición se evalúa después de la primera ejecución. La sintaxis es la siguiente:

```java
do {
    // código a ejecutar al menos una vez
} while (condición);
```
Se destaca en situaciones donde queremos crear un flujo de interacción con el usuario, como en el caso de los menús. Donde necesitamos verlos al menos una vez.
```java
int opciones;
do {
        System.out.println("*************************");
        System.out.println("    Menú de Opciones     ");
        System.out.println("*************************");
        System.out.println("1. Nuevo");
        System.out.println("2. Cargar");
        System.out.println("3. Guardar");
        System.out.println("4. Editar");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: "); 
} while(!opciones==5)
```
Consola:
```bash
    *************************
        Menú de Opciones     
    *************************
    1. Nuevo
    2. Cargar
    3. Guardar
    4. Editar
    5. Salir
    Selecciona una opción: 

```


Con estas estructuras de control de flujo, podemos tomar decisiones y repetir bloques de código en función de las condiciones que establezcamos. Esto nos permite crear programas más flexibles y dinámicos.
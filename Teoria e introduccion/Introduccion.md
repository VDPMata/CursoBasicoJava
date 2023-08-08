## Introducción a la Programación y Java

En esta sección introductoria, los estudiantes se familiarizarán con los conceptos fundamentales de la programación y obtendrán una visión general de Java como lenguaje de programación.

1. ¿Qué es la programación?
   - Definición de programación.
   - Importancia de la programación en la era digital.
   - Introducción a la resolución de problemas mediante programación.

2. Introducción a Java
   - ¿Qué es Java y por qué es popular?
   - Historia de Java y su evolución.
   - Diferencias entre Java y otros lenguajes de programación.

3. Configuración del entorno de desarrollo
   - Descarga e instalación del JDK (Java Development Kit).
   - Instalación de un IDE (Integrated Development Environment).
   - Verificación del entorno de desarrollo configurado.

4. Primer programa en Java
   - Estructura básica de un programa Java.
   - Creación de un programa "Hola Mundo" en Java.
   - Compilación y ejecución del programa.

## 1. ¿Qué es la programación?

La programación es el proceso de escribir instrucciones para una computadora con el fin de realizar tareas y resolver problemas. Consiste en crear un conjunto de comandos y algoritmos que permiten a una máquina llevar a cabo una serie de acciones de manera secuencial o condicional.

## Importancia de la programación en la era digital

En la era digital actual, la programación es una habilidad fundamental y valiosa. La tecnología está presente en todos los aspectos de nuestras vidas, desde teléfonos inteligentes hasta electrodomésticos, vehículos y sistemas de comunicación. La capacidad de programar nos permite interactuar y controlar estas tecnologías, mejorando la eficiencia y la productividad en diversos campos.

## Introducción a la resolución de problemas mediante programación

La programación es una herramienta poderosa para resolver problemas complejos de manera estructurada y lógica. Permite descomponer un problema en partes más pequeñas y abordar cada una de ellas de forma individual. Los programadores utilizan el pensamiento algorítmico y la creatividad para desarrollar soluciones que resuelvan de manera efectiva y eficiente los desafíos que se les presentan.

La programación también permite la automatización de tareas repetitivas, lo que ahorra tiempo y minimiza errores humanos en procesos críticos.

## 2. Introducción a Java

- ¿Qué es Java y por qué es popular?
  Java es un lenguaje de programación de alto nivel y orientado a objetos que fue desarrollado por Sun Microsystems en la década de 1990. Es popular debido a su portabilidad, seguridad y versatilidad. Permite a los desarrolladores escribir una vez y ejecutar en cualquier plataforma, lo que lo hace adecuado para aplicaciones web, móviles, de escritorio y servidores.

- Historia de Java y su evolución.
  Java fue creado por James Gosling y su equipo en Sun Microsystems en 1991, inicialmente como un proyecto para dispositivos electrónicos. Luego, en 1995, se lanzó oficialmente la primera versión de Java. Desde entonces, ha pasado por varias actualizaciones y mejoras, y se ha convertido en uno de los lenguajes de programación más utilizados en el mundo.

- Diferencias entre Java y otros lenguajes de programación.
  A diferencia de algunos lenguajes de programación, Java es un lenguaje de programación compilado e interpretado. Se compila a bytecode que luego se ejecuta en una máquina virtual Java (JVM). Esto permite que las aplicaciones Java sean altamente portables. Además, Java está diseñado para ser seguro y robusto, lo que lo convierte en una elección popular para aplicaciones críticas y de misión crítica.

## 3. Configuración del entorno de desarrollo

- Descarga e instalación del JDK (Java Development Kit).
  Para comenzar a programar en Java, es necesario instalar el JDK, que incluye el compilador de Java (javac), las bibliotecas y herramientas necesarias para el desarrollo. El JDK está disponible en el sitio web oficial de Oracle y otros proveedores de Java.

- Instalación de un IDE (Integrated Development Environment).
  Aunque es posible desarrollar en Java utilizando un editor de texto simple y la línea de comandos, se recomienda utilizar un IDE, ya que proporciona herramientas avanzadas de desarrollo y facilita la escritura y depuración de código. Ejemplos de IDE populares para Java son Eclipse, IntelliJ IDEA y NetBeans.

- Verificación del entorno de desarrollo configurado.
  Una vez instalado el JDK y el IDE, es importante verificar que todo esté configurado correctamente. Se debe configurar el JDK en el IDE y asegurarse de que se pueda compilar y ejecutar programas Java sin problemas.

# Tutorial: Configuración del entorno de desarrollo para Java

En este tutorial, te guiaré paso a paso para configurar el entorno de desarrollo para Java. Asegúrate de seguir cada paso con cuidado para poder empezar a programar en Java sin problemas.

## Paso 1: Descarga e instalación del JDK (Java Development Kit)

1.1. Accede al sitio web oficial de Oracle para descargar el JDK: [Descargar JDK](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)

1.2. Asegúrate de seleccionar la versión adecuada del JDK según tu sistema operativo (Windows, macOS o Linux) y arquitectura (32 bits o 64 bits).

1.3. Haz clic en el enlace de descarga y acepta los términos y condiciones.

1.4. Una vez que se haya descargado el archivo de instalación, ejecútalo y sigue las instrucciones para completar la instalación del JDK en tu sistema.

## Paso 2: Instalación de un IDE (Integrated Development Environment)

2.1. Aunque puedes programar en Java utilizando un editor de texto simple y la línea de comandos, te recomiendo utilizar un IDE, ya que facilitará enormemente tu experiencia de desarrollo.

2.2. Algunos IDEs populares para Java son:
   - [Eclipse](https://www.eclipse.org/downloads/): Eclipse es un IDE de código abierto ampliamente utilizado en la comunidad de desarrollo de Java.
   - [IntelliJ IDEA](https://www.jetbrains.com/idea/): IntelliJ IDEA es un IDE desarrollado por JetBrains que ofrece una experiencia de desarrollo rápida y potente.
   - [NetBeans](https://netbeans.apache.org/): NetBeans es otro IDE de código abierto que brinda muchas características útiles para el desarrollo en Java.

2.3. Elige el IDE que prefieras y accede a su sitio web para descargar el instalador.

2.4. Ejecuta el archivo de instalación y sigue las instrucciones para completar la instalación del IDE en tu sistema.

## 4 Primer programa en Java

- Abre tu IDE recién instalado.

- Crea un nuevo proyecto o archivo de Java. La mayoría de los IDEs ofrecen plantillas para proyectos de Java o la opción de crear un archivo de clase Java en blanco.

- Escribe un programa Java simple, por ejemplo, el clásico "Hola Mundo":

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
```
Consola:
```bash
Hola mundo
```

- Guarda el archivo con una extensión ".java" (por ejemplo, "HolaMundo.java").

- Intenta compilar y ejecutar el programa. Si todo está configurado correctamente, deberías ver "Hola Mundo" impreso en la consola.

¡Felicidades! Has configurado con éxito tu entorno de desarrollo para Java. Ahora estás listo para empezar a programar en este emocionante lenguaje. ¡Disfruta de tu experiencia de desarrollo en Java!

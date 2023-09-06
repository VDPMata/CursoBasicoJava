package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringMathTest {

    @Test
    void testStrLongitudIguales() {
        boolean resultado = StringMath.strLongitud("abc", "xyz");
        Assertions.assertTrue(resultado, "Las cadenas 'abc' y 'xyz' deberían tener la misma longitud");
    }

    @Test
    void testStrLongitudDiferentes() {
        boolean resultado = StringMath.strLongitud("hola", "mundo");
        Assertions.assertFalse(resultado, "Las cadenas 'hola' y 'mundo' no deberían tener la misma longitud");
    }

    @Test
    void testElevarExp() {
        double resultado = StringMath.elevarExp(2, 5);
        Assertions.assertEquals(32, resultado, "El resultado deberia ser 32");
    }

    @Test
    void testNumeroRedondo() {
        double resultado = StringMath.numeroRedondo(3.7);
        Assertions.assertEquals(4, resultado, "El número 3.7 debería redondearse hacia arriba a 4");
    }

    @Test
    void testNumeroRedondoAbajo() {
        double resultado = StringMath.numeroRedondoAbajo(3.7);
        Assertions.assertEquals(3, resultado, "El número 3.7 debería redondearse hacia abajo a 3");
    }

    @Test
    void testElevarCuadrado() {
        int resultado = StringMath.elevarCuadrado(5);
        Assertions.assertEquals(25, resultado, "El resultado deberia ser 25");
    }

    @Test
    void testElevarCubo() {
        int resultado = StringMath.elevarCubo(5);
        Assertions.assertEquals(125, resultado, "El resultado deberia ser 125");
    }

}

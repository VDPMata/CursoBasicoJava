package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimerosPasosTest {
    @Test
    void testAgregarExclamacion() {
        String resultado = PrimerosPasos.agregarExclamacion("Hola Mundo");
        Assertions.assertEquals("Hola Mundo!!!", resultado, "El resultado deberia ser: Hola Mundo!!!");
    }

    @Test
    void testAreaTriangulo() {
        int resultado = PrimerosPasos.areaTriangulo(5, 3);
        Assertions.assertEquals(7, resultado, "El area deberia ser 7");
    }

    @Test
    void testArgDolares() {
        int resultado = PrimerosPasos.argDolares(1000);
        Assertions.assertEquals(525000, resultado, "el resultado deberia ser 525000");
    }

    @Test
    void testCaracter() {
        char resultado = PrimerosPasos.caracter();
        Assertions.assertTrue(Character.isDefined(resultado), "El resultado no es de tipo Caracter");
    }

    @Test
    void testDivision() {
        int resultado = PrimerosPasos.division(8, 4);
        Assertions.assertEquals(2, resultado, "El resultado deberia ser 2");
    }

    @Test
    void testIguales() {
        boolean resultado = PrimerosPasos.iguales(5, 5);
        Assertions.assertTrue(resultado, "El resultado deberia ser true");
    }

    @Test
    void testMayor() {
        int resultado = PrimerosPasos.mayor(5,3);
        Assertions.assertEquals(5, resultado, "El resultado deberia ser el primer numero");
    }

    @Test
    void testMayorB(){
        int resultado = PrimerosPasos.mayor(3, 5);
        Assertions.assertEquals(5, resultado, "El resultado deberia ser el segundo numero");
    }

    @Test
    void testMayorTresABC() {
        int resultado = PrimerosPasos.mayorTres(8, 3, 5);
        Assertions.assertEquals(8, resultado, "El resultado deberia ser el primero numero");
    }

    @Test
    void testMayorTresBAC() {
        int resultado = PrimerosPasos.mayorTres(5, 8, 3);
        Assertions.assertEquals(8, resultado, "El resultado deberia ser el segundo numero");
    }

    @Test
    void testMayorTresCAB() {
        int resultado = PrimerosPasos.mayorTres(5, 3, 8);
        Assertions.assertEquals(8, resultado, "El resultado deberia ser el tercero numero");
    }
    
    @Test
    void testModulo() {
        int resultado = PrimerosPasos.modulo(4, 2);
        Assertions.assertEquals(0, resultado, "El resultado deberia ser 0");
    }

    @Test
    void testMultiplicacion() {
        int resultado = PrimerosPasos.multiplicacion(4, 8);
        Assertions.assertEquals(32, resultado, "El resultado deberia ser 32");
    }

    @Test
    void testNombreApellido() {
        String resultado = PrimerosPasos.nombreApellido("VDP", "Mata");
        Assertions.assertEquals("VDP Mata", resultado, "El resultado deberia ser: VDP Mata");
    }

    @Test
    void testNum() {
        int resultado = PrimerosPasos.num();
        Assertions.assertTrue(resultado >= Integer.MIN_VALUE && resultado <= Integer.MAX_VALUE, "El resultado no es de tipo Int");
    }

    @Test
    void testNumDecimal() {
        double resultado = PrimerosPasos.numDecimal();
        Assertions.assertTrue(!Double.isNaN(resultado) && !Double.isInfinite(resultado), "El resultado no es de tipo Double");
    }

    @Test
    void testNumeroMayorNoventaTrue() {
        boolean resultado = PrimerosPasos.numeroMayorNoventa(100);
        Assertions.assertTrue(resultado,"El numero 100 es mayor que 90");
    }

    @Test
    void testNumeroMayorNoventaFalse() {
        boolean resultado = PrimerosPasos.numeroMayorNoventa(80);
        Assertions.assertFalse(resultado,"El numero 80 es menor que 90");
    }

    @Test
    void testNumeroMenorCincuentaTrue() {
        boolean resultado = PrimerosPasos.numeroMenorCincuenta(40);
        Assertions.assertTrue(resultado, "El numero 40 es menor que 50");
    }
    @Test
    void testNumeroMenorCincuentaFalse() {
        boolean resultado = PrimerosPasos.numeroMenorCincuenta(60);
        Assertions.assertFalse(resultado, "El numero 60 es mayor que 50");        
    }

    @Test
    void testParOImparPar() {
        boolean resultado = PrimerosPasos.parOImpar(10);
        Assertions.assertTrue(resultado, "El número 10 debería ser identificado como par");
    }

    @Test
    void testParOImparImpar() {
        boolean resultado = PrimerosPasos.parOImpar(7);
        Assertions.assertFalse(resultado, "El número 7 debería ser identificado como impar");
    }

    @Test
    void testPerimetro() {
        int resultado = PrimerosPasos.perimetro(4);
        Assertions.assertEquals(16, resultado, "El perimetro deberia ser 16");
    }

    @Test
    void testPositivoONegativoCero() {
        String resultado = PrimerosPasos.positivoONegativo(0);
        Assertions.assertEquals("False", resultado, "El número 0 debería ser identificado como cero");
    }

    @Test
    void testPositivoONegativoPositivo() {
        String resultado = PrimerosPasos.positivoONegativo(10);
        Assertions.assertEquals("Es positivo", resultado, "El número 10 debería ser identificado como positivo");
    }

    @Test
    void testPositivoONegativoNegativo() {
        String resultado = PrimerosPasos.positivoONegativo(-5);
        Assertions.assertEquals("Es negativo", resultado, "El número -5 debería ser identificado como negativo");
    }

    @Test
    void testResta() {
        int resultado = PrimerosPasos.resta(10,5);
        Assertions.assertEquals(5, resultado, "El resultado deberia ser: 5");
    }

    @Test
    void testSaludoNombre() {
        String resultado = PrimerosPasos.saludoNombre("Martin");
        Assertions.assertEquals("Hola Martin", resultado, "El saludo con el nombre Martin debería ser 'Hola Martin'");
    
    }

    @Test
    void testStr() {
        final Object resultado = PrimerosPasos.str();
        Assertions.assertTrue(resultado instanceof String, "El resultado no es de tipo String");
    }

    @Test
    void testSuma() {
        int resultado = PrimerosPasos.suma(11,10);
        Assertions.assertEquals(21, resultado, "El resultado deberia ser 5");
    }

}

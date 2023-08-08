package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuclesTest {
    
    @Test
    void testSumaFor() {
        int resultado = Bucles.sumaFor(5, 10);
        Assertions.assertEquals(45, resultado, "El resultado deberia ser 45");
    }
}

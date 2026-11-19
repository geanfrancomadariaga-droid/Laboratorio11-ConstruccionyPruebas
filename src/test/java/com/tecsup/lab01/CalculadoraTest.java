
package com.tecsup.lab01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void preparar() {
        calculadora = new Calculadora();
    }

    @Test
    void sumar_dosNumeros_retornaResultado() {
        int a = 2;
        int b = 3;

        int resultado = calculadora.sumar(a, b);

        assertEquals(5, resultado);
    }

    // Prueba 1 - Division normal
    @Test
    void dividir_dosNumeros_retornaResultado() {
        // Arrange
        double a = 10;
        double b = 2;

        // Act
        double resultado = calculadora.dividir(a, b);

        // Assert
        assertEquals(5.0, resultado);
    }

    // Prueba 2 - Division entre cero
    @Test
    void dividir_entreCero_lanzaExcepcion() {
        // Arrange
        double a = 10;
        double b = 0;

        // Act y Assert
        assertThrows(
            ArithmeticException.class,
            () -> calculadora.dividir(a, b)
        );
    }

    // Prueba 3 - Division negativa
    @Test
    void dividir_numeroNegativo_retornaNegativo() {
        // Arrange
        double a = -10;
        double b = 2;

        // Act
        double resultado = calculadora.dividir(a, b);

        // Assert
        assertEquals(-5.0, resultado);
    }

    // Prueba 4 - Cero como dividendo
    @Test
    void dividir_ceroEntreCinco_retornaCero() {
        // Arrange
        double a = 0;
        double b = 5;

        // Act
        double resultado = calculadora.dividir(a, b);

        // Assert
        assertEquals(0.0, resultado);
    }

    // Prueba 5 - Numero positivo
    @Test
    void esPositivo_numeroPositivo_retornaTrue() {
        // Arrange
        int numero = 8;

        // Act
        boolean resultado = calculadora.esPositivo(numero);

        // Assert
        assertTrue(resultado);
    }

    // Prueba 6 - Numero negativo
    @Test
    void esPositivo_numeroNegativo_retornaFalse() {
        // Arrange
        int numero = -4;

        // Act
        boolean resultado = calculadora.esPositivo(numero);

        // Assert
        assertFalse(resultado);
    }

    // Prueba 7 - Caso limite cero
    @Test
    void esPositivo_cero_retornaFalse() {
        // Arrange
        int numero = 0;

        // Act
        boolean resultado = calculadora.esPositivo(numero);

        // Assert
        assertFalse(resultado);
    }
}

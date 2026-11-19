
package com.tecsup.lab01;

public class Calculadora {


    public int sumar(int a, int b) {
        return a + b;
    }

    // Nuevo metodo 
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException(
                "No se puede dividir entre cero"
            );
        }

        return a / b;
    }

    // Nuevo metodo 
    public boolean esPositivo(int n) {
        return n > 0;
    }
}

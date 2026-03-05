package testeApp;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadoraDigital.Calculadora;

public class CalculadoraTeste {

    /**
     * Teste de somar na Calculadora.
     */
    @Test
    public void testeSomar5com5() {
        double nro1 = 5;
        double nro2 = 5;

        Calculadora calc = new Calculadora();

        double resultadoEsperado = 10;
        double resultadoReal = calc.somar(nro1, nro2);

        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    /**
     * Teste de subtrair na Calculadora.
     */
    @Test
    public void testeSubtrair3de5() {
        double nro1 = 5;
        double nro2 = 3;

        Calculadora calc = new Calculadora();

        double resultadoEsperado = 2;
        double resultadoReal = calc.subtrair(nro1, nro2);

        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    /**
     * Teste de multiplicar na Calculadora.
     */
    @Test
    public void testeMultiplicar3por3() {
        int nro1 = 3;
        int nro2 = 3;

        Calculadora calc = new Calculadora();

        double resultadoEsperado = 9;
        double resultadoReal = calc.multiplicar(nro1, nro2);

        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    /**
     * Teste de dividir na Calculadora.
     */
    @Test
    public void testeDividir3por7() {
        double nro1 = 3;
        double nro2 = 7;

        Calculadora calc = new Calculadora();

        double resultadoEsperado = 0.428571;
        double resultadoReal = calc.dividir(nro1, nro2);

        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }
    
    @Test
    public void testeSomar5com5() {
        double nro1 = 5;
        double nro2 = 5;
        Calculadora calc = new Calculadora();
        double resultadoEsperado = 10;
        double resultadoReal = calc.somar(nro1, nro2);
        assertEquals(resultadoEsperado, resultadoReal, 0);
    }
}
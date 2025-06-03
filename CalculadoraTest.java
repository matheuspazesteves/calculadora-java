import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    // Testes de Soma
    @Test
    void testSomarNumerosPositivos() {
        assertEquals(7.0, calc.somar(3.0, 4.0));
    }

    @Test
    void testSomarNumerosNegativos() {
        assertEquals(-7.0, calc.somar(-3.0, -4.0));
    }

    @Test
    void testSomarComZero() {
        assertEquals(5.0, calc.somar(5.0, 0.0));
    }

    // Testes de Subtração
    @Test
    void testSubtrairNumerosPositivos() {
        assertEquals(1.0, calc.subtrair(5.0, 4.0));
    }

    @Test
    void testSubtrairNumerosNegativos() {
        assertEquals(-1.0, calc.subtrair(-5.0, -4.0));
    }

    @Test
    void testSubtrairComZero() {
        assertEquals(5.0, calc.subtrair(5.0, 0.0));
    }

    // Testes de Multiplicação
    @Test
    void testMultiplicarNumerosPositivos() {
        assertEquals(20.0, calc.multiplicar(5.0, 4.0));
    }

    @Test
    void testMultiplicarNumerosNegativos() {
        assertEquals(20.0, calc.multiplicar(-5.0, -4.0));
    }

    @Test
    void testMultiplicarComZero() {
        assertEquals(0.0, calc.multiplicar(5.0, 0.0));
    }

    // Testes de Divisão
    @Test
    void testDividirNumerosPositivos() {
        assertEquals(2.0, calc.dividir(10.0, 5.0));
    }

    @Test
    void testDividirNumerosNegativos() {
        assertEquals(2.0, calc.dividir(-10.0, -5.0));
    }

    @Test
    void testDividirPorZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10.0, 0.0);
        });

        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}

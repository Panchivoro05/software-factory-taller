import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    private final Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(-8, calc.sumar(-5, -3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calc.restar(5, 4));
        assertEquals(-2, calc.restar(-5, -3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(12, calc.multiplicar(3, 4));
        assertEquals(-15, calc.multiplicar(-5, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(10, 5), 0.0001);
        assertEquals(-2.5, calc.dividir(-5, 2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorCero() {
        calc.dividir(5, 0);
    }
    
}

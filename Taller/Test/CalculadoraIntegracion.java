import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraIntegracion {
      private Calculadora calc;

    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testOperacionCompleta() {
        
        int suma = calc.sumar(2, 3);
        int resultado = calc.multiplicar(suma, 4);
        assertEquals(20, resultado);
    }

    @Test
    public void testOperacionConDivision() {
        
        int resta = calc.restar(10, 2);
        double division = calc.dividir(resta, 2);
        double resultado = calc.sumar((int) division, 3);
        assertEquals(7.0, resultado, 0.0001);
    }

}

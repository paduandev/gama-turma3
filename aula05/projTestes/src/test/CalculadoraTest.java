package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Calculadora;

public class CalculadoraTest {
    private Calculadora c;

    @BeforeEach
    public void setup() {
        c = new Calculadora();
    }
    
	@Test
	public void deveRetornarASomadosValores() {
		double resultado = c.somar(10, 20);

		assertEquals(30, resultado);
	}
	
    @Test
    public void deveRetornarASubtracaoDosNumeros() {
        double resultado = c.subtrair(20, 10);
        
        assertEquals(10, resultado);
    }
    
    @Test
    public void deveRetornarOProdutoDosNumeros() {
        double resultado = c.multiplicar(5, 2);

        assertEquals(10, resultado);
    }
    
    /*     @Test
    public void deveRetornarNegativoQuandoDenominadorZero() {
        double resultado = c.dividir(20, 0);

        assertEquals(-1, resultado);
    } */

    @Test
	public void deveRetornarValorNegativoQuandoDivisorIgualZero() {
		Throwable exception = assertThrows(ArithmeticException.class, () -> {
			c.dividir(1, 0);
	    });
	    assertEquals("Divisão por zero", exception.getMessage());
		
	}
}

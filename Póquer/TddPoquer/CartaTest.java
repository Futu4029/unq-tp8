package TddPoquer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartaTest {
	public Carta DiezCorazon;
	public Carta AsPica;
	
	@BeforeEach
	public void setUp() {
		DiezCorazon = new Carta(Valor.Diez, Palo.Corazon);
		AsPica = new Carta(Valor.As, Palo.Pica);
	}
	
	@Test
	public void cartaTest(){
		assertEquals(Valor.As, AsPica.getValor());
	}
}

package pokerMokito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import TddPoquer.*;
class PokerMokito {
	
	
	@BeforeEach
	public void setUp() {
		
	}
	@Test
	void verificarTest() {
		
		// Setup
		// DOC
		Carta as = mock(Carta.class); //dummy
		Carta relleno = mock(Carta.class); //dummy
		// SUT
		PokerStatus status = mock(PokerStatus.class);
		
		when(as.getValor()).thenReturn(Valor.As);
		when(relleno.getValor()).thenReturn(Valor.Rey);
		// EXCERCISE 
		status.verificar(as, as, as, as, relleno);
		verify(status).verificar(as, as, as, as, relleno);
	}

}

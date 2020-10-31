package TddPoquer;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoquerTest {
	//Definimos el Setup
	public PokerStatus status;
	public Carta cuatroD;
	public Carta cuatroP ;
	public Carta cuatroC;
	public Carta cuatroT;
	public Carta reinaT;
	public Carta seisC;
	public Carta ochoT;
	public Carta reyT;
	public Carta asT;
	public List<Carta> mano1;
	public List<Carta> mano2;
	public List<Carta> mano3;
	
	@BeforeEach
	public void setUp() {
		this.status = new PokerStatus();
		this.cuatroD = new Carta(Valor.Cuatro, Palo.Diamante);
		this.cuatroP = new Carta(Valor.Cuatro, Palo.Pica);
		this.cuatroC = new Carta(Valor.Cuatro, Palo.Corazon);
		this.cuatroT= new Carta(Valor.Cuatro, Palo.Trebol);
		this.reinaT = new Carta(Valor.Reina, Palo.Trebol);
		this.seisC = new Carta(Valor.Seis, Palo.Corazon);
		this.ochoT = new Carta(Valor.Ocho, Palo.Trebol);
		this.reyT = new Carta(Valor.Rey, Palo.Trebol);
		this.asT = new Carta(Valor.As, Palo.Trebol);
		this.mano1 = Arrays.asList(cuatroD, cuatroP, cuatroC, cuatroT, reinaT); //mano de poker
		this.mano2 = Arrays.asList(ochoT,asT,reyT,cuatroT,reinaT); //mano de color
		this.mano3 = Arrays.asList(cuatroD,cuatroP,cuatroC,reinaT,reyT); //mano de trio
	}
	
	@Test
	void esPoker() {
		//exercise & verify
		assertEquals(Jugada.Poker, status.verificar(cuatroD,cuatroP,cuatroC,cuatroT,reinaT));
		//no posee teardown
	}
	@Test
	void noEsPoker() {
		//exercise & verify
		assertNotEquals(Jugada.Poker, status.verificar(cuatroD,reyT,cuatroC,cuatroT,reinaT));
		//no posee teardown
	}
	@Test
	void esPoker2() {
		//exercise & verify
		assertEquals(Jugada.Poker, status.verificar(cuatroD,cuatroP,cuatroC,reinaT,cuatroT));
		//no posee teardown
	}
	@Test
	void esPoker3() {
		//exercise & verify
		assertEquals(Jugada.Poker, status.verificar(cuatroP,reinaT,cuatroD,cuatroC,cuatroT));
		//no posee teardown
	}
	
	@Test
	void esColor() {
		//exercise & verify
		assertEquals(Jugada.Color, status.verificar(ochoT,asT,reyT,cuatroT,reinaT));
		//no posee teardown
	}
	
	void noEsColor() {
		//exercise & verify
		assertEquals(Jugada.Color, status.verificar(ochoT,asT,reyT,cuatroP,reinaT));
		//no posee teardown
	}

	@Test
	void esTrio() {
		//exercise & verify
		assertEquals(Jugada.Trio, status.verificar(cuatroD,cuatroP,cuatroC,reinaT,reyT));
		//no posee teardown
	}
	
	@Test
	void esNada() {
		//exercise & verify
		assertEquals(Jugada.Nada, status.verificar(cuatroT,reinaT,cuatroD,reyT,ochoT));
		//no posee teardown
	}
	@Test
	void esMismoPalo() {
		//exercise & verify
		assertTrue(status.esMismoPalo(cuatroT, reinaT));
		//no posee teardown
	}
	@Test
	void noEsMismoPalo() {
		//exercise & verify
		assertFalse(status.esMismoPalo(cuatroP, reinaT));
		//no posee teardown
	}
	// La primer carta le gana a la segunda
	@Test
	void esMayor() {
		//exercise & verify
		assertTrue(status.esSuperior(reyT, cuatroD));
		//no posee teardown
	}
	@Test
	void esMayor2() {
		//exercise & verify
		assertTrue(status.esSuperior(asT, reyT));
		//no posee teardown
	}
	@Test
	void esMayor3() {
		//exercise & verify
		assertFalse(status.esSuperior(reyT, reyT));
		//no posee teardown
	}
	@Test
	void noEsMayor2() {
		//exercise & verify
		assertFalse(status.esSuperior(reyT, asT));
		//no posee teardown
	}
	// La primer mano le gana a la segunda
	@Test
	void leGanaA() {
		//exercise & verify
		assertTrue(status.leGana(mano1, mano2));
		//no posee teardown
	}
	@Test
	void noLeGanaA() {
		//exercise & verify
		assertFalse(status.leGana(mano2, mano1));
		//no posee teardown
	}

}

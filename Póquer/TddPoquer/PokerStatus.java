package TddPoquer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {
	
	public Jugada verificar(Carta s1, Carta s2, Carta s3, Carta s4, Carta s5) {
		List<Carta> mano = Arrays.asList(s1,s2,s3,s4,s5); 
		return this.definirJugada(mano);
	}
	
	public Jugada definirJugada(List<Carta> mano) {
		Jugada resultado = (this.esPoquer(mano)) ? Jugada.Poker : 
			   			   (this.esColor(mano)) ? Jugada.Color : 
			   			   (this.esTrio(mano)) ? Jugada.Trio : 
			   				   					Jugada.Nada;
		return resultado;
	}
	
	public boolean esPoquer(List<Carta> mano) {
		Valor primera = mano.get(0).getValor();
		Valor segunda = mano.get(1).getValor();
		boolean resultado = mano.stream().filter(carta -> carta.getValor() == primera).collect(Collectors.toList()).size() == 4 ||
				            mano.stream().filter(carta -> carta.getValor() == segunda).collect(Collectors.toList()).size() == 4;
		return resultado;
	}
	
	
	public boolean esColor(List<Carta> mano) {
		Palo primera = mano.get(0).getPalo();
		boolean resultado = mano.stream().filter(carta -> carta.getPalo() == primera).collect(Collectors.toList()).size() == 5;
		return resultado;
	}
	
	public boolean esTrio(List<Carta> mano) {
		Valor primera = mano.get(0).getValor();
		Valor segunda = mano.get(1).getValor();
		Valor tercera = mano.get(2).getValor();
		boolean resultado = mano.stream().filter(carta -> carta.getValor() == primera).collect(Collectors.toList()).size() == 3 ||
				            mano.stream().filter(carta -> carta.getValor() == segunda).collect(Collectors.toList()).size() == 3 ||
				            mano.stream().filter(carta -> carta.getValor() == tercera).collect(Collectors.toList()).size() == 3;
		return resultado;
	}
	
	// devuelve verdadero si la primera carta es mayor a la segunda
	public boolean esSuperior(Carta c1, Carta c2) {
		boolean resultado = (c2.getValor().compareTo(c1.getValor()) > 0) ? true : false;
		return resultado;
	}
	
	public boolean esMismoPalo(Carta c1, Carta c2) {
		return c1.getPalo() == c2.getPalo();
	}
	
	public boolean leGana(List<Carta> mano1, List<Carta> mano2) {
		Jugada resultado = this.definirJugada(mano1);
		Jugada resultado2 = this.definirJugada(mano2);
		boolean resultado3 = (resultado2.compareTo(resultado) > 0) ? true : false; 
		return resultado3;
	}
	
	
	
	
	
	
}

package TddPoquer;

import java.util.List;
import java.util.stream.Collectors;

public enum Jugada {
		Poker, Color, Trio, Nada;
		
	public Carta mejorCarta(List<Carta> mano) {
		Valor valor1 = mano.get(0).getValor();
		Valor valor2 = mano.get(1).getValor();
		Valor valor3 = mano.get(2).getValor();
		List<Carta> firstCase = mano.stream().filter(carta -> carta.getValor() == valor1).collect(Collectors.toList());
		List<Carta> secondCase = mano.stream().filter(carta -> carta.getValor() == valor2).collect(Collectors.toList());
	    List<Carta> thirdCase = mano.stream().filter(carta -> carta.getValor() == valor3).collect(Collectors.toList());
		List<Carta> resultado = (firstCase.size() >= 3) ? firstCase :
								(secondCase.size() >= 3) ?  secondCase :
								thirdCase;
		return resultado.get(0);
	}
}

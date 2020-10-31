package TddPoquer;

public class Carta {

	private Valor valor;
	private Palo palo;
	
	public Carta(Valor valor, Palo palo) {
		super();
		this.valor = valor;
		this.palo = palo;
	}
	public Valor getValor() {
		return valor;
	}
	public Palo getPalo() {
		return palo;
	}
	public void setValor(Valor valor) {
		this.valor = valor;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	
}

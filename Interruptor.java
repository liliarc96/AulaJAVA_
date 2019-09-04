
public class Interruptor {
	private Lampada lampada;

	public Lampada getLampada() {
		return lampada;
	}

	public void setLampada(Lampada lampada) {
		this.lampada = lampada;
	}
	
	public void exibirStatus() {
		System.out.println(getLampada().getEstado());
	}
	
	public void ligar() {
		getLampada().ligarLampada();
		exibirStatus();
	}
	public void desligar() {
		getLampada().desligarLampada();
		exibirStatus();
	}
}

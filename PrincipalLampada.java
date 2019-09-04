
public class PrincipalLampada {

	public static void main(String[] args) {
		Interruptor pitoco = new Interruptor();
		
		pitoco.setLampada(new Lampada());
		pitoco.ligar();
		pitoco.ligar();
	}

}

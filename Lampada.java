
public class Lampada {
	public int estado;

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public void ligarLampada() {
		if(this.estado == 1) {
			System.out.println("A lâmpada já está ligada!");
		}else {
			this.estado = 1;
		}
	}
	
	public void desligarLampada() {
		if(this.estado == 0) {
			System.out.println("A lâmpada já está desligada!");
		}else {
			this.estado = 0;
		}
	}
}

/*
Com boolean:

public boolean estaLigada = false;

public void apagar(){
	this.estaLigada = false;
}
public void acender(){
	this.estaLigada = true;
}
*/


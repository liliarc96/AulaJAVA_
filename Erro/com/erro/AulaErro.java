package com.erro;

public class AulaErro {
	
	public static void main(String[] args) {
		AulaErro aulaerro = new AulaErro();
		aulaerro.usaMetodoTorto();
		System.out.println("Passou");
		
		try {
			aulaerro.metodoTorto();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void usaMetodoTorto() {
		try {
			usaMetodoTorto();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void metodoTorto() throws Exception{
		throw new Exception("Código bugado");
	}
}

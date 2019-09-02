
public class Media {
	public void media(float notaA, float notaB, float notaC){
		float media;
		
		media = (notaA + notaB + notaC)/3;
		
		if (media >= 7.0) {
			System.out.println("APROVADO :)");
		}else if(media >= 5.0 && media < 7.0) {
			System.out.println("RECUPERAÇÃO :|");
		}else if(media < 5.0) {
			System.out.println("REPROVADO :(");
		}
	}

}

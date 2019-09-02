import java.util.Scanner;

public class ResultadoProva {

	public static void main(String[] args) {
		Media aluno1 = new Media();
		
		float notaA;
		float notaB;
		float notaC;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		notaA = leitor.nextInt();
		System.out.println("Informe a segunda nota: ");
		notaB = leitor.nextInt();
		System.out.println("Informe a terceira nota: ");
		notaC = leitor.nextInt();
		
		aluno1.media(notaA, notaB, notaC);

	}
}

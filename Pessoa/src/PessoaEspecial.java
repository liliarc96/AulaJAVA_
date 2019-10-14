
public class PessoaEspecial extends Pessoa{
	private boolean ehBoa;

	public PessoaEspecial() {
		this(false); //1.Vai para construtor PessoaEspecial(boolean ehBoa)
		System.out.println("Construtor Pessoa Especial " + ehBoa);//5.
	}
	public PessoaEspecial(boolean ehBoa) {
		super();//2.Vai para classe pai (construtor classe pai)
		this.ehBoa = ehBoa;//Construtor classe atual
		System.out.println("Construtor Pessoa Especial " + ehBoa);//4.Mostra: Construtor Pessoa Especial false
	}
	
	public boolean isEhBoa() {
		return ehBoa;
	}

	public void setEhBoa(boolean ehBoa) {
		this.ehBoa = ehBoa;
	}
}

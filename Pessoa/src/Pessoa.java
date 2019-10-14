
public class Pessoa {
	private String nome;
	
	public Pessoa() {
		System.out.println("P");//3. Imprime P por causa da função super() em PessoaEspecial
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

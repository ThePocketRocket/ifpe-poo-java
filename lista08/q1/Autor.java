package lista08.q1;

public class Autor {
	private final String CPF;
	private String nome, endereco;

	public Autor(String CPF, String nome, String endereco) {
		this.CPF = CPF;
		setNome(nome);
		setEndereco(endereco);
	}

	public String getCPF() {
		return CPF;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}

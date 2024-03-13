package lista08.q1;

public class Editora {
	private final String CNPJ;
	private String nome, endereco, telefone;

	public Editora(String CNPJ, String nome, String endereco, String telefone) {
		this.CNPJ = CNPJ;
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
	}

	public String getCNPJ() {
		return CNPJ;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}

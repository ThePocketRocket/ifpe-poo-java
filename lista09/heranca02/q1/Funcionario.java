package lista09.heranca02.q1;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;

	public Funcionario(String nome, String cpf, double salario) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
	}
	
	public void exibeDados() {
		System.out.printf("""
				Nome: %s
				CPF: %s
				Salário: %2.2f
				""", nome, cpf, salario);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}

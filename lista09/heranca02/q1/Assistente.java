package lista09.heranca02.q1;

public class Assistente extends Funcionario {
	protected int numeroMatricula;
	
	public Assistente(String nome, String cpf, double salario, int numeroMatricula) {
		super(nome, cpf, salario);
		this.numeroMatricula = numeroMatricula;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}


	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public void exibeDados() {
		System.out.printf("""
				Nome: %s
				CPF: %s
				Salário: %2.2f
				Número de matrícula: $d
				""", nome, cpf, salario, numeroMatricula);
	}
	

}

package lista09.heranca02.q1;

public class AssistenteTecnico extends Assistente {
	private double bonus = 500;
	
	public AssistenteTecnico(String nome, String cpf, double salario, int numeroMatricula) {
		super(nome, cpf, salario, numeroMatricula);
	}
	
	@Override
	
	public void exibeDados() {
		System.out.printf("""
				Nome: %s
				CPF: %s
				Salário: %2.2f
				Número de matrícula: $d
				""", nome, cpf, salario + this.bonus, numeroMatricula);
	}
}

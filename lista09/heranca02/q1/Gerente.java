package lista09.heranca02.q1;

public class Gerente extends Funcionario {
	private String departamento;
	
	public Gerente(String nome, String cpf, double salario, String departamento) {
		super(nome, cpf, salario);
		
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}

}

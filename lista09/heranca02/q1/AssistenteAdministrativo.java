package lista09.heranca02.q1;

public class AssistenteAdministrativo extends Assistente {
	private String turno;
	private double adicionalNoturno;
	
	public AssistenteAdministrativo(String nome, String cpf, double salario, int numeroMatricula, String turno) {
		super(nome, cpf, salario, numeroMatricula);
		setTurno(turno);
		setAdicionalNoturno();
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void setAdicionalNoturno() {
		if (turno.equals("noite")) {
			this.adicionalNoturno = 600;
		}
	}
	
	@Override
	
	public void exibeDados() {
		System.out.printf("""
				Nome: %s
				CPF: %s
				Salário: %2.2f
				Número de matrícula: $d
				""", nome, cpf, salario + this.adicionalNoturno, numeroMatricula);
	}
}

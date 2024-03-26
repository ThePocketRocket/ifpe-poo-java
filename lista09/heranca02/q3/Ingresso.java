package lista09.heranca02.q3;

public class Ingresso {
	protected double valor;
	
	public Ingresso(double valor) {
		setValor(valor);
	}
	
	public void imprimeValor() {
		System.out.printf("O valor é: %2.2f", this.valor);
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}
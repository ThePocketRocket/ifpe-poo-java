package lista09.heranca02.q4;

public class Novo extends Imovel{
	private double adicional;
	
	public Novo(String endereco, double valor, double adicional) {
		super(endereco, valor);
		setAdicional(adicional);
	}
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public void imprimeAdicional() {
		System.out.printf("O adicional deste imóvel é: %2.2f", this.adicional);
	}
}
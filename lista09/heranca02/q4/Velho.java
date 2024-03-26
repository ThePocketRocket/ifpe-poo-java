package lista09.heranca02.q4;

public class Velho extends Imovel{
	private double desconto;
	
	public Velho(String endereco, double valor, double desconto) {
		super(endereco, valor);
		setDesconto(desconto);
	}
	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void imprimeDesconto() {
		System.out.printf("O desconto deste imóvel é: %2.2f", this.desconto);
	}
}
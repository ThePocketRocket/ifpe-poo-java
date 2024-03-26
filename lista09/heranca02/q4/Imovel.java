package lista09.heranca02.q4;

public class Imovel {
	protected String endereco;
	protected double adicional;

	public Imovel(String endereco, double valor) {
		setEndereco(endereco);
		setValor(valor);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValor() {
		return adicional;
	}

	public void setValor(double valor) {
		this.adicional = valor;
	}

}

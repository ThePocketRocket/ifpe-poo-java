package lista09.heranca02.q3;

public class Vip extends Ingresso{
	private double adicional;
	
	public Vip(double valor, double adicional) {
		super(valor);
		setAdicional(adicional);
	}

	public double getAdicional() {
		return super.valor + adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

}

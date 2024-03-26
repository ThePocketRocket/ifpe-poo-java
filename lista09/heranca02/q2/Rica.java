package lista09.heranca02.q2;

public class Rica extends Pessoa{
	private double dinheiro = 9999999;
	public Rica() {
		// TODO Auto-generated constructor stub
	}
	
	public void fazCompras() {
		System.out.println("$$$");
	}

	public double getDinheiro() {
		return dinheiro;
	}
}

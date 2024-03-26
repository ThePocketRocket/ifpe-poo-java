package lista09.heranca02.q3;

public class CamaroteSuperior extends Vip {
	private String localizacao = "Superior";
	
	public CamaroteSuperior(double valor, double adicional) {
		super(valor, adicional);
	}

	public void imprimeLocalizacao() {
		System.out.printf("Este ingresso pertence a área: %s", 
				this.localizacao);		
	}
}

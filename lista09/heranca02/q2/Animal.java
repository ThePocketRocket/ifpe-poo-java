package lista09.heranca02.q2;

public class Animal {
	protected String nome, raca;

	public Animal() {
	}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String caminha() {
		return "Caminhando...";
	}
}

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite quantas alturas deseja inserir: ");
		int quantidade = input.nextInt();

		double alturas = 0;
		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Digite a %d� altura: ", i+1);
			alturas += input.nextDouble();
		}
		
		System.out.printf("A m�dia das alturas � %2.2f", alturas / (double) quantidade);
	}
}

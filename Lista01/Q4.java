package lista01;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int contador = 0, idades = 0, buffer;
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Digite a idade: ");
			buffer = input.nextInt();
			idades += buffer;
			
			if (buffer <= 0) {
				break;
			} else {
				contador += 1;
			}
		}
		System.out.printf("A média de idades é igual a: %2.2f", (double) idades / (double) contador);
		input.close();
	}

}

package lista02;

import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		double numeros[] = new double[10], menor = 0, maior = 0, media = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d�: ", i+1);
			numeros[i] = input.nextDouble();
		}
		
		menor = numeros[0];
		maior = numeros[0];
		for (double i : numeros ) {
			if (i < menor) {
				menor = i;
			}
			if (i > maior) {
				maior = i;
			}
			media += i;
		}
		media /= 10;
		
		System.out.printf("O menor n�mero �: %2.2f\n"
				+ "O maior n�mero �: %2.2f\n"
				+ "A m�dia �: %2.2f\n", menor, maior, media);
		
		input.close();
	}
}

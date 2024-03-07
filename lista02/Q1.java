package lista02;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		double numeros[] = new double[10], soma = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº:\n", i+1);
			numeros[i] = input.nextDouble();
		}
		
		for (int i = 0; i < 10; i++) {
			soma += numeros[i];
		}
		
		System.out.printf("A soma é: %2.2f", soma);
		input.close();
	}
}

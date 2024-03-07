package lista02;

import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		double[] numeros = new double[10];
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			numeros[i] = input.nextDouble();
		}
		
		for (int i = 10; i > 0; i--) {
			System.out.println(numeros[i-1]);
		}
		input.close();
	}

}

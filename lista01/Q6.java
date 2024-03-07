package lista01;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		double pessoas[][];
		int num, imcAbaixo = 0, imcIdeal = 0, imcAcima = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas que deseja cadastrar: ");
		num = input.nextInt();
		pessoas = new double[num][2]; // Inicializa o array com um tamanho específico
		
		for (int i = 0; i < num; i++) {
			double imc = 0;
			System.out.print("Digite a altura (m): ");
			pessoas[i][0] = input.nextDouble();
			System.out.printf("Digite o peso (kg): ");
			pessoas[i][1] = input.nextDouble();
			imc = pessoas[i][1] / (pessoas[i][0] * pessoas[i][0]);
			if (imc < 18.5) {
				imcAbaixo += 1;
			} else if (imc >= 18.5 && imc < 25) {
				imcIdeal += 1;
			} else {
				imcAcima += 1;
			}
			
		}
		System.out.printf("O Número de pessoas que estão abaixo do peso (IMC < 18,5): %d\n", imcAbaixo);
		System.out.printf("O Número de pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC < 25): %d\n", imcIdeal);
		System.out.printf("O Número de pessoas que estão acima do peso (IMC > = 25): %d\n", imcAcima);
		input.close();
	}

}

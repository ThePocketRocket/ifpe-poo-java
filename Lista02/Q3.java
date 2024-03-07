package Lista02;

import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		double[][] notas = new double[10][4];
		int cMedia = 0;
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			for (int d = 0; d < 3; d++) {
				System.out.printf("Para o %dº aluno, digite a %dª nota: ", i+1, d+1);
				notas[i][d] = input.nextDouble();
			}
			notas[i][3] = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
		}
		
		for (int i = 0; i < 10; i++) {
			if (notas[i][3] >= 7) {
				cMedia++;
			}
		}
		
		System.out.printf("%d alunos atingiram a média.", cMedia);
		
		input.close();
	}

}

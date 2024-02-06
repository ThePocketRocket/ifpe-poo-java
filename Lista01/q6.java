import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		double pessoas[][];
		int num, imcAbaixo, imcIdeal;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas que deseja cadastrar: ");
		num = input.nextInt();
		pessoas = new double[num][2]; // Inicializa o array com um tamanho específico
		
		for (int i = 0; i < num; i++) {
			System.out.print("Digite a altura: ");
			pessoas[i][0] = input.nextDouble();
			System.out.printf("Digite o peso: ");
			pessoas[i][1] = input.nextDouble();
			pessoas[i][2] = pessoas[i][0] / (pessoas[i][1] * pessoas[i][1]);
			
		}
		
	}

}

package lista01;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		double n1, n2, resultado;
		int simbolo;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1 = input.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = input.nextDouble();
		
		System.out.println("Digite o índice do símbolo aritmético para executar a ação \n1: + \n2: - \n3: *\n4: /");
		simbolo = input.nextInt();
		
		switch (simbolo) {
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1 - n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			if (n2 > 0) {
				resultado = n1 / n2;
			} else {
				resultado = 0;
			}
			break;
		default:
			resultado = 0;
			System.out.println("Operação inválida!");
		}
		
		System.out.printf("O resultado é %2.2f", resultado);
		input.close();

	}

}

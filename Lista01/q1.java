import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Em que ano você nasceu? ");
		int nascimento = input.nextInt();
		
		System.out.print("Qual o ano atual? ");
		int anoAtual = input.nextInt();
		
		int idade = anoAtual - nascimento;
		
		if (idade < 0){
			System.out.println("Valores digitados são inválidos!");
		} else {
			System.out.printf("Sua idade é: %d", idade);
		}
	}
}

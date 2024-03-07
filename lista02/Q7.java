package lista02;

import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase;
		
		System.out.print("Digite uma frase: ");
		frase = input.nextLine();
		
		for (int i = (frase.length()-1); i > -1; i--) {
			System.out.print(frase.charAt(i));
		}
		input.close();
	}
}

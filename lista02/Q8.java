//Questão 08: Escreva um programa que conte o número de letras de uma frase informada pelo usuário.

package lista02;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;

        System.out.print("Digite uma frase: ");
        frase = input.nextLine();

        System.out.printf("A frase %s, possui %d letras.",frase, countLetters(frase));
    }

    public static boolean isLetter(char letter) {
        return ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'));
    }

    public static int countLetters(String phrase) {
        int counter = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (isLetter(phrase.charAt(i))) {
                counter++;
            }
        }

        return counter;
    }
}

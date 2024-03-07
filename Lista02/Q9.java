//Questão 09: Escreva um programa que leia uma palavra e mostre a quantidade de vogais da palavra.

package Lista02;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;

        System.out.print("Digite uma frase: ");
        frase = input.nextLine();

        System.out.printf("A frase %s, possui %d vogais.",frase, countVowels(frase));
        input.close();
    }

    public static boolean isVowels(char letter) {
        return (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
                || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');
    }

    public static int countVowels(String phrase) {
        int counter = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (isVowels(phrase.charAt(i))) {
                counter++;
            }
        }

        return counter;
    }
}

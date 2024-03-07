//Questão 01: Escreva um programa com um método que receba um número e determine se esse número é par ou ímpar.

package lista03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva o número que deseja verificar: ");
        int number = input.nextInt();

        if (isOdd(number)) {
            System.out.println("É impar!");
        } else {
            System.out.println("É par!");
        }

        input.close();
    }

    public static boolean isOdd (int number) {
        return number % 2 != 0;
    }
}

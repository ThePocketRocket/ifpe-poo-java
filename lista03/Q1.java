//Quest�o 01: Escreva um programa com um m�todo que receba um n�mero e determine se esse n�mero � par ou �mpar.

package lista03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva o n�mero que deseja verificar: ");
        int number = input.nextInt();

        if (isOdd(number)) {
            System.out.println("� impar!");
        } else {
            System.out.println("� par!");
        }

        input.close();
    }

    public static boolean isOdd (int number) {
        return number % 2 != 0;
    }
}

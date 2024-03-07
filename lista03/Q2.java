/* Questão 02: Escreva um programa que leia 02 números a operação aritmética desejada.
Se o usuário digitar:
1. Retornar a soma entre dois números;
2. Retornar a subtração entre dois números;
3. Retornar a multiplicação entre dois números;
4. Retornar a divisão entre dois números;
Obs.: Cada opção deve ser um método diferente.
*/

package lista03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2, result = 0;
        int choice;

        System.out.print("Digite o primeiro número: ");
        number1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        number2 = input.nextDouble();

        System.out.print("""
                1. Retornar a soma entre dois números;
                2. Retornar a subtração entre dois números;
                3. Retornar a multiplicação entre dois números;
                4. Retornar a divisão entre dois números;
                Escolha a operação:\s""");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                result = addition(number1, number2);
                break;
            case 2:
                result = subtraction(number1, number2);
                break;
            case 3:
                result = multiplication(number1, number2);
                break;
            case 4:
                if (number2 != 0) {
                    result = division(number1, number2);
                } else {
                    System.out.println("Não é possível fazer divisão por 0.");
                }
                break;
            default:
                System.out.println("Operação não permitida.");
                break;
        }
        System.out.printf("O resultado é: %2.2f", result);
        input.close();
    }

    public static double addition(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtraction(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    public static double division(double n1, double n2) {
        return n1 / n2;
    }
}

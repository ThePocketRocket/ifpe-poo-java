/* Quest�o 02: Escreva um programa que leia 02 n�meros a opera��o aritm�tica desejada.
Se o usu�rio digitar:
1. Retornar a soma entre dois n�meros;
2. Retornar a subtra��o entre dois n�meros;
3. Retornar a multiplica��o entre dois n�meros;
4. Retornar a divis�o entre dois n�meros;
Obs.: Cada op��o deve ser um m�todo diferente.
*/

package lista03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2, result = 0;
        int choice;

        System.out.print("Digite o primeiro n�mero: ");
        number1 = input.nextDouble();
        System.out.print("Digite o segundo n�mero: ");
        number2 = input.nextDouble();

        System.out.print("""
                1. Retornar a soma entre dois n�meros;
                2. Retornar a subtra��o entre dois n�meros;
                3. Retornar a multiplica��o entre dois n�meros;
                4. Retornar a divis�o entre dois n�meros;
                Escolha a opera��o:\s""");
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
                    System.out.println("N�o � poss�vel fazer divis�o por 0.");
                }
                break;
            default:
                System.out.println("Opera��o n�o permitida.");
                break;
        }
        System.out.printf("O resultado �: %2.2f", result);
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

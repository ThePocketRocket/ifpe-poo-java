/*
Questão 05: Escreva um programa com métodos para calcular a área (b x h) e o
perímetro de um retângulo (2b + 2h). Forneça as seguintes opções ao usuário:
1. Calcular a área do retângulo
2. Calcular o perímetro do retângulo
*/

package Lista03;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height, result;
        int choice;

        System.out.print("Digite o tamanho da base do seu retângulo (m): ");
        base = input.nextDouble();

        System.out.print("Digite o tamanho da altura do seu retângulo (m): ");
        height = input.nextDouble();

        System.out.print("""
                1. Calcular a área do retângulo
                2. Calcular o perímetro do retângulo
                Digite a operação que deseja fazer:\s""");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                result = calculateArea(base, height);
                System.out.printf("A área tem: %2.2f m²", result);
                break;
            case 2:
                result = calculatePerimeter(base, height);
                System.out.printf("O perímetro tem: %2.2f m", result);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        input.close();
    }

    public static double calculateArea(double base, double height){
        return base * height;
    }

    public static double calculatePerimeter(double base, double height){
        return (2*base) + (2*height);
    }
}

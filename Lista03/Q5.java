/*
Quest�o 05: Escreva um programa com m�todos para calcular a �rea (b x h) e o
per�metro de um ret�ngulo (2b + 2h). Forne�a as seguintes op��es ao usu�rio:
1. Calcular a �rea do ret�ngulo
2. Calcular o per�metro do ret�ngulo
*/

package Lista03;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height, result;
        int choice;

        System.out.print("Digite o tamanho da base do seu ret�ngulo (m): ");
        base = input.nextDouble();

        System.out.print("Digite o tamanho da altura do seu ret�ngulo (m): ");
        height = input.nextDouble();

        System.out.print("""
                1. Calcular a �rea do ret�ngulo
                2. Calcular o per�metro do ret�ngulo
                Digite a opera��o que deseja fazer:\s""");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                result = calculateArea(base, height);
                System.out.printf("A �rea tem: %2.2f m�", result);
                break;
            case 2:
                result = calculatePerimeter(base, height);
                System.out.printf("O per�metro tem: %2.2f m", result);
                break;
            default:
                System.out.println("Op��o inv�lida.");
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

/*
Quest�o 06: Escreva um programa com m�todos que fa�am a convers�o de Fahrenheit
para Celsius (C = 5(F - 32) / 9) e de Kelvin para Celsius (C = (K - 273)). Forne�a as
seguintes op��es ao usu�rio:
1. Transformar de Fahrenheit para Celsius
2. Transformar de Kelvin para Celsius
 */

package lista03;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature;
        int choice;

        System.out.print("Digite a temperatura: ");
        temperature = input.nextDouble();

        System.out.print("""
                1. Transformar de Fahrenheit para Celsius
                2. Transformar de Kelvin para Celsius
                Digite a op��o:\s""");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.printf("A temperatura %2.2f �F, corresponde a %2.2f �C.", temperature, fahrenheitToCelsius(temperature));
                break;
            case 2:
                System.out.printf("A temperatura %2.2f K, corresponde a %2.2f �C.", temperature, kelvinToCelsius(temperature));
                break;
            default:
                System.out.println("Op��o inv�lida!");
                break;
        }

        input.close();
    }

    public static double fahrenheitToCelsius(double temperature) {
        return 5* (temperature - 32) / 9;
    }

    public static double kelvinToCelsius(double temperature) {
        return temperature - 273;
    }
}

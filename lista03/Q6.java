/*
Questão 06: Escreva um programa com métodos que façam a conversão de Fahrenheit
para Celsius (C = 5(F - 32) / 9) e de Kelvin para Celsius (C = (K - 273)). Forneça as
seguintes opções ao usuário:
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
                Digite a opção:\s""");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.printf("A temperatura %2.2f ºF, corresponde a %2.2f ºC.", temperature, fahrenheitToCelsius(temperature));
                break;
            case 2:
                System.out.printf("A temperatura %2.2f K, corresponde a %2.2f ºC.", temperature, kelvinToCelsius(temperature));
                break;
            default:
                System.out.println("Opção inválida!");
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

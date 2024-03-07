/*
Questão 07: Escreva um programa com um método que receba um vetor como
parâmetro e calcule a média dos valores contidos no vetor. Obs.: O tamanho do vetor
deve ser informado pelo usuário.
 */

package lista03;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values;
        int arraySize;

        System.out.print("Digite o tamanho do vetor: ");
        arraySize = input.nextInt();
        values = new double[arraySize]; // Poderia ser colocado double[input.nextInt()]

        for (int i = 0; i < arraySize; i++) {
            System.out.printf("Digite o %dº valor do vetor: ", i+1);
            values[i] = input.nextInt();
        }

        System.out.printf("A média dos valores do vetor %s é %2.2f.", Arrays.toString(values), averageOfValues(values));

        input.close();
    }

    public static double averageOfValues(double[] array) {
        int arraySize = array.length;
        double average = 0;

        for (double i : array) {
            average += i;
        }
        return average / arraySize;
    }
}

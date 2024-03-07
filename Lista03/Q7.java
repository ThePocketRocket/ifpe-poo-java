/*
Quest�o 07: Escreva um programa com um m�todo que receba um vetor como
par�metro e calcule a m�dia dos valores contidos no vetor. Obs.: O tamanho do vetor
deve ser informado pelo usu�rio.
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
            System.out.printf("Digite o %d� valor do vetor: ", i+1);
            values[i] = input.nextInt();
        }

        System.out.printf("A m�dia dos valores do vetor %s � %2.2f.", Arrays.toString(values), averageOfValues(values));

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

/*
Quest�o 04: Escreva um programa com um m�todo que receba o sal�rio de um
funcion�rio e calcule o imposto que ele deve pagar. Utilize os seguintes valores para
calcular o imposto:
� At� R$ 2.000,00 � Isento de imposto
� De R$ 2.000,01 at� R$ 3.500,00 � 15% de imposto
� De R$ 3.500,01 at� R$ 5.000,00 � 22% de imposto
� Acima de R$ 5.000,01 � 30% de imposto
*/

package lista03;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary, tax;

        System.out.print("Digite o valor do sal�rio: ");
        salary = input.nextDouble();
        tax = calculateTax(salary);

        System.out.printf("""
                O sal�rio � de: R$ %2.2f
                O imposto � de: R$ %2.2f
                O sal�rio l�quido � de: R$ %2.2f""", salary, tax, salary - tax);
        input.close();
    }

    public static double calculateTax(double salary) {
        if (salary <= 2000) {
            return 0;
        } else if (salary <= 3500) {
            return salary * 0.12;
        } else if (salary <= 5000) {
            return salary * 0.22;
        } else {
            return salary * 0.3;
        }
    }
}

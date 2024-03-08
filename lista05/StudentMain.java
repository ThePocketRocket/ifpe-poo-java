/*
1. Criar um Estudante
2. Calcular M�dia (Se o Aluno foi Aprovado, informe ao usu�rio)
3. Obter n�mero de matricula
4. Obter Endere�o
0. Sair
 */

package lista05;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = null;
        int choice;

        boolean exit = false;
        while (!exit) {
            System.out.print("""
                1. Criar um Estudante
                2. Calcular M�dia
                3. Obter n�mero de matricula
                4. Obter Endere�o
                0. Sair
                Digite sua escolha:\s""");
            choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1:
                    String name, matriculationId, address;
                    double[] grades = new double[4];

                    System.out.print("Digite o nome do aluno: ");
                    name = input.nextLine();
                    System.out.print("Digite a matr�cula do aluno: ");
                    matriculationId = input.nextLine();
                    System.out.print("Digite o endere�o do aluno: ");
                    address = input.nextLine();

                    double gradesLength = grades.length;
                    for (int index = 0; index < gradesLength; index++) {
                        System.out.printf("Digite a %d� nota: ", index + 1);
                        grades[index] = input.nextDouble();
                        input.nextLine();
                    }

                    student = new Student(name, matriculationId, address, grades);
                    break;

                case 2:
                    if (student != null) {
                        System.out.printf("A m�dia do aluno %s �: %2.2f\n\n", student.getName(), student.calculateAverage(student.getGrades()));
                    } else {
                        System.out.println("Crie um estudante.\n");
                    }
                    break;

                case 3:
                    if (student != null) {
                        System.out.printf("A matr�cula de %s �: %s\n\n", student.getName(), student.getMatriculationId());
                    } else {
                        System.out.println("Crie um estudante.\n");
                    }
                    break;

                case 4:
                    if (student != null) {
                        System.out.printf("O endere�o de %s �: %s\n\n", student.getName(), student.getAddress());
                    } else {
                        System.out.println("Crie um estudante.\n");
                    }
                    break;

                case 0:
                    exit = true;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Valor inv�lido.\n");
            }

        }

    }
}

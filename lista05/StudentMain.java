/*
1. Criar um Estudante
2. Calcular Média (Se o Aluno foi Aprovado, informe ao usuário)
3. Obter número de matricula
4. Obter Endereço
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
                2. Calcular Média
                3. Obter número de matricula
                4. Obter Endereço
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
                    System.out.print("Digite a matrícula do aluno: ");
                    matriculationId = input.nextLine();
                    System.out.print("Digite o endereço do aluno: ");
                    address = input.nextLine();

                    double gradesLength = grades.length;
                    for (int index = 0; index < gradesLength; index++) {
                        System.out.printf("Digite a %dª nota: ", index + 1);
                        grades[index] = input.nextDouble();
                        input.nextLine();
                    }

                    student = new Student(name, matriculationId, address, grades);
                    break;

                case 2:
                    if (student != null) {
                        System.out.printf("A média do aluno %s é: %2.2f\n\n", student.getName(), student.calculateAverage(student.getGrades()));
                    } else {
                        System.out.println("Crie um estudante.\n");
                    }
                    break;

                case 3:
                    if (student != null) {
                        System.out.printf("A matrícula de %s é: %s\n\n", student.getName(), student.getMatriculationId());
                    } else {
                        System.out.println("Crie um estudante.\n");
                    }
                    break;

                case 4:
                    if (student != null) {
                        System.out.printf("O endereço de %s é: %s\n\n", student.getName(), student.getAddress());
                    } else {
                        System.out.println("Crie um estudante.\n");
                    }
                    break;

                case 0:
                    exit = true;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Valor inválido.\n");
            }

        }

    }
}

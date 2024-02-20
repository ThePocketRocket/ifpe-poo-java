package Lista02;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroDeCadastros = 0, cNome = 0;
        String nome;

        System.out.print("Digite a quantidade de nomes que deseja cadastrar: ");
        numeroDeCadastros = input.nextInt();
        String[] nomes = new String[numeroDeCadastros];

        for (int i = 0; i < numeroDeCadastros; i++) {
            System.out.printf("Digite o %dº nome: ", i+1);
            nomes[i] = input.next();
        }

        System.out.print("Digite o nome que deseja procurar: ");
        nome = input.next();
        for (String n : nomes) {
            if (n.equals(nome)) {
                cNome++;
            }
        }

        if (cNome > 1) {
            System.out.printf("O nome: %s foi encontrado %d vezes.", nome, cNome);
        } else {
            System.out.printf("O nome: %s foi encontrado %d vez.", nome, cNome);
        }
        input.close();
    }
}

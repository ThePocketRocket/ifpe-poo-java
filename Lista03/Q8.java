/*
 * Questão 08: Escreva um programa que leia a idade e o nome de 10 pessoas. Escreva
métodos para:
• Retornar o nome da pessoa mais velha;
• Retornar o nome da pessoa mais nova;
• O numero de pessoas com mais de 18 anos
 */

package lista03;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] persons = new String[3][2];
		
		for (int i = 0; i < persons.length; i++) {
			System.out.printf("Digite o nome da %dª pessoa: ", i+1);
			persons[i][0] = input.nextLine();
			System.out.printf("Digite a idade da %dª pessoa: ", i+1);
			persons[i][1] = input.nextLine();
		}
		
		boolean exit = true;
		while(exit) {
			int choice;
			System.out.print("""
					1 - Retornar o nome da pessoa mais velha;
					2 - Retornar o nome da pessoa mais nova;
					3 - O numero de pessoas com mais de 18 anos;
					
					0 - Sair.
					
					Digite sua ecolha: """);
			choice = input.nextInt();
			
			switch(choice) {
				case 0:
					exit = false;
					break;
				case 1:
					System.out.printf("A pessoa mais velha é: %s\n\n", returnNameOlderPerson(persons));
					break;
				case 2:
					System.out.printf("A pessoa mais nova é: %s\n\n", returnNameYoungerPerson(persons));
					break;
				case 3:
					System.out.printf("A quantidade de pessoas com 18 ou mais é: %d\n\n", returnAdultIndividuals(persons));
					break;
				default:
					System.out.println("Escolha incorreta.\n");
					break;
			}
		}
		input.close();
	}
	
	public static String returnNameOlderPerson(String[][] persons) {
		String olderPerson = persons[0][0];
		double age = Double.parseDouble(persons[0][1]);
		
		for (int i = 0; i < persons.length; i++) {
			if (Double.parseDouble(persons[i][1]) > age) {
				olderPerson = persons[i][0];
			}
		}
		return olderPerson;
	}
	
	public static String returnNameYoungerPerson(String[][] persons) {
		String olderPerson = persons[0][0];
		double age = Double.parseDouble(persons[0][1]);
		
		for (int i = 0; i < persons.length; i++) {
			if (Double.parseDouble(persons[i][1]) < age) {
				olderPerson = persons[i][0];
			}
		}
		return olderPerson;
	}
	
	public static int returnAdultIndividuals(String[][] persons) {
		int adultCount = 0;
		for (int i = 0; i < persons.length; i++) {
			if (Double.parseDouble(persons[i][1]) >= 18) {
				adultCount++;
			}
		}
		return adultCount;
	}
			

}

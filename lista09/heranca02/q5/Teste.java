package lista09.heranca02.q5;

import java.util.Scanner;

import lista09.heranca02.q1.AssistenteAdministrativo;
import lista09.heranca02.q1.AssistenteTecnico;
import lista09.heranca02.q2.Cachorro;
import lista09.heranca02.q2.Gato;
import lista09.heranca02.q2.Miseravel;
import lista09.heranca02.q2.Pobre;
import lista09.heranca02.q2.Rica;
import lista09.heranca02.q3.Normal;

public class Teste {
	public static void main(String[] args) {
		var input = new Scanner(System.in);
		
		// Assistentes Administrativo / Técnico
		var assistenteAdministrativo = new AssistenteAdministrativo(
				"Daniel Ferreira", "08156939499", 4500, 1001, "Noite".toLowerCase());
		var assistenteTecnico = new AssistenteTecnico(
				"Izabelle Sabrina", "19156635482", 5000, 1002);
		System.out.printf("""
				Assistente Administrativo: %s
				Número de matrícula: %d
				
				Assitente Técnico: %s
				Número de matrícula: %d
				""", 
				assistenteAdministrativo.getNome(), assistenteAdministrativo.getNumeroMatricula(),
				assistenteTecnico.getNome(), assistenteTecnico.getNumeroMatricula());
		
		// Animais
		var cachorro = new Cachorro();
		var gato = new Gato();
		System.out.printf("""
				Cachorro: %s
				Gato: %s
				""", cachorro.caminha(), gato.caminha());
		
		// Pessoas
		var rico = new Rica();
		var pobre = new Pobre();
		var miseravel = new Miseravel();
		System.out.print("O rico gasta: ");
		rico.fazCompras();
		System.out.print("O pobre trabalha: ");
		pobre.trabalha();
		System.out.println("O miserável mendiga: ");
		miseravel.mendiga();
		
		// Ingressos
		System.out.print("""
				1 - Normal
				2 - VIP
				Digite o tipo de ingresso que deseja: 
				""");
		int tipo = input.nextInt();
		if (tipo == 1) {
			var ingresso = new Normal(1);
		}
	}

}

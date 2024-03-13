package lista08.q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<Livro>();
		
		
		input.close();
	}
	
	public static Livro criarLivro() {
		Scanner input = new Scanner(System.in);
		Livro livro;
		Autor autor = criarAutor();
		Editora editora = criarEditora();
		String ISBN, titulo, anoDeEdicao;
		
		System.out.print("Digite o ISBN do livro: ");
		ISBN = input.nextLine();
		
		System.out.print("Digite o titulo do livro: ");
		titulo = input.nextLine();
		
		System.out.print("Digite o ano de edição do livro: ");
		anoDeEdicao = input.nextLine();
		
		livro = new Livro(autor, editora, ISBN, titulo, anoDeEdicao);
		
		input.close();
		return livro;
		
	}
	
	public static Autor criarAutor() {
		Scanner input = new Scanner(System.in);
		Autor autor;
		String CPF, nome, endereco;
		
		System.out.print("Digite o CPF do autor: ");
		CPF = input.nextLine();
		
		System.out.print("Digite o nome do autor: ");
		nome = input.nextLine();
		
		System.out.print("Digite o endereco do autor: ");
		endereco = input.nextLine();
		
		autor = new Autor(CPF, nome, endereco);
		
		input.close();
		return autor;
	}

	public static Editora criarEditora() {
		Scanner input = new Scanner(System.in);
		Editora editora;
		String CNPJ, nome, endereco, telefone;
		
		System.out.print("Digite o CNPJ da empresa: ");
		CNPJ = input.nextLine();
		
		System.out.print("Digite o nome da empresa: ");
		nome = input.nextLine();
		
		System.out.print("Digite o endereco da empresa: ");
		endereco = input.nextLine();
		
		System.out.print("Digite o telefone da empresa: ");
		telefone = input.nextLine();
		
		editora = new Editora(CNPJ, nome, endereco, telefone);
		
		input.close();
		return editora;
	}
}


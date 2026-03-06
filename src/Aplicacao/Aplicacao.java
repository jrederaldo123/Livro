package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Livro;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Configurando numeros fracionarios
		Locale.setDefault(Locale.US);
		
		// Configurando entrada para o usuário
		Scanner sc = new Scanner(System.in);
		
		
		String titulo;
		String autor;
		String isbn ;
		int ano;
		String disponivel;
		
		System.out.println("=============== Cadastro de Livros ======================");
		
		System.out.println();
		System.out.print("Entre com o título do livro: ");
		titulo = sc.nextLine();
		System.out.println();
		
		System.out.print("Entre com o autor do livro: ");
		autor = sc.nextLine();
		System.out.println();
		
		System.out.print("Entre com o ISBN do livro: ");
		isbn = sc.nextLine();
		System.out.println();
		
		System.out.print("Entre com o ano do livro: ");
		ano = sc.nextInt();
		System.out.println();
		
		System.out.print("Livro disponível: <true> ou <false>?");
		disponivel = sc.nextLine();
		System.out.println();
		
		Livro livro = new Livro(titulo, autor, isbn, ano, disponivel);
		
		int opcao = 0;

		while (opcao != 4) {
			System.out.println("\n========= MENU ================");
			System.out.println("1 - Mostra dados do livro");
			System.out.println("2 - Emprestar livro");
			System.out.println("3 - Devolver livro");
			System.out.println("4 - Sair");
			System.out.println("Escolha: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println(livro);
				break;
				
			case 2:
				livro.emprestar();
				System.out.println("Livro emprestado!");
				break;
				
			case 3:
				livro.devolver();
				System.out.println("Livro devolvido!");
				break;
				
			case 4:
				System.out.println("Encerrando o Sistema...");
				break;
				
			default:
				System.out.println("Opção inválida.");
				break;
				
			}
		}
		sc.close();

	}

}

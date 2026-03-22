package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escolha o formato de construção:");
		System.out.println("1 - Digite seu nome e sua idade");
		System.out.println("2 - Digite sua idade");
		System.out.println("Opção: ");
		
		int opcao;
		opcao = teclado.nextInt();
		teclado.nextLine();
		
		if(opcao == 1) {
			System.out.println("Digite seu nome: ");
			String nome = teclado.nextLine();
			System.out.println("Digite sua idade: ");
			int idade = teclado.nextInt();
			new Pessoa(nome, idade);
		} else if (opcao == 2) {
			System.out.println("Digite sua idade: ");
			int idade = teclado.nextInt();
			new Pessoa(idade);
		} else {
			System.out.println("Opção inválida!");
		}
		
		teclado.close();
	}

}

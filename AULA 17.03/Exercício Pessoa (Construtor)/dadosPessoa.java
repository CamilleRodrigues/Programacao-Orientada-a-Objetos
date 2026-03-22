package pkg;

import java.util.Scanner;

public class dadosPessoa {

	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		String nome = teclado.nextLine();
		System.out.println("Digite a idade da pessoa: ");
		int idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o gênero da pessoa: ");
		String genero = teclado.nextLine();
		new Carro(nome, idade, genero);
		
		teclado.close();
	}

}

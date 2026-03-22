package pkg;

import java.util.Scanner;

public class dadosLivro {

	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o título do livro: ");
		String título = teclado.nextLine();
		System.out.println("Digite o autor do livro: ");
		String autor = teclado.nextLine();
		System.out.println("Digite o ano de publicação do livro: ");
		int anoPublicacao = teclado.nextInt();
		new Livro(título, autor, anoPublicacao);
		
		teclado.close();
	}

}

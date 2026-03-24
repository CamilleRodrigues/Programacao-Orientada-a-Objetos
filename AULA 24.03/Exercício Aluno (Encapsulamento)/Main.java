package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = teclado.nextInt();
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = teclado.nextInt();
		Aluno aluno = new Aluno(nome, nota1, nota2);
		
		double media = aluno.calculaMedia();
		System.out.println("A média do aluno(a) " + nome + " é: " + media);
		
		teclado.close();
	}

}

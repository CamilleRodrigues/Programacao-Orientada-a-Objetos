package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int n = 3;
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite o nome do aluno " + (i+1) + ": ");
			String nome = teclado.nextLine();
			System.out.println("Digite a matricula do aluno " + (i+1) + ": ");
			int matricula = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Digite a data de nascimento do aluno " + (i+1) + ": ");
			String dataNascimento = teclado.nextLine();
			System.out.println("Digite o ano de ingresso do aluno " + (i+1) + ": ");
			int anoIngresso = teclado.nextInt();
			teclado.nextLine();
			
			if(i == 0) {
				new Aluno(nome, matricula);
			} else if (i == 1) {
				new Aluno(dataNascimento);
			} else if (i == 2) {
				new Aluno(nome, dataNascimento, anoIngresso);
			}
		}
		
		teclado.close();

	}

}

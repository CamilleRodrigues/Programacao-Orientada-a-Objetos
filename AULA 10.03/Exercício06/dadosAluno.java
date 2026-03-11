package pkg;

import java.util.Scanner;

public class dadosAluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Aluno a1 = new Aluno();
		System.out.println("Digite o nome de um aluno: ");
		a1.nome = teclado.nextLine();
		System.out.println("Digite a matricula desse: ");
		a1.matricula = teclado.nextInt();
		System.out.println("Digite a primeira nota: ");
		a1.nota1 = teclado.nextFloat();
		System.out.println("Digite a segunda nota: ");
		a1.nota2 = teclado.nextFloat();
		System.out.println("Digite a terceira nota: ");
		a1.nota3 = teclado.nextFloat();
		
		float mediaNotas;
		mediaNotas = (a1.nota1 + a1.nota2 + a1.nota3) / 3;
		
		System.out.println("\nNome do aluno: " + a1.nome);
		System.out.println("Matrícula do aluno: " + a1.matricula);
		System.out.println("Nota 1: " + a1.nota1);
		System.out.println("Nota 2: " + a1.nota2);
		System.out.println("Nota 3: " + a1.nota3);
		System.out.println("A media do aluno é: " + mediaNotas);
		
		if(mediaNotas >= 6) {
			System.out.println("O aluno foi aprovado!");
		} else {
			System.out.println("O aluno foi reprovado!");
		}
		
		teclado.close();

	}

}

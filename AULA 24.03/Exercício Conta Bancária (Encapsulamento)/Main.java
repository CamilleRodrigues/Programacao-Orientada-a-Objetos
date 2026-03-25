package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o saldo inicial da conta: ");
		double saldo = teclado.nextDouble();
		System.out.println("Digite o limite da conta: ");
		double limite = teclado.nextDouble();
		ContaBancaria conta = new ContaBancaria(saldo, limite);
		 
		System.out.println("Digite o valor que será sacado da conta: ");
		double valor = teclado.nextDouble();
		conta.sacar(valor);
		
		teclado.close();
	}

}

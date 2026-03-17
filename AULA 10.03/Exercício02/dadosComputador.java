package pkg;

import java.util.Scanner;

public class VendaComputador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Computador c1 = new Computador();
		System.out.println("Digite a marca do computador 1: ");
		c1.marca = teclado.nextLine();
		System.out.println("Digite o modelo do computador 1: ");
		c1.modelo = teclado.nextLine();
		System.out.println("Digite o tipo do computador 1: ");
		c1.tipo = teclado.nextLine();
		System.out.println("Digite o preço do computador 1: ");
		c1.preco = teclado.nextInt();
		
		Computador c2 = new Computador();
		c2.marca = "Dell";
		c2.modelo = "Inspirion 15";
		c2.tipo = "Notebook";
		c2.preco = 4999;

		System.out.println("\nA marca do computador 1 é: " + c1.marca);
		System.out.println("O modelo do computador 1 é: " + c1.modelo);
		System.out.println("O tipo do computador 1 é: " + c1.tipo);
		System.out.println("O preço do computador 1 é: " + c1.preco);
		System.out.println("\nA marca do computador 2 é: " + c2.marca);
		System.out.println("O modelo do computador 2 é: " + c2.modelo);
		System.out.println("O tipo do computador 2 é: " + c2.tipo);
		System.out.println("O preço do computador 2 é: " + c2.preco);
		
		teclado.close();
	}

}

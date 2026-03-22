package pkg;

import java.util.Scanner;

public class dadosCarro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Carro c1 = new Carro();
		System.out.println("Digite a marca do carro 1: ");
		c1.marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro 1: ");
		c1.modelo = teclado.nextLine();
		System.out.println("Digite o ano de fabricação do carro 1: ");
		c1.anoFabricacao = teclado.nextInt();
		
		teclado.nextLine();
		
		Carro c2 = new Carro();
		System.out.println("Digite a marca do carro 2: ");
		c2.marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro 2: ");
		c2.modelo = teclado.nextLine();
		System.out.println("Digite o ano de fabricação do carro 2: ");
		c2.anoFabricacao = teclado.nextInt();
		
		System.out.println("\nA marca do carro 1 é: " + c1.marca);
		System.out.println("O modelo do carro 1 é: " + c1.modelo);
		System.out.println("O ano de fabricação do carro 1 é: " + c1.anoFabricacao);
		System.out.println("\nA marca do carro 2 é: " + c2.marca);
		System.out.println("O modelo do carro 2 é: " + c2.modelo);
		System.out.println("O ano de fabricação do carro 2 é: " + c2.anoFabricacao);
		
		teclado.close();
	}

}

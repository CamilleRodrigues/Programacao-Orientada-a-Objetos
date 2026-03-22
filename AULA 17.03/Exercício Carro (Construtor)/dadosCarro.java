package pkg;

import java.util.Scanner;

public class dadosCarro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite a marca do carro " + (i+1) + ": ");
			String marca = teclado.nextLine();
			System.out.println("Digite o modelo do carro " + (i+1) + ": ");
			String modelo = teclado.nextLine();
			System.out.println("Digite o ano de fabricação do carro " + (i+1) + ": ");
			int anoFabricacao = teclado.nextInt();
			teclado.nextLine();
			
			new Carro(marca, modelo, anoFabricacao);
		}
		
		teclado.close();

	}

}

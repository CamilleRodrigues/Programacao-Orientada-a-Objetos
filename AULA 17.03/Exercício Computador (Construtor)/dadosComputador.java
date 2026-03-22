package pkg;

import java.util.Scanner;

public class dadosComputador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a marca do computador: ");
		String marca = teclado.nextLine();
		System.out.println("Digite o modelo do computador: ");
		String modelo = teclado.nextLine();
		System.out.println("Digite o tipo do computador: ");
		String tipo = teclado.nextLine();
		System.out.println("Digite o preço do computador: ");
		float preco = teclado.nextInt();
		new Carro(marca, modelo, tipo, preco);
		
		marca = "Dell";
		modelo = "Inspirion 15";
		tipo = "Notebook";
		preco = 4999;
		new Carro(marca, modelo, tipo, preco);
		
		teclado.close();
	}

}

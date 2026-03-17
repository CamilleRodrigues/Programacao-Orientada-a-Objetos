// Fluxo do programa:
//	- Criar uma variável n -> coleta o número de carros que serão produzidos;
//	- Criar um vetor de objetos;
//	- Criar um laço para criar os objetos;
//	- Instanciar cada objeto;
//	- Exibir os dados;

package pkg;

import java.util.Scanner;
import java.util.ArrayList;

public class dadosCarro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int n;
		System.out.println("Digite a quantidade de carro: ");
		n = teclado.nextInt();
		
		teclado.nextLine();
		
		Carro[] carro = new Carro[n];
		
		for(int i = 0; i < n; i++) {
			carro[i] = new Carro();
			System.out.println("Digite a marca do carro " + (i+1) + ": ");
			carro[i].marca = teclado.nextLine();
			System.out.println("Digite o modelo do carro " + (i+1) + ": ");
			carro[i].modelo = teclado.nextLine();
			System.out.println("Digite o ano de fabricação do carro " + (i+1) + ": ");
			carro[i].anoFabricacao = teclado.nextInt();
			teclado.nextLine();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("\nA marca do carro é: " + carro[i].marca);
			System.out.println("O modelo do carro é: " + carro[i].modelo);
			System.out.println("O ano de fabricação do carro é: " + carro[i].anoFabricacao);
		}

  
	}

}


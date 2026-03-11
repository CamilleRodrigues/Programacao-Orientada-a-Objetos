package pkg;

import java.util.Scanner;

public class dadosProduto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Produto p1 = new Produto();
		System.out.println("Digite o nome de um produto: ");
		p1.nome = teclado.nextLine();
		System.out.println("Digite o preço desse produto: ");
		p1.preco = teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Digite a quantidade em estoque desse produto: ");
		p1.qtdEmEstoque = teclado.nextInt();
		
		float valorTotalEstoque;
		valorTotalEstoque = p1.preco * p1.qtdEmEstoque;
		
		System.out.println("\nNome do produto: " + p1.nome);
		System.out.println("Preço do produto: " + p1.preco);
		System.out.println("Quantidade em estoque: " + p1.qtdEmEstoque);
		System.out.println("Valor total em estoque: " + valorTotalEstoque);
		
		teclado.close();
	}

}

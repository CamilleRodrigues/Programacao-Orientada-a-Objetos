package pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de produtos em estoque: ");
        int quantidadeEmEstoque = teclado.nextInt();
        
        Produto produto = new Produto(quantidadeEmEstoque);
        
        System.out.println("A quantidade de produtos que vai ser adicionada ao estoque é: ");
        int qtdAdicionar = teclado.nextInt();
        produto.adicionarEstoque(qtdAdicionar);
        System.out.println("A quantidade de produtos que vai ser removida do estoque é: ");
        int qtdRemover = teclado.nextInt();
        produto.removerEstoque(qtdRemover);
        teclado.close();
        
    }
}

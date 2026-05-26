import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Produto> carrinho = new ArrayList<>();

        System.out.print("Quantos produtos deseja adicionar na lista? ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("\nTipo do produto:");
            System.out.println("1 - Produto Físico");
            System.out.println("2 - Produto Digital");
            System.out.print("\nQual o tipo do produto? ");
            int tipo = teclado.nextInt();
            teclado.nextLine();

            System.out.print("\nNome do produto: ");
            String nome = teclado.nextLine();

            System.out.print("Preço do produto: ");
            double preco = teclado.nextDouble();

            System.out.print("Avaliação do produto: ");
            int nota = teclado.nextInt();

            try {
                Produto produto;
                if (tipo == 1) {
                    produto = new ProdutoFisico(nome, preco);
                } else {
                    produto = new ProdutoDigital(nome, preco);
                }
                ((Avaliavel) produto).adicionarAvaliacao(nota);
                carrinho.add(produto);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (NotaInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }

        double total = 0;

        for (Produto produto : carrinho) {
            double frete = produto.calcularFrete();
            double soma = produto.getPreco() + frete;

            total = total + soma;

            System.out.println("\nProduto: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());
            System.out.println("Frete: R$ " + frete);
            System.out.println("Preço + Frete: R$ " + soma);
            System.out.println();
        }

        System.out.println("Total da compra = R$ " + total);

        teclado.close();
    }
}

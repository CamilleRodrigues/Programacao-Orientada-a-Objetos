import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

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

            System.out.print("Nome do produto: ");
            String nome = teclado.nextLine();

            Produto produto = null;

            // While para validar o preço
            boolean precoValido = false;

            while (!precoValido) {
                try {
                    System.out.print("Preço do produto: ");
                    double preco = teclado.nextDouble();
                    teclado.nextLine();

                    if (tipo == 1) {
                        produto = new ProdutoFisico(nome, preco);
                    } else {
                        produto = new ProdutoDigital(nome, preco);
                    }

                    precoValido = true;

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            // While para validar a nota de avaliação
            boolean notaValida = false;

            while (!notaValida) {
                try {
                    System.out.print("Avaliação do produto: ");
                    int nota = teclado.nextInt();
                    teclado.nextLine();

                    ((Avaliavel) produto).adicionarAvaliacao(nota);

                    notaValida = true;

                } catch (NotaInvalidaException e) {
                    System.out.println(e.getMessage());
                }
            }
            carrinho.add(produto);
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
        }

        System.out.println("\nO total da compra foi de R$" + total + " reais");

        teclado.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\nMENU");
            System.out.println("1 - Eletrônico");
            System.out.println("2 - Vestuário");
            System.out.println("3 - Alimento");
            System.out.println("0 - Finalizar");
            System.out.print("Escolha: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            // Só pede os dados se não for sair
            if (opcao >= 1 && opcao <= 3) {

                System.out.print("Descrição do produto: ");
                String descricao = teclado.nextLine();

                System.out.print("Valor do produto: ");
                double valor = teclado.nextDouble();
                teclado.nextLine();

                Produto produto;

                switch (opcao) {

                    case 1:
                        produto = new Eletronico(descricao, valor);
                        produtos.add(produto);
                        break;

                    case 2:
                        produto = new Vestuario(descricao, valor);
                        produtos.add(produto);
                        break;

                    case 3:
                        produto = new Alimento(descricao, valor);
                        produtos.add(produto);
                        break;
                }

                System.out.println("Produto cadastrado!");
            }

            else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        double totalImpostos = 0;

        System.out.println("\n===== IMPOSTOS =====");

        for (Produto p : produtos) {

            // Apenas produtos tributáveis
            if (p instanceof Eletronico || p instanceof Vestuario) {

                double imposto = p.calcularImposto() - p.getValorOriginal();

                totalImpostos += imposto;

                System.out.println("Produto: " + p.getDescricao());
                System.out.println("Imposto: R$ " + imposto);
                System.out.println();
            }
        }

        System.out.println("Total de impostos: R$ " + totalImpostos);

        teclado.close();
    }
}

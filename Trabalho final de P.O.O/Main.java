import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Lista que armazenará todas as atletas cadastradas.
        ArrayList<Atleta> atletas = new ArrayList<>();

        int opcao = -1;
        while (opcao != 0) {
            try {
                System.out.println("\nSISTEMA DE ACOMPANHAMENTO FÍSICO");
                System.out.println("1 - Cadastrar Ginasta Artística");
                System.out.println("2 - Cadastrar Handebolista");
                System.out.println("3 - Listar Atletas");
                System.out.println("4 - Adicionar Avaliação Física");
                System.out.println("5 - Exibir Histórico de Avaliações");
                System.out.println("0 - Sair");

                System.out.print("Escolha uma opção: ");
                opcao = teclado.nextInt();
                teclado.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nomeGinasta = teclado.nextLine();
                        System.out.print("Idade: ");
                        int idadeGinasta = teclado.nextInt();
                        System.out.print("Altura: ");
                        double alturaGinasta = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.print("Aparelho Principal: ");
                        String aparelho = teclado.nextLine();
                        GinastaArtistica ginasta = new GinastaArtistica(nomeGinasta, idadeGinasta, alturaGinasta, aparelho);
                        atletas.add(ginasta);
                        System.out.println("Ginasta cadastrada com sucesso!");
                        break;

                    case 2:
                        System.out.print("Nome: ");
                        String nomeHandebol = teclado.nextLine();
                        System.out.print("Idade: ");
                        int idadeHandebol = teclado.nextInt();
                        System.out.print("Altura: ");
                        double alturaHandebol = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.print("Posição em quadra: ");
                        String posicao = teclado.nextLine();
                        Handebolista handebolista = new Handebolista(nomeHandebol, idadeHandebol, alturaHandebol, posicao);
                        atletas.add(handebolista);
                        System.out.println("Handebolista cadastrada com sucesso!");
                        break;

                    case 3:
                        if (atletas.isEmpty()) {
                            System.out.println("Nenhuma atleta cadastrada.");
                        } else {
                            for (int i = 0; i < atletas.size(); i++) {
                                System.out.println(i + " - " + atletas.get(i).getNome() + " (" + atletas.get(i).getClass().getSimpleName() +")");
                            }
                        }
                        break;

                    case 4:
                        if (atletas.isEmpty()) {
                            System.out.println("Nenhuma atleta cadastrada.");
                            break;
                        }
                        for (int i = 0; i < atletas.size(); i++) {
                            System.out.println(i + " - " + atletas.get(i).getNome());
                        }

                        System.out.print("Escolha a atleta: ");
                        int indice = teclado.nextInt();
                        teclado.nextLine();
                        if(indice < 0 || indice >= atletas.size()) {
                            System.out.println("Atleta não encontrada.");
                            break;
                        }
                        System.out.print("Data da avaliação: ");
                        String data = teclado.nextLine();
                        System.out.print("Peso: ");
                        double peso = teclado.nextDouble();
                        System.out.print("Percentual de gordura: ");
                        double gordura = teclado.nextDouble();
                        System.out.print("Massa muscular: ");
                        double massa = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.print("Observações: ");
                        String observacoes = teclado.nextLine();
                        AvaliacaoFisica avaliacao = new AvaliacaoFisica(data, peso, gordura, massa, observacoes);
                        atletas.get(indice).adicionarAvaliacao(avaliacao);
                        System.out.println("Avaliação cadastrada com sucesso!");
                        break;

                    case 5:
                        if (atletas.isEmpty()) {
                            System.out.println("Nenhuma atleta cadastrada.");
                            break;
                        }
                        for (int i = 0; i < atletas.size(); i++) {
                            System.out.println(i + " - " + atletas.get(i).getNome());
                        }
                        System.out.print("Escolha a atleta: ");
                        int atletaEscolhida = teclado.nextInt();
                        if(atletaEscolhida < 0 || atletaEscolhida >= atletas.size()) {
                            System.out.println("Atleta não encontrada.");
                            break;
                        }
                        atletas.get(atletaEscolhida).exibirHistorico();
                        break;

                    case 0:
                        System.out.println("Sistema encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            }
            catch (InputMismatchException e) {
                System.out.println("Digite apenas números nos campos numéricos.");
                teclado.nextLine();
            }
            catch (DadosAtletaInvalidosException e) {
                System.out.println(e.getMessage());

            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("Atleta não encontrada.");
            }
            finally {
                System.out.println();
            }
        }
        teclado.close();
    }
}

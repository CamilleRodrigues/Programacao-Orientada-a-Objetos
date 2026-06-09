import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
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

                System.out.print("\nEscolha uma opção: ");
                opcao = Integer.parseInt(teclado.nextLine());

                switch (opcao) {

                    case 1:
                        String nomeGinasta;
                        while (true) {
                            System.out.print("\nNome: ");
                            nomeGinasta = teclado.nextLine();

                            if (nomeGinasta.isEmpty()) {
                                System.out.println("Nome não pode ser vazio.");
                            } else if (!nomeGinasta.matches("[\\p{L} ]+")) {
                                System.out.println("Nome não pode conter números.");
                            } else {
                                break;
                            }
                        }

                        int idadeGinasta;
                        while (true) {
                            try {
                                System.out.print("Idade: ");
                                idadeGinasta = Integer.parseInt(teclado.nextLine());

                                if (idadeGinasta <= 0) {
                                    throw new DadosAtletaInvalidosException("Idade deve ser maior que zero.");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números.");
                            } catch (DadosAtletaInvalidosException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        double alturaGinasta;
                        while (true) {
                            try {
                                System.out.print("Altura: ");
                                alturaGinasta = Double.parseDouble(teclado.nextLine());

                                if (alturaGinasta <= 0) {
                                    throw new DadosAtletaInvalidosException("Altura deve ser maior que zero.");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println("Digite um número válido.");
                            } catch (DadosAtletaInvalidosException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        String aparelhoPrincipal;
                        while (true) {
                            System.out.print("Aparelho principal: ");
                            aparelhoPrincipal = teclado.nextLine();

                            if (aparelhoPrincipal.isEmpty()) {
                                System.out.println("Aparelho não pode ser vazio.");
                            } else if (!aparelhoPrincipal.matches("[\\p{L} ]+")) {
                                System.out.println("Aparelho não pode conter números.");
                            } else {
                                break;
                            }
                        }

                        atletas.add(new GinastaArtistica(nomeGinasta, idadeGinasta, alturaGinasta, aparelhoPrincipal));
                        System.out.println("Atleta cadastrada!");
                        break;

                    case 2:
                        String nomeHandebol;
                        while (true) {
                            System.out.print("\nNome: ");
                            nomeHandebol = teclado.nextLine();

                            if (nomeHandebol.isEmpty()) {
                                System.out.println("Nome não pode ser vazio.");
                            } else if (!nomeHandebol.matches("[\\p{L} ]+")) {
                                System.out.println("Nome não pode conter números.");
                            } else {
                                break;
                            }
                        }

                        int idadeHandebol;
                        while (true) {
                            try {
                                System.out.print("Idade: ");
                                idadeHandebol = Integer.parseInt(teclado.nextLine());

                                if (idadeHandebol <= 0) {
                                    throw new DadosAtletaInvalidosException("Idade deve ser maior que zero.");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números.");
                            } catch (DadosAtletaInvalidosException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        double alturaHandebol;
                        while (true) {
                            try {
                                System.out.print("Altura: ");
                                alturaHandebol = Double.parseDouble(teclado.nextLine());

                                if (alturaHandebol <= 0) {
                                    throw new DadosAtletaInvalidosException("Altura deve ser maior que zero.");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println("Digite um número válido.");
                            } catch (DadosAtletaInvalidosException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        String posicaoEmQuadra;
                        while (true) {
                            System.out.print("Posição em quadra: ");
                            posicaoEmQuadra = teclado.nextLine();

                            if (posicaoEmQuadra.isEmpty()) {
                                System.out.println("Posição não pode ser vazia.");
                            } else if (!posicaoEmQuadra.matches("[\\p{L} ]+")) {
                                System.out.println("Posição não pode conter números.");
                            } else {
                                break;
                            }
                        }
                        atletas.add(new Handebolista(nomeHandebol, idadeHandebol, alturaHandebol, posicaoEmQuadra));
                        System.out.println("Atleta cadastrada!");
                        break;

                    case 3:
                        if (atletas.isEmpty()) {
                            System.out.println("Nenhuma atleta cadastrada.");
                        } else {
                            for (Atleta atleta : atletas) {
                                System.out.println(atleta.getNome() + " (" + atleta.getModalidade() + ")");
                            }
                        }
                        break;

                    case 4:
                        if (atletas.isEmpty()) {
                            System.out.println("Nenhuma atleta cadastrada.");
                            break;
                        }

                        for (int i = 0; i < atletas.size(); i++) {
                            System.out.println(i + " - " + atletas.get(i).getNome() + " (" + atletas.get(i).getModalidade() + ")");
                        }

                        System.out.print("\nEscolha a atleta: ");
                        int indice = Integer.parseInt(teclado.nextLine());

                        if (indice < 0 || indice >= atletas.size()) {
                            System.out.println("Atleta não encontrada.");
                            break;
                        }

                        System.out.print("\nData da avaliação: ");
                        String data = teclado.nextLine();

                        double peso;
                        while (true) {
                            try {
                                System.out.print("Peso: ");
                                peso = Double.parseDouble(teclado.nextLine());

                                if (peso <= 0) {
                                    throw new DadosAtletaInvalidosException("Peso deve ser maior que zero.");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println("Digite um número válido.");
                            } catch (DadosAtletaInvalidosException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        double gordura;
                        while (true) {
                            try {
                                System.out.print("Percentual de gordura: ");
                                gordura = Double.parseDouble(teclado.nextLine());

                                if (gordura < 0 || gordura > 100) {
                                    throw new DadosAtletaInvalidosException("Percentual de gordura inválido.");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println("Digite um número válido.");
                            } catch (DadosAtletaInvalidosException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        double massa;
                        while (true) {
                            try {
                                System.out.print("Massa muscular: ");
                                massa = Double.parseDouble(teclado.nextLine());

                                if (massa <= 0) {
                                    throw new DadosAtletaInvalidosException("Massa muscular deve ser maior que zero.");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println("Digite um número válido.");
                            } catch (DadosAtletaInvalidosException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        atletas.get(indice).adicionarAvaliacao(
                                new AvaliacaoFisica(data, peso, gordura, massa)
                        );

                        System.out.println("Avaliação cadastrada com sucesso!");
                        break;

                    case 5:
                        if (atletas.isEmpty()) {
                            System.out.println("Nenhuma atleta cadastrada.");
                            break;
                        }

                        for (int i = 0; i < atletas.size(); i++) {
                            System.out.println(i + " - " + atletas.get(i).getNome() + " (" + atletas.get(i).getModalidade() + ")");
                        }

                        System.out.print("\nEscolha a atleta: ");
                        int atletaEscolhida = Integer.parseInt(teclado.nextLine());

                        if (atletaEscolhida < 0 || atletaEscolhida >= atletas.size()) {
                            System.out.println("Atleta não encontrada.");
                            break;
                        }

                        Atleta atleta = atletas.get(atletaEscolhida);

                        System.out.println("\nAtleta selecionada: " + atleta.getNome() + " (" + atleta.getModalidade() + ")\n");

                        atleta.exibirHistorico();
                        break;

                    case 0:
                        System.out.println("Sistema encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite valores válidos.");
            } catch (DadosAtletaInvalidosException e) {
                System.out.println(e.getMessage());
            }

            System.out.println();
        }

        teclado.close();
    }
}

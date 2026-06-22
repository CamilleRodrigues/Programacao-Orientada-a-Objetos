import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Profissional> profissionais = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1 - Cadastrar Atleta");
            System.out.println("2 - Cadastrar Comissão Técnica");
            System.out.println("3 - Registrar Desempenho");
            System.out.println("4 - Imprimir Folha");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");

            try {
                opcao = teclado.nextInt();
                teclado.nextLine();
                switch (opcao) {
                    case 1:
                        try {
                            System.out.print("Nome: ");
                            String nome = teclado.nextLine();
                            System.out.print("ID: ");
                            String id = teclado.nextLine();
                            System.out.print("Salário: ");
                            double salario = teclado.nextDouble();
                            teclado.nextLine();
                            profissionais.add(new Atleta(nome, id, salario));
                            System.out.println("Atleta cadastrado!");
                        } catch (InputMismatchException e) {
                            System.out.println("Digite um salário válido!");
                            teclado.nextLine();
                        } catch (ExcecaoOrcamento e) {
                            System.out.println(e.getMessage());
                        } 
                        break;

                    case 2:
                        try {
                            System.out.print("Nome: ");
                            String nome = teclado.nextLine();
                            System.out.print("ID: ");
                            String id = teclado.nextLine();
                            System.out.print("Salário: ");
                            double salario = teclado.nextDouble();
                            teclado.nextLine();
                            profissionais.add(new MembroComissaoTecnica(nome, id, salario));
                            System.out.println("Membro da comissão técnica cadastrado!");
                        } catch (InputMismatchException e) {
                            System.out.println("Digite um salário válido!");
                            teclado.nextLine();
                        } catch (ExcecaoOrcamento e) {
                            System.out.println(e.getMessage());
                        } 
                        break;

                    case 3:
                        System.out.print("Informe o ID: ");
                        String busca = teclado.nextLine();

                        Profissional encontrado = null;

                        for (Profissional p : profissionais) {
                            if (p.getIdentificacao().equals(busca)) {
                                encontrado = p;
                                break;
                            }
                        }

                        if (encontrado == null) {
                            System.out.println("ID não encontrado!");
                        } else {

                            try {
                                System.out.print("Valor do desempenho: ");
                                int valor = teclado.nextInt();
                                teclado.nextLine();

                                if (valor < 0) {
                                    System.out.println("O desempenho não pode ser negativo!");
                                } else {
                                    encontrado.registrarDesempenho(valor);
                                    System.out.println("Desempenho registrado!");
                                }

                            } catch (InputMismatchException e) {
                                System.out.println("Digite apenas números para o desempenho!");
                                teclado.nextLine();
                            }
                        }
                        break;

                    case 4:
                        double custoTotal = 0;
                        for (Profissional p : profissionais) {
                            System.out.println(p);
                            custoTotal += p.pagamentoMensal();
                        }
                        System.out.println("\nCusto Total: R$ " + custoTotal);
                        break;

                    case 0:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                teclado.nextLine();
            }
        }
        teclado.close();
    }
}

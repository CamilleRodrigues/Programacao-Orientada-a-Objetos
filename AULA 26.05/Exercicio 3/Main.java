import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<MembroAcademico> membros = new ArrayList<>();

        System.out.print("Quantos membros deseja cadastrar? ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("\n1 - Professor");
            System.out.println("2 - Aluno de Pós-Graduação");
            System.out.print("Escolha o tipo: ");
            int tipo = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Nome: ");
            String nome = teclado.nextLine();

            System.out.print("Matrícula: ");
            String matricula = teclado.nextLine();

            MembroAcademico membro;

            if (tipo == 1) {
                membro = new Professor(nome, matricula);
            } else {
                membro = new AlunoPosGraduacao(nome, matricula);
            }

            boolean tituloValido = false;

            while (!tituloValido) {
                try {
                    System.out.print("Digite o título do artigo: ");
                    String titulo = teclado.nextLine();
                    ((Pesquisador) membro).publicarArtigo(titulo);
                    tituloValido = true;
                } catch (DadosAcademicosInvalidosException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Digite um título válido.");
                }
            }

            if (membro instanceof Professor) {

                boolean notaValida = false;

                while (!notaValida) {
                    try {
                        System.out.print("Digite a nota do aluno: ");
                        double nota = teclado.nextDouble();
                        teclado.nextLine();
                        ((Professor) membro).lancarNotas(nota);
                        notaValida = true;
                    } catch (DadosAcademicosInvalidosException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Digite uma nota válida.");
                    }
                }
            }

            membros.add(membro);
        }

        for (MembroAcademico membro : membros) {
            System.out.println("\nNome: " + membro.getNome());
            System.out.println("Matrícula: " + membro.getMatricula());
            membro.mostrarFuncao();
        }

        teclado.close();
    }
}

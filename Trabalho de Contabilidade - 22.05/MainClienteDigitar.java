import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClienteDigitar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Recursos> planilha = new ArrayList<>();

        System.out.print("Quantos registros deseja cadastrar? ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("\n=== Cadastro " + (i + 1) + " ===");

            System.out.print("Código ERP: ");
            String codigo = teclado.nextLine();

            System.out.print("Conta Contábil: ");
            String conta = teclado.nextLine();

            System.out.print("Classificação: ");
            String descricao = teclado.nextLine();

            System.out.print("Saldo 2024: ");
            double saldo2024 = teclado.nextDouble();

            System.out.print("Saldo 2025: ");
            double saldo2025 = teclado.nextDouble();
            teclado.nextLine();

            planilha.add(new Recursos(
                    codigo,
                    conta,
                    descricao,
                    saldo2024,
                    saldo2025
            ));
        }

        System.out.println("\n=========== 2024 ===========");
        processarBalanco2024(planilha);

        System.out.println("\n=========== 2025 ===========");
        processarBalanco2025(planilha);

        teclado.close();
    }

    // ================= 2024 =================

    public static void processarBalanco2024(List<Recursos> lista) {

        double ativo = 0;
        double passivo = 0;
        double receita = 0;
        double imposto = 0;
        double custo = 0;
        double despesa = 0;

        for (Recursos r : lista) {

            if (r.getDescricao().equalsIgnoreCase("Ativo")) {
                ativo += r.getSaldo2024();
            }

            else if (r.getDescricao().equalsIgnoreCase("Passivo")) {
                passivo += r.getSaldo2024();
            }

            else if (r.getDescricao().equalsIgnoreCase("Receita")) {
                receita += r.getSaldo2024();
            }

            else if (r.getDescricao().equalsIgnoreCase("Imposto")) {
                imposto += r.getSaldo2024();
            }

            else if (r.getDescricao().equalsIgnoreCase("Custo")) {
                custo += r.getSaldo2024();
            }

            else if (r.getDescricao().equalsIgnoreCase("Despesa")) {
                despesa += r.getSaldo2024();
            }
        }

        double situacaoLiquida = ativo - passivo;
        double receitaLiquida = receita - imposto;
        double margemContribuicao = receitaLiquida - custo;
        double percentualMargem =
                (margemContribuicao / receitaLiquida) * 100;
        double ebitda =
                receitaLiquida - custo - despesa;

        System.out.println("Ativo Total: R$ " + ativo);
        System.out.println("Passivo Total: R$ " + passivo);
        System.out.println("Situação Líquida: R$ " + situacaoLiquida);
        System.out.println("Receita Líquida: R$ " + receitaLiquida);
        System.out.println("Margem de Contribuição: R$ " + margemContribuicao);

        System.out.printf(
                "Margem de Contribuição (%%): %.2f%%\n",
                percentualMargem
        );

        System.out.println("EBITDA: R$ " + ebitda);
    }

    // ================= 2025 =================

    public static void processarBalanco2025(List<Recursos> lista) {

        double ativo = 0;
        double passivo = 0;
        double receita = 0;
        double imposto = 0;
        double custo = 0;
        double despesa = 0;

        for (Recursos r : lista) {

            if (r.getDescricao().equalsIgnoreCase("Ativo")) {
                ativo += r.getSaldo2025();
            }

            else if (r.getDescricao().equalsIgnoreCase("Passivo")) {
                passivo += r.getSaldo2025();
            }

            else if (r.getDescricao().equalsIgnoreCase("Receita")) {
                receita += r.getSaldo2025();
            }

            else if (r.getDescricao().equalsIgnoreCase("Imposto")) {
                imposto += r.getSaldo2025();
            }

            else if (r.getDescricao().equalsIgnoreCase("Custo")) {
                custo += r.getSaldo2025();
            }

            else if (r.getDescricao().equalsIgnoreCase("Despesa")) {
                despesa += r.getSaldo2025();
            }
        }

        double situacaoLiquida = ativo - passivo;
        double receitaLiquida = receita - imposto;
        double margemContribuicao = receitaLiquida - custo;
        double percentualMargem =
                (margemContribuicao / receitaLiquida) * 100;
        double ebitda =
                receitaLiquida - custo - despesa;

        System.out.println("Ativo Total: R$ " + ativo);
        System.out.println("Passivo Total: R$ " + passivo);
        System.out.println("Situação Líquida: R$ " + situacaoLiquida);
        System.out.println("Receita Líquida: R$ " + receitaLiquida);
        System.out.println("Margem de Contribuição: R$ " + margemContribuicao);

        System.out.printf(
                "Margem de Contribuição (%%): %.2f%%\n",
                percentualMargem
        );

        System.out.println("EBITDA: R$ " + ebitda);
    }
}
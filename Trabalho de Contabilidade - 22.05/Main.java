import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Recursos> planilha = new ArrayList<>();

        planilha.add(new Recursos("101.01", "Caixa e Bancos Conta Movimento", "Ativo", 32000, 18500));
        planilha.add(new Recursos("101.02", "Aplicações Financeiras de Curto Prazo", "Ativo", 15000, 28000));
        planilha.add(new Recursos("101.03", "Clientes (Contas a Receber)", "Ativo", 48000, 74000));
        planilha.add(new Recursos("102.01", "Estoque de Componentes e Licenças", "Ativo", 55000, 42300));
        planilha.add(new Recursos("102.02", "Estoque de Softwares de Prateleira (Revenda)", "Ativo", 12000, 18000));
        planilha.add(new Recursos("103.01", "Computadores e Servidores (Imobilizado)", "Ativo", 40000, 55000));
        planilha.add(new Recursos("103.02", "Marcas e Patentes (Intangível Registado)", "Ativo", 25000, 25000));
        planilha.add(new Recursos("103.04", "Móveis e Utensílios", "Ativo", 4000, 7500));

        planilha.add(new Recursos("201.01", "Fornecedores de Infraestrutura Cloud", "Passivo", 18000, 22500));
        planilha.add(new Recursos("201.02", "Empréstimos Bancários de Curto Prazo", "Passivo", 12000, 31000));
        planilha.add(new Recursos("201.03", "Salários e Encargos a Pagar", "Passivo", 14500, 17200));
        planilha.add(new Recursos("201.04", "Impostos a pagar", "Passivo", 6000, 11000));
        planilha.add(new Recursos("202.01", "Financiamentos de Longo Prazo", "Passivo", 20000, 10000));

        planilha.add(new Recursos("301.01", "Capital Social Subscrito", "Patrimônio Líquido", 100000, 100000));

        planilha.add(new Recursos("401.01", "Receita com Venda de Softwares e Serviços", "Receita", 145000, 192000));

        planilha.add(new Recursos("501.01", "Simples Nacional", "Imposto", 15000, 27000));

        planilha.add(new Recursos("501.02", "Custo das Mercadorias e Serviços (CMV)", "Custo", 82000, 108000));

        planilha.add(new Recursos("501.03", "Despesas Administrativas Gerais", "Despesa", 37500, 46100));
        planilha.add(new Recursos("501.04", "Despesas com Energia Elétrica e Internet (Data Center)", "Despesa", 6200, 8400));
        planilha.add(new Recursos("501.05", "Despesas com Marketing Digital e Tráfego Pago", "Despesa", 4800, 7100));
        planilha.add(new Recursos("501.06", "Despesas com Aluguer da Loja Física", "Despesa", 12000, 12000));
        planilha.add(new Recursos("501.07", "Despesas com Serviços de Terceiros (Devs Freelas)", "Despesa", 8500, 14300));
        planilha.add(new Recursos("501.08", "Despesas com Manutenção de Equipamentos", "Despesa", 1800, 2600));

        System.out.println("=========== 2024 ===========");
        processarBalanco2024(planilha);

        System.out.println("\n=========== 2025 ===========");
        processarBalanco2025(planilha);
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
        double percentualMargem = (margemContribuicao / receitaLiquida) * 100;
        double ebitda = receitaLiquida - custo - despesa;
        double percentualEbitda = (ebitda / receitaLiquida) * 100;

        System.out.println("Ativo Total: R$ " + ativo);
        System.out.println("Passivo Total: R$ " + passivo);
        System.out.println("Situação Líquida: R$ " + situacaoLiquida);
        System.out.println("Receita Líquida: R$ " + receitaLiquida);
        System.out.println("Margem de Contribuição: R$ " + margemContribuicao);
        System.out.printf("Margem de Contribuição (%%): %.2f%%\n", percentualMargem);
        System.out.println("EBITDA: R$ " + ebitda);
        System.out.printf("Percentual EBITDA: %.2f%%\n", percentualEbitda);
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
        double percentualMargem = (margemContribuicao / receitaLiquida) * 100;
        double ebitda = receitaLiquida - custo - despesa;
        double percentualEbitda = (ebitda / receitaLiquida) * 100;

        System.out.println("Ativo Total: R$ " + ativo);
        System.out.println("Passivo Total: R$ " + passivo);
        System.out.println("Situação Líquida: R$ " + situacaoLiquida);
        System.out.println("Receita Líquida: R$ " + receitaLiquida);
        System.out.println("Margem de Contribuição: R$ " + margemContribuicao);
        System.out.printf("Margem de Contribuição (%%): %.2f%%\n", percentualMargem);
        System.out.println("EBITDA: R$ " + ebitda);
        System.out.printf("Percentual EBITDA: %.2f%%\n", percentualEbitda);
    }
}
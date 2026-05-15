import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Recursos> planilha = new ArrayList<>();

        planilha.add(new Recursos("1. Receita de Vendas de Mercadorias", "Receita", 320000));
        planilha.add(new Recursos("2. Receita de Prestação de Serviços", "Receita", 80000));
        planilha.add(new Recursos("3. (-) Devoluções e Abatimentos", "Imposto", -5500));
        planilha.add(new Recursos("4. (-) Simples Nacional sobre Vendas (DAS)", "Imposto", -34000));
        planilha.add(new Recursos("5. (-) Custo das Mercadorias Vendidas (CMV)", "Custo", -145000));
        planilha.add(new Recursos("6. (-) Custo dos Serviços Prestados (CSP)", "Custo", -15000));
        planilha.add(new Recursos("7. Pró-labore dos Sócios", "Despesas", -18000));
        planilha.add(new Recursos("8. Salários e Ordenados (Equipe)", "Despesas", -35000));
        planilha.add(new Recursos("9. FGTS (Depósito Mensal)", "Despesas", -2800));
        planilha.add(new Recursos("10. Aluguel e Condomínio", "Despesas", -12000));
        planilha.add(new Recursos("11. Material de Escritório e Limpeza", "Despesas", -1500));
        planilha.add(new Recursos("12. Internet e Telefonia", "Despesas", -850));
        planilha.add(new Recursos("13. Fretes e Entregas (Vendas)", "Despesas", -4200));
        planilha.add(new Recursos("14. Taxas de Cartão e Meios de Pagamento", "Despesas", -6500));
        planilha.add(new Recursos("15. Propaganda e Marketing Digital", "Despesas", -9000));
        planilha.add(new Recursos("16. Honorários Contábeis", "Despesas", -2200));
        planilha.add(new Recursos("17. Manutenção e Reparos", "Despesas", -1800));
        planilha.add(new Recursos("18. Receitas Financeiras (Rendimentos)", "Receita Financeira", 1500));
        planilha.add(new Recursos("19. Despesas Financeiras (Juros/Multas)", "Despesas", -3500));
        planilha.add(new Recursos("20. Tarifas Bancárias Mensais", "Despesas", -2500));

        processarBalanco(planilha);
    }

    public static void processarBalanco(List<Recursos> lista) {

        double totalReceita = 0;
        double totalImposto = 0;
        double totalCusto = 0;
        double totalDespesas = 0;
        double totalReceitaFinanceira = 0;

        for (Recursos r : lista) {

            if (r.getClassificacao().equalsIgnoreCase("Receita")) {
                totalReceita += r.getValor();
            }

            else if (r.getClassificacao().equalsIgnoreCase("Imposto")) {
                totalImposto += r.getValor();
            }

            else if (r.getClassificacao().equalsIgnoreCase("Custo")) {
                totalCusto += r.getValor();
            }

            else if (r.getClassificacao().equalsIgnoreCase("Despesas")) {
                totalDespesas += r.getValor();
            }

            else if (r.getClassificacao().equalsIgnoreCase("Receita Financeira")) {
                totalReceitaFinanceira += r.getValor();
            }
        }

        double receitaLiquida = totalReceita + totalImposto;
        double margemContribuicao = receitaLiquida + totalCusto;
        double ebitda = margemContribuicao + totalDespesas + totalReceitaFinanceira;
        double percentualEbitda = (ebitda / totalReceita) * 100;

        System.out.println("Total Receita: R$ " + totalReceita);

        System.out.println("\nTotal Impostos: R$ " + totalImposto);

        System.out.println("\nReceita Líquida: R$ " + receitaLiquida);

        System.out.println("\nTotal Custos: R$ " + totalCusto);

        System.out.println("\nMargem de Contribuição: R$ " + margemContribuicao);

        System.out.println("\nTotal Despesas: R$ " + totalDespesas);

        System.out.println("\nReceita Financeira: R$ " + totalReceitaFinanceira);

        System.out.println("\nEBITDA: R$ " + ebitda);

        System.out.println("\nPercentual EBITDA: " + percentualEbitda + "%");
    }
}

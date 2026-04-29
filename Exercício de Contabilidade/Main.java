import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Recursos> planilha = new ArrayList<>();

        planilha.add(new Recursos("Caixa e Bancos", "Ativo", 25000.00));
        planilha.add(new Recursos("Aplicações Financeiras", "Ativo", 15000.00));
        planilha.add(new Recursos("Clientes a Receber", "Ativo", 58000.00));
        planilha.add(new Recursos("Estoque de Produtos", "Ativo", 72000.00));
        planilha.add(new Recursos("Cartões a Receber", "Ativo", 10000.00));
        planilha.add(new Recursos("Móveis e Utensílios", "Ativo", 5000.00));
        planilha.add(new Recursos("Máquinas e Equipamentos", "Ativo", 150000.00));
        planilha.add(new Recursos("Veículos", "Ativo", 85000.00));
        planilha.add(new Recursos("Softwares e Marcas", "Ativo", 40000.00));
        planilha.add(new Recursos("Imóveis", "Ativo", -20000.00)); 
        planilha.add(new Recursos("Fornecedores Nacionais", "Passivo", 45000.00));
        planilha.add(new Recursos("Empréstimos Bancários", "Passivo", 32000.00));
        planilha.add(new Recursos("Salários e Encargos a Pagar", "Passivo", 22500.00));
        planilha.add(new Recursos("Impostos a Recolher", "Passivo", 12000.00));
        planilha.add(new Recursos("Dividendos a Pagar", "Passivo", 8500.00));
        planilha.add(new Recursos("Financiamento de Veículos", "Passivo", 60000.00));
        planilha.add(new Recursos("Empréstimos de Sócios", "Passivo", 50000.00));
        planilha.add(new Recursos("Fornecedor Internacional", "Passivo", 30000.00));
        planilha.add(new Recursos("Capital Social", "Patrimonio Liquido", 200000.00));
        planilha.add(new Recursos("Lucros Acumulados", "Patrimonio Liquido", 20000.00));

        processarBalanco(planilha);
    }

    public static void processarBalanco(List<Recursos> lista) {
        double totalAtivo = 0; 
        double totalPassivo = 0; 
        double totalPL = 0;

        for (Recursos r : lista) {
            if (r.getClassificacao().equalsIgnoreCase("Ativo")) {
                totalAtivo = totalAtivo + r.getValor();
            }    
            else if (r.getClassificacao().equalsIgnoreCase("Passivo")) {
                totalPassivo = totalPassivo + r.getValor();
            }
            else if (r.getClassificacao().equalsIgnoreCase("Patrimonio Liquido")) {
                totalPL = totalPL + r.getValor();
            }
        }

        double passivoTotal = totalPassivo + totalPL;

        System.out.println("Total Ativos: R$" + totalAtivo);
        System.out.println("\nTotal Passivos: R$" + totalPassivo);
        System.out.println("\nSituação Líquida (A - P): R$" + (totalAtivo - totalPassivo));
        System.out.println("\nPatrimônio Líquido: R$" + totalPL);
        System.out.println("\nPassivo Total (P + PL): R$" + passivoTotal);

        if (totalAtivo == passivoTotal) {
        System.out.println("\nO Balanço está equilibrado");
        } else {
        System.out.println("O Balanço está desequilibrado");
        System.out.println("Diferença encontrada: R$" + (totalAtivo - passivoTotal));
        }
    }
}

public class MembroComissaoTecnica
        extends Profissional {

    private static final double bonusVitoria = 200.0;

    public MembroComissaoTecnica(String nome, String identificacao, double salarioBase) throws ExcecaoOrcamento {
        super(nome, identificacao, salarioBase);
    }

    @Override
    public void registrarDesempenho(int vitorias) {
        double bonus = getBonusAcumulado() + (vitorias * bonusVitoria);
        setBonusAcumulado(bonus);
    }

    @Override
    public double pagamentoMensal() {
        return getSalarioBase() + getBonusAcumulado();
    }

    @Override
    public String toString() {
        return "\nComissão Técnica" + super.toString();
    }
}

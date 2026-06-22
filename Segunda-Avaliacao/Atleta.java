public class Atleta extends Profissional {
    private static final double bonusGol = 100.0;

    public Atleta(String nome, String identificacao, double salarioBase) throws ExcecaoOrcamento {
        super(nome, identificacao, salarioBase);
    }

    @Override
    public void registrarDesempenho(int gols) {
        double bonus = getBonusAcumulado() + (gols * bonusGol);
        setBonusAcumulado(bonus);
    }

    @Override
    public double pagamentoMensal() {
        return getSalarioBase() + getBonusAcumulado();
    }

    @Override
    public String toString() {
        return "\nAtleta" + super.toString();
    }
}

public abstract class Profissional {
    private String nome;
    private String identificacao;
    private double salarioBase;
    private double bonusAcumulado;

    public static final double salarioMaximo = 50000.0;

    public Profissional(String nome, String identificacao, double salarioBase) throws ExcecaoOrcamento {
        this.nome = nome;
        this.identificacao = identificacao;
        setSalarioBase(salarioBase);
        this.bonusAcumulado = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBonusAcumulado() {
        return bonusAcumulado;
    }

    public void setBonusAcumulado(double bonusAcumulado) {
        this.bonusAcumulado = bonusAcumulado;
    }

    public void setSalarioBase(double salarioBase) throws ExcecaoOrcamento {
        if (salarioBase < 0) {
            throw new ExcecaoOrcamento("Salário não pode ser negativo!");
        }
        if (salarioBase > salarioMaximo) {
            throw new ExcecaoOrcamento("Salário ultrapassa o teto do clube!");
        }
        this.salarioBase = salarioBase;
    }

    public abstract void registrarDesempenho(int valor);
    
    public abstract double pagamentoMensal();

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nID: " + identificacao + "\nSalário Base: R$ " + salarioBase + "\nBônus: R$ " + bonusAcumulado + "\nPagamento Final: R$ " + pagamentoMensal();
    }
}

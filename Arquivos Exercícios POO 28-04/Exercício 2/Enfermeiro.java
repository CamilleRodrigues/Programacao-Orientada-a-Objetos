public class Enfermeiro extends FuncionarioHospital {
    private String setor;
    private double percentualInsalubridade;

    public Enfermeiro(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        double bonusInsalubridade = getSalarioBase() * percentualInsalubridade;
        double valorHorasExtra = 0;
        if (getHorasTrabalhadasMensais() > 160) {
            valorHorasExtra = (getHorasTrabalhadasMensais() - 160) * 50.0;
        }
        return getSalarioBase() + bonusInsalubridade + valorHorasExtra;
    }

    public void setPercentualInsalubridade(double percentual) {
        if (percentual != 0.10 && percentual != 0.20 && percentual != 0.40) {
            throw new ValorInvalidoException("Percentual de insalubridade não reconhecido pelo sindicato.");
        }
        this.percentualInsalubridade = percentual;
    }
}

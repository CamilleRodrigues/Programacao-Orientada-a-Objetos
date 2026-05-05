public class Medico extends FuncionarioHospital {
    private String especialidade;
    private double valorPorPlantao;
    private int quantidadePlantoes;

    public Medico(String nome, String matricula, double salarioBase, double valorPorPlantao) {
        super(nome, matricula, salarioBase);
        this.valorPorPlantao = valorPorPlantao;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (valorPorPlantao * quantidadePlantoes); //[cite: 1]
    }

    public int getQuantidadePlantoes() { return quantidadePlantoes; }
    public void setQuantidadePlantoes(int quantidade) {
        if (quantidade < 0) throw new ValorInvalidoException("A quantidade de plantões não pode ser negativa.");
        this.quantidadePlantoes = quantidade;
    }
    // Outros getters/setters conforme necessário
}

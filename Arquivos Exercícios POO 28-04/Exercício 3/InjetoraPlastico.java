public class InjetoraPlastico extends MaquinaIndustrial {
    private double kgMateriaPrima;

    public InjetoraPlastico(String numeroSerie) { super(numeroSerie); }

    public void abastecerPlastico(double kg) {
        if (kg > 0) this.kgMateriaPrima += kg;
    }

    @Override
    public void produzirLote(int quantidade) throws Exception {
        if (!isLigada()) throw new MaquinaDesligadaException("Injetora desligada!");[cite: 1]
        double gastoMateria = quantidade * 0.2;
        if (kgMateriaPrima < gastoMateria) throw new FaltaMateriaPrimaException("Plástico insuficiente!");[cite: 1]

        this.kgMateriaPrima -= gastoMateria;
        registrarProducao(quantidade, quantidade * 0.5);
        System.out.println("Injetora " + getNumeroSerie() + " produziu lote com sucesso.");
    }
}

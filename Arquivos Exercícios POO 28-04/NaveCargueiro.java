public class NaveCargueiro extends NaveEspacial {
    private double pesoCargaAtual;
    private double capacidadeMaximaCarga;

    public NaveCargueiro(String id, double maxComb, double vel, double maxCarga) {
        super(id, maxComb, vel);
        this.capacidadeMaximaCarga = maxCarga;
    }

    @Override
    public double calcularConsumo(double distancia) {
        // Fórmula: (distancia * 0.5) + (pesoCargaAtual * 0.2) [cite: 43]
        return (distancia * 0.5) + (this.pesoCargaAtual * 0.2);
    }

    public double getPesoCargaAtual() { return pesoCargaAtual; }
    public void setPesoCargaAtual(double pesoCargaAtual) {
        if (pesoCargaAtual <= capacidadeMaximaCarga) {
            this.pesoCargaAtual = pesoCargaAtual;
        }
    }

    public double getCapacidadeMaximaCarga() { return capacidadeMaximaCarga; }
    public void setCapacidadeMaximaCarga(double capacidade) { this.capacidadeMaximaCarga = capacidade; }
}

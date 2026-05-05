public class NaveExploracao extends NaveEspacial {
    private boolean possuiSensoresAvancados;

    public NaveExploracao(String id, double maxComb, double vel, boolean sensores) {
        super(id, maxComb, vel);
        this.possuiSensoresAvancados = sensores;
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia * 0.3;
        if (possuiSensoresAvancados) {
            consumo += 50.0;
        }
        return consumo;
    }

    public boolean isPossuiSensoresAvancados() { return possuiSensoresAvancados; }
    public void setPossuiSensoresAvancados(boolean possui) { this.possuiSensoresAvancados = possui; }
}

public class NaveCombate extends NaveEspacial {
    private int numeroArmas;
    private boolean escudoAtivado;

    public NaveCombate(String id, double maxComb, double vel, int numeroArmas) {
        super(id, maxComb, vel);
        this.numeroArmas = numeroArmas;
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia * 0.8;
        if (escudoAtivado) {
            consumo *= 1.15;
        }
        return consumo;
    }

    public int getNumeroArmas() { return numeroArmas; }
    public void setNumeroArmas(int numeroArmas) { this.numeroArmas = numeroArmas; }

    public boolean isEscudoAtivado() { return escudoAtivado; }
    public void setEscudoAtivado(boolean escudoAtivado) { this.escudoAtivado = escudoAtivado; }
}

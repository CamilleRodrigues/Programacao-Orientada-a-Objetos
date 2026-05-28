public class NaveCombate extends NaveEspacial {
    private int numeroArmas; // Atributos extras
    private boolean escudoAtivado;

    public NaveCombate(String id, double maxComb, double vel, int numeroArmas, boolean escudoAtivado) {
        super(id, maxComb, vel);
        this.numeroArmas = numeroArmas;
        this.escudoAtivado = escudoAtivado;
    }

    @Override
    public double calcularConsumo(double distancia) { // Se o escudoATivado for true -> entra no IF. Se for false -> retornar a primeira multiplicação
        double consumo = distancia * 0.8; // Primeira multiplicação
        if (escudoAtivado) {
            consumo = consumo * 1.15;
        }
        return consumo;
    }

    public int getNumeroArmas() { 
        return numeroArmas; 
    }

    public void setNumeroArmas(int numeroArmas) { 
        this.numeroArmas = numeroArmas; 
    }

    public boolean isEscudoAtivado() { 
        return escudoAtivado; 
    }

    public void setEscudoAtivado(boolean escudoAtivado) { 
        this.escudoAtivado = escudoAtivado; 
    }
}

public class NaveExploracao extends NaveEspacial {
    private boolean possuiSensoresAvancados; // Atributo extra

    public NaveExploracao(String id, double maxComb, double vel, boolean sensores) {
        super(id, maxComb, vel); // "Empurrando" para a classe NaveEspacial
        this.possuiSensoresAvancados = sensores;
    }

    @Override // Classe filha deve implementar o método abstrato da classe mãe (calcularConsumo)
    public double calcularConsumo(double distancia) { // Boolean = true ou false
        double consumo = distancia * 0.3;
        if (possuiSensoresAvancados) {
            consumo = consumo + 50.0;
        }
        return consumo;
    }

    public boolean isPossuiSensoresAvancados() { 
        return possuiSensoresAvancados; 
    }

    public void setPossuiSensoresAvancados(boolean possui) { 
        this.possuiSensoresAvancados = possui; 
    }
}

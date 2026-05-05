public class NaveCargueiro extends NaveEspacial {
    private double pesoCargaAtual; // Atributos extras
    private double capacidadeMaximaCarga;

    public NaveCargueiro(String id, double maxComb, double vel, double maxCarga) { // Método construtor
        super(id, maxComb, vel); // Específicos da classe NaveEspacial (constrtor da classe mãe)
        this.capacidadeMaximaCarga = maxCarga; // Específico da classe NaveCargueiro
    }

    @Override // "Escreve por cima" do método CalcularConsumo da classe NaveEspacial
    public double calcularConsumo(double distancia) {
        return (distancia * 0.5) + (this.pesoCargaAtual * 0.2);
    }

    public double getPesoCargaAtual() { // Não possui condição
        return pesoCargaAtual; 
    }

    public void setPesoCargaAtual(double pesoCargaAtual) { // Tarefa: tratamento de erro (avisar o usuário)
        if (pesoCargaAtual <= capacidadeMaximaCarga) {
            this.pesoCargaAtual = pesoCargaAtual;
        }
    }

    public double getCapacidadeMaximaCarga() { 
        return capacidadeMaximaCarga; 
    }

    public void setCapacidadeMaximaCarga(double capacidade) { 
        this.capacidadeMaximaCarga = capacidade; 
    }
}

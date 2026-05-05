public class FaltaMateriaPrimaException extends Exception {
        public FaltaMateriaPrimaException(String msg) { super(msg); }
    }

public class EquipamentoDescalibradoException extends Exception {
        public EquipamentoDescalibradoException(String msg) { super(msg); }
    }

public class SuperaquecimentoException extends Exception {
        public SuperaquecimentoException(String msg) { super(msg); }
    }

public abstract class MaquinaIndustrial {
    private final String numeroSerie; 
    private boolean ligada;
    private int pecasProduzidasTotais;
    private double energiaConsumidaKWh;

    public MaquinaIndustrial(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.ligada = false; 
    }

    public void ligar() {
        if (this.ligada) throw new IllegalStateException("A máquina já está ligada!");
        this.ligada = true;
    }

    public void desligar() {
        if (!this.ligada) throw new IllegalStateException("A máquina já está desligada!");
        this.ligada = false;
    }

    protected void registrarProducao(int pecas, double energia) {
        this.pecasProduzidasTotais += pecas;
        this.energiaConsumidaKWh += energia;
    }

    public abstract void produzirLote(int quantidade) throws Exception;

    public String getNumeroSerie() { return numeroSerie; }
    public boolean isLigada() { return ligada; }
    public int getPecasProduzidasTotais() { return pecasProduzidasTotais; }
    public double getEnergiaConsumidaKWh() { return energiaConsumidaKWh; }
}

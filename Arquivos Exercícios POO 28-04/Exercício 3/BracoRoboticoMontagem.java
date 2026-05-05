public class BracoRoboticoMontagem extends MaquinaIndustrial {
    private double percentualCalibracao = 100.0;

    public BracoRoboticoMontagem(String numeroSerie) { 
        super(numeroSerie); 
    }

    public void recalibrar() { 
        this.percentualCalibracao = 100.0; 
    }

    @Override
    public void produzirLote(int quantidade) throws Exception {
        if (!isLigada()) throw new MaquinaDesligadaException("Robô desligado!");
        if (percentualCalibracao < 20.0) throw new EquipamentoDescalibradoException("Calibração baixa!");

        registrarProducao(quantidade, 15.0); 
        this.percentualCalibracao = Math.max(0, percentualCalibracao - (quantidade * 0.5));
        System.out.println("Robô " + getNumeroSerie() + " concluiu a montagem.");
    }
}

public class BracoRoboticoMontagem extends MaquinaIndustrial {
    private double percentualCalibracao = 100.0;

    public BracoRoboticoMontagem(String ns) { 
      super(ns); 
    }

    @Override
    public void produzirLote(int q) throws Exception {
        if (!isLigada()) throw new MaquinaDesligadaException("Robô desligado.");
        if (percentualCalibracao < 20.0) throw new EquipamentoDescalibradoException("Baixa calibração.");
        registrarProducao(q, 15.0);
        percentualCalibracao = Math.max(0, percentualCalibracao - (q * 0.5));
    }
}

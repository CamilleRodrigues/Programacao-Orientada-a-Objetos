public class PrensaHidraulica extends MaquinaIndustrial {
    private double temperaturaAtual = 25.0;

    public PrensaHidraulica(String ns) { 
      super(ns); 
    }

    @Override
    public void produzirLote(int q) throws Exception {
        if (!isLigada()) throw new MaquinaDesligadaException("Prensa desligada.");
        if (temperaturaAtual >= 90.0) throw new SuperaquecimentoException("Superaquecida.");
        registrarProducao(q, q * 2.0);
        temperaturaAtual += (q * 1.5);
    }
}

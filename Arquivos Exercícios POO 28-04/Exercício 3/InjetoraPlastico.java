public class InjetoraPlastico extends MaquinaIndustrial {
    private double kgMateriaPrima;

    public InjetoraPlastico(String ns) { 
      super(ns); 
    }

    public void abastecerPlastico(double kg) { 
      if (kg > 0) kgMateriaPrima += kg; 
    }

    @Override
    public void produzirLote(int q) throws Exception {
        if (!isLigada()) throw new MaquinaDesligadaException("Injetora desligada.");
        if (kgMateriaPrima < (q * 0.2)) throw new FaltaMateriaPrimaException("Sem plástico.");
        kgMateriaPrima -= (q * 0.2);
        registrarProducao(q, q * 0.5);
    }
}

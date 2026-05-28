import java.util.ArrayList;
import java.util.List;

public class MainFabrica {
    public static void main(String[] args) {
        List<MaquinaIndustrial> maquinas = new ArrayList<>();
        InjetoraPlastico inj = new InjetoraPlastico("INJ-01");
        inj.abastecerPlastico(10.0);
        maquinas.add(inj);
        maquinas.add(new BracoRoboticoMontagem("ROB-01"));
        maquinas.add(new PrensaHidraulica("PRE-01"));

        for (MaquinaIndustrial m : maquinas) {
            try { 
              m.produzirLote(60); 
            } catch (Exception e) { 
              System.out.println(e.getMessage()); 
            }
        }

        for (MaquinaIndustrial m : maquinas) m.ligar();

        for (int i = 1; i <= 3; i++) {
            for (MaquinaIndustrial m : maquinas) {
                try {
                    m.produzirLote(40);
                } catch (Exception e) {
                    System.out.println("ALARME: " + e.getMessage());
                }
            }
        }

        for (MaquinaIndustrial m : maquinas) {
            System.out.println(m.getNumeroSerie() + " | Peças: " + m.getPecasProduzidasTotais() + " | Energia: " + m.getEnergiaConsumidaKWh());
        }
    }
}

import java.util.ArrayList;

public class FechamentoSalario {
    private ArrayList<Profissional> profissionais;

    public FechamentoSalario() {
        profissionais = new ArrayList<>();
    }

    public void adicionarProfissional(Profissional profissional) {
        profissionais.add(profissional);
    }

    public double fecharSalario() {
        double bonusAcumulado = 0;
        for(Profissional profissional : profissionais) {
            bonusAcumulado = bonusAcumulado + profissional.pagamentoMensal(); 
        }
        return bonusAcumulado;
    }
}

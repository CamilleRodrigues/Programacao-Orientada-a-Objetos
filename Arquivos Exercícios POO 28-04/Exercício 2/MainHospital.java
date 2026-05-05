import java.util.ArrayList;
import java.util.List;

public class MainHospital {
    public static void main(String[] args) {
        List<FuncionarioHospital> folha = new ArrayList<>();

        // Instanciação dos funcionários conforme o enunciado[cite: 1]
        Medico medico = new Medico("Dr. Arnaldo", "M123", 8000.0, 500.0);
        medico.setQuantidadePlantoes(5);

        Enfermeiro enfermeiro = new Enfermeiro("Carla", "E456", 3500.0);
        enfermeiro.setPercentualInsalubridade(0.40);
        enfermeiro.setHorasTrabalhadasMensais(180);

        Administrativo admin = new Administrativo("Roberto", "A789", 2500.0, true);

        folha.add(medico);
        folha.add(enfermeiro);
        folha.add(admin);

        // Testes de Encapsulamento Propositalmente Errados[cite: 1]
        System.out.println("--- Testando Validações ---");
        try { admin.setSalarioBase(900.0); } catch (Exception e) { System.out.println("Erro Admin: " + e.getMessage()); }
        try { enfermeiro.setPercentualInsalubridade(0.99); } catch (Exception e) { System.out.println("Erro Enfermeiro: " + e.getMessage()); }
        try { medico.setHorasTrabalhadasMensais(400); } catch (Exception e) { System.out.println("Erro Médico: " + e.getMessage()); }

        // Exibição do Resumo Mensal (Polimorfismo)[cite: 1]
        System.out.println("\n--- Folha de Pagamento ---");
        for (FuncionarioHospital f : folha) {
            f.exibirResumoMensal();
        }
    }
}

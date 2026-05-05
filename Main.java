import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Criar lista [cite: 60]
        List<NaveEspacial> frota = new ArrayList<>();

        // 2. Instanciar subclasses [cite: 61]
        NaveCargueiro cargueiro = new NaveCargueiro("Titan-01", 1000.0, 50.0, 500.0);
        NaveCombate combate = new NaveCombate("X-Wing", 800.0, 150.0, 4);
        NaveExploracao exploracao = new NaveExploracao("Discovery", 500.0, 100.0, true);

        // 3. Adicionar à lista [cite: 62]
        frota.add(cargueiro);
        frota.add(combate);
        frota.add(exploracao);

        // 4. Teste Encapsulamento: abastecer acima do máximo [cite: 63]
        System.out.println("--- Teste de Encapsulamento ---");
        try {
            cargueiro.setCombustivelAtual(2000.0);
        } catch (CombustivelInvalidoException e) {
            System.out.println("Bloqueio funcionou: " + e.getMessage()); // [cite: 69]
        }

        // 5. Teste Polimorfismo: ciclo de viagens [cite: 64, 65]
        System.out.println("\n--- Simulando Viagens ---");
        for (NaveEspacial nave : frota) {
            try {
                System.out.println("Nave: " + nave.getClass().getSimpleName() + " | ID: " + nave.getIdentificador());
                nave.viajar(1000.0); // Distância de 1000 anos-luz [cite: 67]
            } catch (CombustivelInsuficienteException e) {
                System.out.println("Erro na viagem: " + e.getMessage());
            }
        }
    }
}
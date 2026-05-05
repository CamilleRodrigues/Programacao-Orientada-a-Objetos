import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NaveEspacial> frota = new ArrayList<>();

        NaveCargueiro cargueiro = new NaveCargueiro("Titan-01", 1000.0, 50.0, 500.0);
        NaveCombate combate = new NaveCombate("X-Wing", 800.0, 150.0, 4);
        NaveExploracao exploracao = new NaveExploracao("Discovery", 500.0, 100.0, true);

        frota.add(cargueiro);
        frota.add(combate);
        frota.add(exploracao);

        System.out.println("--- Teste de Encapsulamento ---");
        try {
            cargueiro.setCombustivelAtual(2000.0);
        } catch (CombustivelInvalidoException e) {
            System.out.println("Bloqueio funcionou: " + e.getMessage());
        }

        System.out.println("\n--- Simulando Viagens ---");
        for (NaveEspacial nave : frota) {
            try {
                System.out.println("Nave: " + nave.getClass().getSimpleName() + " | ID: " + nave.getIdentificador());
                nave.viajar(1000.0); 
            } catch (CombustivelInsuficienteException e) {
                System.out.println("Erro na viagem: " + e.getMessage());
            }
        }
    }
}

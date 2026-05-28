import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NaveEspacial> frota = new ArrayList<>();

        // Tarefa: trocar para o usuário digitar 
        NaveCargueiro cargueiro = new NaveCargueiro("Titan-01", 1000.0, 50.0, 500.0); // Chama o método construtor da classe NaveCargueiro
        NaveCombate combate = new NaveCombate("X-Wing", 800.0, 150.0, 4, true);
        NaveExploracao exploracao = new NaveExploracao("Discovery", 500.0, 100.0, false);

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
                nave.viajar(800.0); 
            } catch (CombustivelInsuficienteException e) {
                System.out.println("Erro na viagem: " + e.getMessage());
            }
        }
    }
}

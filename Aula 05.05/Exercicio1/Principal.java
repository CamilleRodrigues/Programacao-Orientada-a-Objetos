public class Principal {
    public static void main(String[] args) {
        // 1. Instanciação do objeto
        Voo meuVoo = new Voo("AD123", "Fernando de Noronha");

        System.out.println("Voo: " + meuVoo.getNumeroDoVoo() + " com destino a " + meuVoo.getDestino());
        System.out.println("--------------------------------------------------");

        // Lista de testes de reserva
        int[] assentosParaTestar = {10, 10, 150}; // Sucesso, Erro (Ocupado), Erro (Inválido)

        for (int assento : assentosParaTestar) {
            try {
                System.out.println("Tentando reservar o assento " + assento + "...");
                meuVoo.reservarAssento(assento);
                
            } catch (AssentoOcupadoException e) {
                // Captura erro de assento já reservado
                System.err.println("Erro: " + e.getMessage());
                
            } catch (IllegalArgumentException e) {
                // Captura erro de número fora do intervalo (1-100)
                System.err.println("Erro de Argumento: " + e.getMessage());
                
            } catch (Exception e) {
                // Captura qualquer outro erro inesperado
                System.err.println("Erro inesperado: " + e.getMessage());
            }
            System.out.println("--------------------------------------------------");
        }
    }
}

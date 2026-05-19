// Classe filha
class Smartwatch extends Dispositivo implements Conectividade, Monitoramento {

    public Smartwatch(String marca) { // Construtor
        super(marca);
    }

    @Override // Implementação do método abstrato, vem da classe Dispositivo
    public void ligar() {
        System.out.println("Smartwatch ligado com sucesso!");
    }

    @Override // Implementação da interface Conectividade
    public void conectarBluetooth() {
        System.out.println("Conectando ao Bluetooth...");
    }

    @Override // Implementação da interface Monitoramento
    public void medirBatimentos() {
        System.out.println("Medindo batimentos cardíacos no pulso...");
    }
}

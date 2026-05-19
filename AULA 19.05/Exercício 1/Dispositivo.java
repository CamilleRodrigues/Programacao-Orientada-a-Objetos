// Classe abstrata base
abstract class Dispositivo {
    protected String marca;

    // Construtor
    public Dispositivo(String marca) {
        this.marca = marca;
    }

    // Método concreto
    public void exibirMarca() {
        System.out.println("Marca do dispositivo: " + marca);
    }

    // Método abstrato
    public abstract void ligar();
}

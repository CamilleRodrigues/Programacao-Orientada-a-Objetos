package pkg;

public class Veiculo {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        System.out.println("Velocidade inicial: " + meuCarro.velocidade);
        
        meuCarro.acelerar();
        meuCarro.acelerar();
        
        System.out.println("Velocidade após acelerar: " + meuCarro.velocidade);
    }
}

class Veiculo {
    double velocidade = 0.0;
}

class Carro extends Veiculo {
    void acelerar() {
        this.velocidade += 10.0; // Soma 10 à velocidade herdada
    }
}

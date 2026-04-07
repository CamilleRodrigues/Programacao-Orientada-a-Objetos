package pkg;

public class Forma {
    public static void main(String[] args) {
        Circulo c = new Circulo("Vermelho", 10.5);

        System.out.println("Cor da forma: " + c.cor);
        System.out.println("Raio do círculo: " + c.raio);
    }
}

class Forma {
    String cor;

    Forma(String cor) {
        this.cor = cor;
    }
}

class Circulo extends Forma {
    double raio;

    Circulo(String cor, double raio) {
        super(cor); 
        this.raio = raio;
    }
}

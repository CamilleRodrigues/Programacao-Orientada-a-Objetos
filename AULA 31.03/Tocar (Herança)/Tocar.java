package pkg;

public class Tocar {
    public static void main(String[] args) {
        Violao meuViolao = new Violao();
        Piano meuPiano = new Piano();

        meuViolao.tocar();
        meuPiano.tocar();
    }
}

class Instrumento {
    void tocar() {
        System.out.println("Fazendo som...");
    }
}

class Violao extends Instrumento {
    @Override
    void tocar() {
        System.out.println("Tocando as cordas do violão!");
    }
}

class Piano extends Instrumento {
    @Override
    void tocar() {
        System.out.println("Tocando as teclas do piano!");
    }
}

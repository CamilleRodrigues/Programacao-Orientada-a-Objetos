package pkg;

public class Animal {
    void emitirSom() {
        System.out.println("Som Genérico");
    }

    public static void main(String[] args) {
        Animal generico = new Animal();
        Cachorro meuDog = new Cachorro();
        Gato meuGato = new Gato();

        generico.emitirSom();
        meuDog.emitirSom();
        meuGato.emitirSom();
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Au Au");
    }
}

class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Miau");
    }
}

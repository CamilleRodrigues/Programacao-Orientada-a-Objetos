package pkg;

public class Eletronico {
    public static void main(String[] args) {
        Smartphone meuCelular = new Smartphone();
        
        meuCelular.ligar();      
        meuCelular.conectar4G(); 
    }
}

class Eletronico {
    void ligar() {
        System.out.println("O aparelho está ligando...");
    }
}

class Smartphone extends Eletronico {
    void conectar4G() {
        System.out.println("Smartphone conectando ao 4G com sucesso!");
    }
}

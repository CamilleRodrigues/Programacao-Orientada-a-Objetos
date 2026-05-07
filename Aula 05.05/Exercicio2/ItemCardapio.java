// Um restaurante precisa de um sistema orientado a objetos para modelar seu cardápio e fechar a conta das mesas.

//1. Crie uma classe abstrata ItemCardapio com os atributos:
//nome (String)
//precoBase (double). 
//Esta classe deve possuir um método abstrato calcularPrecoFinal().

public abstract class ItemCardapio {
    private String nome;
    private double precoBase;

    public ItemCardapio(String nome, double precoBase) { // Método construtor que recebe os atributos das subclasses
        this.nome = nome;
        this.precoBase = precoBase; 
    }

    //Como os atributos estão private, as subclasses não conseguem acessá-los diretamente. Para isso utilizamos getters e setters 
    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    
    public abstract double calcularPrecoFinal(); // A classe que herdar este método abstrato terá que utilizar
}

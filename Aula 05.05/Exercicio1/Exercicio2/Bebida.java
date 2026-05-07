//2. Crie duas subclasses que herdam de ItemCardapio:
//Bebida: 
//Possui um atributo booleano isAlcoolica.  
//O método calcularPrecoFinal() deve adicionar uma taxa de 10% sobre o precoBase se a bebida for alcoólica.

public class Bebida extends ItemCardapio {
    private boolean isAlcoolica; // Atributo extra

    public Bebida(String nome, double precoBase, boolean isAlcoolica) { // Método construtor
        super(nome, precoBase); // Específicos da classe ItemCardapio (constrtor da classe mãe)
        this.isAlcoolica = isAlcoolica; // Específico da classe Bebida
    }

    @Override // "Escreve por cima" do método calcularPrecoFinal da classe ItemCardapio
    public double calcularPrecoFinal() {
        if (isAlcoolica) {
            return getPrecoBase() * 1.10; // Adiciona 10%
        }
        return getPrecoBase();
    }

    public boolean isAlcoolica() { // Não possui condição
        return isAlcoolica; 
    }

    public void setIsAlcoolica(boolean isAlcoolica) { // Tarefa: tratamento de erro (avisar o usuário)
            this.isAlcoolica = isAlcoolica;
    }
}

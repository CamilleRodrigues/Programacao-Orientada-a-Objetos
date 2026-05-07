//2. Crie duas subclasses que herdam de ItemCardapio:
//PratoPrincipal: 
//Possui um atributo adicional tempoPreparo. 
//O método calcularPrecoFinal() retorna o precoBase sem alterações.

public class PratoPrincipal extends ItemCardapio {
    private double tempoPreparo; // Atributo extra

    public PratoPrincipal(String nome, double precoBase, double tempoPreparo) { // Método construtor
        super(nome, precoBase); // Específicos da classe ItemCardapio (constrtor da classe mãe)
        this.tempoPreparo = tempoPreparo; // Específico da classe PratoPrincipal
    }

    @Override // "Escreve por cima" do método calcularPrecoFinal da classe ItemCardapio
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }

    public double getTempoPreparo() { // Não possui condição
        return tempoPreparo; 
    }

    public void setTempoPreparo(double tempoPreparo) { // Tarefa: tratamento de erro (avisar o usuário)
            this.tempoPreparo = tempoPreparo;
    }
}

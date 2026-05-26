//Exercício 02: Gestão de Frota Logística (Exceções de Regra de Negócio)

public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;
    private String localizacao;

    public Veiculo(String placa, double capacidadeCarga) { 
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public String getPlaca() { 
        return placa; 
    }

    public void setPlaca(String placa) { 
        this.placa = placa; 
    }

    public double getCapacidadeCarga() { 
        return capacidadeCarga; 
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga; 
    }

    protected void registrarManutencao() {
         System.out.println("Manutenção registrada.");
    }
    
    public abstract void iniciarViagem();

}

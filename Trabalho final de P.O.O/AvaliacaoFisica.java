//Classe responsável por armazenar os dados de uma avaliação física.
//Cada objeto representa uma avaliação realizada em uma determinada data.
//Cada avaliação será um objeto da classe AvaliacaoFisica.
//Cada objeto corresponde a uma avaliação mensal.
public class AvaliacaoFisica {
    private String dataAvaliacao;
    private double peso;
    private double percentualGordura;
    private double massaMuscular;

    //Construtor que recebe os dados da avaliação física.
    public AvaliacaoFisica(String dataAvaliacao, double peso, double percentualGordura, double massaMuscular) { 
        this.dataAvaliacao = dataAvaliacao;
        this.peso = peso;
        this.percentualGordura = percentualGordura;
        this.massaMuscular = massaMuscular; 
    }
    
    public String getDataAvaliacao() { 
        return dataAvaliacao; 
    }

    public void setDataAvaliacao(String dataAvaliacao) { 
        this.dataAvaliacao = dataAvaliacao; 
    }

    public double getPeso() { 
        return peso; 
    }

    public void setPeso(double peso) { 
        this.peso = peso; 
    }

    public double getPercentualGordura() { 
        return percentualGordura; 
    }

    public void setPercentualGordura(double percentualGordura) { 
        this.percentualGordura = percentualGordura; 
    }

    public double getMassaMuscular() { 
        return massaMuscular; 
    }

    public void setMassaMuscular(double massaMuscular) { 
        this.massaMuscular = massaMuscular; 
    }

    //Exibe na tela todos os dados da avaliação física.
    public void exibirAvaliacao() {
        System.out.println("Data da avaliação: " + dataAvaliacao);
        System.out.println("Peso da atleta: " + peso + " kg");
        System.out.println("Percentual de Gordura da atleta: " + percentualGordura + "%");
        System.out.println("Massa Muscular da atleta: " + massaMuscular + " kg");
    }
}
//Porque uma atleta realiza várias avaliações ao longo do tempo. 
//Se os atributos peso, percentual de gordura e massa muscular ficassem na classe Atleta, 
//apenas os dados mais recentes seriam armazenados. 
//Criando a classe AvaliacaoFisica e utilizando uma lista de avaliações dentro da atleta, 
//é possível manter todo o histórico e acompanhar a evolução física mês a mês.

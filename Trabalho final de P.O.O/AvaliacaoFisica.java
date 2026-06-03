//Classe responsável por armazenar os dados de uma avaliação física.
//Cada objeto representa uma avaliação realizada em uma determinada data.
//Cada avaliação será um objeto da classe AvaliacaoFisica.
//Cada objeto corresponde a uma avaliação mensal.
public class AvaliacaoFisica {
    private String dataAvaliacao;
    private double peso;
    private double percentualGordura;
    private double massaMuscular;
    private String observacoes;

    //É um construtor sem parâmetros que permite criar um objeto vazio
    //Depois os dados podem ser preenchidos usando setters.
    public AvaliacaoFisica() {

    }

    //Construtor que recebe os dados da avaliação física.
    public AvaliacaoFisica(String dataAvaliacao, double peso, double percentualGordura, double massaMuscular, String observacoes) { 
        this.dataAvaliacao = dataAvaliacao;
        this.peso = peso;
        this.percentualGordura = percentualGordura;
        this.massaMuscular = massaMuscular; 
        this.observacoes = observacoes;
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

    public String getObservacoes() { 
        return observacoes; 
    }

    public void setObservacoes(String observacoes) { 
        this.observacoes = observacoes; 
    }

    //Exibe na tela todos os dados da avaliação física.
    public void exibirAvaliacao() {
        System.out.println("Data da avaliação: " + dataAvaliacao);
        System.out.println("Peso da atleta: " + peso + " kg");
        System.out.println("Percentual de Gordura da atleta: " + percentualGordura + "%");
        System.out.println("Massa Muscular da atleta: " + massaMuscular + " kg");
        System.out.println("Observações: " + observacoes);
    }
}

//Se o professor perguntar:
//"Por que você criou a classe AvaliacaoFisica em vez de colocar peso e percentual de gordura 
//diretamente na classe Atleta?"

//Você pode responder:
//Porque uma atleta realiza várias avaliações ao longo do tempo. 
//Se os atributos peso, percentual de gordura e massa muscular ficassem na classe Atleta, 
//apenas os dados mais recentes seriam armazenados. 
//Criando a classe AvaliacaoFisica e utilizando uma lista de avaliações dentro da atleta, 
//é possível manter todo o histórico e acompanhar a evolução física mês a mês.

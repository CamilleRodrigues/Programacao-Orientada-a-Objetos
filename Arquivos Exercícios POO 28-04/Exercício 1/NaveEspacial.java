public abstract class NaveEspacial {
    private String identificador;
    private double combustivelMaximo;
    private double combustivelAtual;
    private double velocidadeBase;

    public NaveEspacial(String identificador, double combustivelMaximo, double velocidadeBase) { // Método construtor que recebe os atributos das subclasses NaveCargueiro, NaveCombate e NaveExploracao
        this.identificador = identificador;
        this.combustivelMaximo = combustivelMaximo;
        this.combustivelAtual = combustivelMaximo; 
        this.velocidadeBase = velocidadeBase;
    }

    public abstract double calcularConsumo(double distanciaEmAnosLuz); // A classe que herdar este métodoabstrato terá que utilizar

    public void viajar(double distancia) throws CombustivelInsuficienteException { // Avisa quando o valor que foi digitado está errado (mensagem de erro). Se tiver erro -> trata com a classe CombustivelInsuficienteException
        double consumo = calcularConsumo(distancia);
        if (this.combustivelAtual < consumo) {
            throw new CombustivelInsuficienteException("Combustível insuficiente para a viagem!");
        }
        this.combustivelAtual = this.combustivelAtual - consumo;
        System.out.println("A nave [" + identificador + "] viajou " + distancia + " anos-luz. Combustível restante: " + combustivelAtual);
    }

    public String getIdentificador() { 
        return identificador; 
    }

    public void setIdentificador(String identificador) { 
        this.identificador = identificador; 
    }

    public double getCombustivelMaximo() { 
        return combustivelMaximo; 
    }

    public void setCombustivelMaximo(double combustivelMaximo) { 
        this.combustivelMaximo = combustivelMaximo; 
    }

    public double getCombustivelAtual() { 
        return combustivelAtual; 
    }
    
    public void setCombustivelAtual(double valor) throws CombustivelInvalidoException { // Avisa na Main quando o valor que foi digitado está errado (mensagem de erro)
        if (valor < 0 || valor > combustivelMaximo) {
            throw new CombustivelInvalidoException("Valor de combustível inválido!");
        }
        this.combustivelAtual = valor;
    }

    public double getVelocidadeBase() { 
        return velocidadeBase; 
    }

    public void setVelocidadeBase(double velocidadeBase) { 
        this.velocidadeBase = velocidadeBase; 
    }
}

public abstract class NaveEspacial {
    private String identificador;
    private double combustivelMaximo;
    private double combustivelAtual;
    private double velocidadeBase;

    public NaveEspacial(String identificador, double combustivelMaximo, double velocidadeBase) {
        this.identificador = identificador;
        this.combustivelMaximo = combustivelMaximo;
        this.combustivelAtual = combustivelMaximo; // Regra: começa igual ao máximo [cite: 22]
        this.velocidadeBase = velocidadeBase;
    }

    public abstract double calcularConsumo(double distanciaEmAnosLuz);

    public void viajar(double distancia) throws CombustivelInsuficienteException {
        double consumo = calcularConsumo(distancia);
        if (this.combustivelAtual < consumo) {
            throw new CombustivelInsuficienteException("Combustível insuficiente para a viagem!");
        }
        this.combustivelAtual -= consumo;
        System.out.println("A nave [" + identificador + "] viajou " + distancia + " anos-luz. Combustível restante: " + combustivelAtual);
    }

    // Getters e Setters [cite: 23]
    public String getIdentificador() { return identificador; }
    public void setIdentificador(String identificador) { this.identificador = identificador; }

    public double getCombustivelMaximo() { return combustivelMaximo; }
    public void setCombustivelMaximo(double combustivelMaximo) { this.combustivelMaximo = combustivelMaximo; }

    public double getCombustivelAtual() { return combustivelAtual; }
    
    public void setCombustivelAtual(double valor) throws CombustivelInvalidoException {
        // Regra de Encapsulamento: não negativo e não superior ao máximo [cite: 24, 25]
        if (valor < 0 || valor > combustivelMaximo) {
            throw new CombustivelInvalidoException("Valor de combustível inválido!");
        }
        this.combustivelAtual = valor;
    }

    public double getVelocidadeBase() { return velocidadeBase; }
    public void setVelocidadeBase(double velocidadeBase) { this.velocidadeBase = velocidadeBase; }
}

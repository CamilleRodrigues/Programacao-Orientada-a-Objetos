//1. Crie uma classe Voo que possua os seguintes atributos privados:
//numeroDoVoo(String),
//destino (String), 
//um array de booleanos 'assentos' representando a disponibilidade de 100 lugares (onde false indica livre e true indica ocupado).

public abstract class Voo {
    private String numeroDoVoo;
    private String destino;
    private boolean[] assentos; // Array para múltiplos lugares

    //2. Implemente um método construtor que inicialize o voo com seu número, destino e todos os assentos como livres.
    public Voo(String numeroDoVoo, String destino) { 
        this.numeroDoVoo = numeroDoVoo;
        this.destino = destino;
        this.assentos = new boolean[100]; 
    }

    //4. Crie um método reservarAssento(int numeroAssento). Este método deve alterar o status do assento para ocupado.
    public void reservarAssento(int numeroAssento) throws AssentoOcupadoException {
        if (numeroAssento < 1 || numeroAssento > 100) { // Validamos se o número do assento existe (entre 1 e 100)
            tthrow new IllegalArgumentException("Número do assento deve estar entre 1 e 100."); // Subtraímos 1 para ajustar ao índice do array (0 a 99)
        } 

        int indice = numeroAssento - 1; // Ajuste para o índice do array (0 a 99)

        if (this.assentos[indice]) { // Verificar se o assento já está ocupado (true)
            throw new AssentoOcupadoException("O assento " + numeroAssento + " já está reservado.");
        }

        this.assentos[indice] = true; // Se passar pelas validações, reserva o assento
        System.out.println("Assento " + numeroAssento + " reservado com sucesso!");
    }

    //3. Utilize o encapsulamento criando métodos getters apenas para o número do voo e destino.
    public String getNumeroDoVoo() { 
        return numeroDoVoo; 
    }

    public String getDestino() { 
        return destino; 
    }

}

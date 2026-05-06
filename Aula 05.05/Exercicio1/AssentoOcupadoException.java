//5. Tratamento de Exceções: Ao tentar reservar um assento, o método deve lançar uma exceção personalizada chamada AssentoOcupadoException caso o assento já esteja reservado. 
//Se o número do assento passado for menor que 1 ou maior que 100, deve lançar uma IllegalArgumentException.
public class AssentoOcupadoException extends Exception {
    public AssentoOcupadoException(String mensagem) {
        super(mensagem);
    }
}

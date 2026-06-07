//Exceção lançada quando algum dado da atleta é inválido.
public class DadosAtletaInvalidosException extends Exception {

    //Construtor que recebe a mensagem de erro.
    public DadosAtletaInvalidosException(String mensagem) {
        super(mensagem);
    }

}

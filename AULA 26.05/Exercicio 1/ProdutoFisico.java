class ProdutoFisico extends Produto implements Avaliavel {

    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return getPreco() * 0.10;
    }

    @Override
    public void adicionarAvaliacao(int nota) throws NotaInvalidaException {
        if(nota < 1 || nota > 5) {
            throw new NotaInvalidaException("A nota é inválida!");
        } 
        System.out.println("Nota adicionada: " + nota);
    }
}

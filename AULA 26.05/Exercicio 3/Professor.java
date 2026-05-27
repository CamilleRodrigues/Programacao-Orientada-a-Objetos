class Professor extends MembroAcademico implements Pesquisador,Avaliador {
    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public void publicarArtigo(String titulo) {
        if(titulo == null || titulo.isEmpty()) {
            throw new DadosAcademicosInvalidosException("O título é inválida!");
        }
        System.out.println("O título da pesquisa é " + titulo);
    }

    @Override
    public void lancarNotas(double nota) {
        if(nota < 0 || nota > 10) {
            throw new DadosAcademicosInvalidosException("A nota digitada é inválida!");
        }
        System.out.println("A nota do aluno é " + nota);
    }

    @Override
    public void mostrarFuncao() {
        System.out.println("Professor");
    }
}

class AlunoPosGraduacao extends MembroAcademico implements Pesquisador {
    public AlunoPosGraduacao(String nome, String matricula) {
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
    public void mostrarFuncao() {
        System.out.println("Aluno de Pós-Graduação");
    }
}

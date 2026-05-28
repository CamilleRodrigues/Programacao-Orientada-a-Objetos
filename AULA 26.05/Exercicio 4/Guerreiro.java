class Guerreiro extends Personagem {
    public Guerreiro(String nome, int pontosVida) {
        super(nome, pontosVida);
    }

    @Override
    public void atacar(Personagem alvo, int dano) throws AlvoInvalidoException {
       if(alvo.getPontosVida() == 0) {
            throw new AlvoInvalidoException(alvo.getNome() + "já está fora de combate!");
        }

        if (dano > alvo.getPontosVida()) {
            dano = alvo.getPontosVida();
        }
       
        alvo.setPontosVida(alvo.getPontosVida() - dano);
        System.out.println(getNome() + " atacou " + alvo.getNome());
        System.out.println("Dano causado: " + dano);
        System.out.println("Vida restante: " + alvo.getPontosVida());
    }
}
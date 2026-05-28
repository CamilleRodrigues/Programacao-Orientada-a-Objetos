class Mago extends Personagem implements Magico {
    public Mago(String nome, int pontosVida) {
        super(nome, pontosVida);
    }

    @Override
    public void atacar(Personagem alvo, int dano) throws AlvoInvalidoException {
        if (getPontosVida() == 0) {
            throw new AlvoInvalidoException(getNome() + " já está fora de combate!");
        }

        if (alvo.getPontosVida() == 0) {
            throw new AlvoInvalidoException(alvo.getNome() + " já está fora de combate!");
        }

        if (dano > alvo.getPontosVida()) {
            dano = alvo.getPontosVida();
        }
       
        alvo.setPontosVida(alvo.getPontosVida() - dano);

        System.out.println(getNome() + " atacou " + alvo.getNome());
        System.out.println("Dano causado: " + dano);
        System.out.println("Vida restante: " + alvo.getPontosVida());
    }

    @Override
    public void lancarFeitico(Personagem alvo, int dano) throws AlvoInvalidoException {
        if (getPontosVida() == 0) {
            throw new AlvoInvalidoException(getNome() + " já está fora de combate!");
        }

        if (alvo.getPontosVida() == 0) {
            throw new AlvoInvalidoException(alvo.getNome() + " já está fora de combate!");
        }

        if (dano > alvo.getPontosVida()) {
            dano = alvo.getPontosVida();
        }

        alvo.setPontosVida(alvo.getPontosVida() - dano);

        System.out.println(getNome() + " lançou feitiço em " + alvo.getNome());
        System.out.println("Dano causado: " + dano);
        System.out.println("Vida restante: " + alvo.getPontosVida());
    }
}
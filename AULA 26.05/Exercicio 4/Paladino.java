class Paladino extends Personagem implements Curandeiro {
    public Paladino(String nome, int pontosVida) {
        super(nome, pontosVida);
    }

    @Override
    public void atacar(Personagem alvo, int dano)throws AlvoInvalidoException {
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
        System.out.println(getNome()+ " atacou " + alvo.getNome());
        System.out.println("Dano causado: " + dano);
        System.out.println("Vida restante: " + alvo.getPontosVida());
    }

    @Override
    public void curarAliado(Personagem aliado, int cura)throws AlvoInvalidoException {
        if (getPontosVida() == 0) {
            throw new AlvoInvalidoException(getNome()+ " já está fora de combate!");
        }

        if (aliado.getPontosVida() == 0) {
            throw new AlvoInvalidoException(aliado.getNome() + " já está fora de combate!");
        }

        aliado.setPontosVida(aliado.getPontosVida() + cura);
        System.out.println(getNome() + " curou " + aliado.getNome());
        System.out.println("Cura realizada: " + cura);
        System.out.println("Vida atual: " + aliado.getPontosVida());
    }
}
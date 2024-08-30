package com.batalha;

import java.util.List;

public class Jogo {

    private List<Jogador> jogadores;

    public Jogo() {
        // Instancia dois jogadores....
        jogadores = List.of(
            new Jogador("Mago"),
            new Jogador("Guerreiro")
        );
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }
}

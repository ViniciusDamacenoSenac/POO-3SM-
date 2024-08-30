package com.batalha;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable {

    @FXML Label hp1;
    @FXML Label xp1;
    @FXML Label envenenado1;
    @FXML Label hp2;
    @FXML Label xp2;
    @FXML Label envenenado2;
    @FXML Button antidoto1;
    @FXML Button antidoto2;
    
    @FXML ImageView imagem1;
    @FXML ImageView imagem2;

//     private Jogo jogo = new Jogo();
//     private Jogador j1;
//     private Jogador j2;

//     public void j1HitJ2() {
//         j1.atacar(j2);
//         updateView();
//     }

//     public void j1HealJ2() {
//         j1.curar(j2);
//         updateView();
//     }

//     public void j1AntidotoJ2() {
//         j1.darAntidoto(j2);
//         updateView();
//     }

//     public void j2HitJ1() {
//         j2.atacar(j1);
//         updateView();
//     }

//     public void j2HealJ1() {
//         j2.curar(j1);
//         updateView();
//     }

//     public void j2AntidotoJ1() {
//         j2.darAntidoto(j1);
//         updateView();
//     }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // if (jogo.getJogadores().size() != 2) {
        //     throw new RuntimeException("O jogo deve ter 2 jogadores");
        // }
        // j1 = jogo.getJogadores().get(0);
        // j2 = jogo.getJogadores().get(1);
        // updateView();
    }
    
//     private void updateView(){
//         hp1.setText(String.valueOf("HP: " + jogo.getJogadores().get(0).getHp()));
//         xp1.setText(String.valueOf("XP: " + jogo.getJogadores().get(0).getXp()));
//         envenenado1.setText(String.valueOf("Env.: " + jogo.getJogadores().get(0).isEnvenenado()));
//         hp2.setText(String.valueOf("HP: " + jogo.getJogadores().get(1).getHp()));
//         xp2.setText(String.valueOf("XP: " + jogo.getJogadores().get(1).getXp()));
//         envenenado2.setText(String.valueOf("Env.: " + jogo.getJogadores().get(1).isEnvenenado()));
        
//         antidoto1.setDisable(!j1.temAntidoto());
//         antidoto2.setDisable(!j2.temAntidoto());

//         carregarImagem(j1, imagem1);
//         carregarImagem(j2, imagem2);

//     }

//     private void carregarImagem(Jogador jogador, ImageView imagem){
//         String estado = "vivo";
//         if (jogador.isEnvenenado()) estado = "envenenado";
//         if (jogador.getHp() <= 0) estado = "morto";
//         imagem.setImage(new Image(getClass().getResourceAsStream("/com/batalha/" + jogador.getClasse() + "-" + estado + ".jpg")));
//     }
}

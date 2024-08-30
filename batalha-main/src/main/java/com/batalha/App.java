package com.batalha;

import java.io.IOException;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    private static Scene scene;
    private Jogo jogo = new Jogo();

    @Override
    public void start(Stage stage) throws IOException {
        List<Jogador> jogadores = jogo.getJogadores();
        Jogador jogador1 = jogadores.get(0);
        Jogador jogador2 = jogadores.get(1);

        // Simulação de algumas ações
        jogador1.atacar(jogador2);
        jogador2.curar(jogador1);
        jogador1.darAntidoto(jogador2);

        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setTitle("Batalha");
        stage.getIcons().add(new Image("file:src/main/resources/com/batalha/icon.png"));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}

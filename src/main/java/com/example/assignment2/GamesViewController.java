package com.example.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GamesViewController implements Initializable {

    @FXML
    private ListView<Game> gamesList;

    @FXML
    private Button seeFightersButton;

    @FXML
    private Label yearLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        yearLabel.setVisible(false);
        seeFightersButton.setVisible(false);

        try {
            gamesList.getItems().addAll(APIUtility.getGames());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        gamesList.getSelectionModel().selectedItemProperty().addListener((list, oldOne, game) -> {
            yearLabel.setVisible(true);
            yearLabel.setText("Release Year: " + game.getYearOfRelease());
            seeFightersButton.setVisible(true);
        });
    }

    @FXML
    private void showFighters(ActionEvent event) throws IOException, InterruptedException {
        SceneChanger.seeFighters(event, gamesList.getSelectionModel().getSelectedItem().getGameId());
    }
}

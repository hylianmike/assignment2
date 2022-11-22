package com.example.assignment2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;

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

        Game street = new Game(1, "Street Fighter II", 1992);
        Game gg = new Game(2, "Guilty Gear Strive", 2021);
        Game dbfz = new Game(3, "Dragon Ball FighterZ", 2018);

        gamesList.getItems().addAll(street, gg, dbfz);

        gamesList.getSelectionModel().selectedItemProperty().addListener((list, oldOne, game) -> {
            yearLabel.setVisible(true);
            yearLabel.setText("Release Year: " + game.getYearOfRelease());
            seeFightersButton.setVisible(true);
        });
    }
}

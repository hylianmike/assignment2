package com.example.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AttacksViewController implements Initializable {

    @FXML
    private ListView<Attack> attacksList;

    @FXML
    private Label inputLabel;

    @FXML
    private Button backButton;

    @FXML
    private Button backToGamesButton;

    private int gameID;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        inputLabel.setVisible(false);

        attacksList.getSelectionModel().selectedItemProperty().addListener((list, oldOne, attack) -> {
            inputLabel.setVisible(true);
            inputLabel.setText("Button Input: " + attack.getButtonInput());
        });
    }

    @FXML
    private void backToFighters(ActionEvent event) throws IOException, InterruptedException {
        SceneChanger.seeFighters(event, gameID);
    }

    @FXML
    private void backToGames(ActionEvent event) throws IOException {
        SceneChanger.backToGames(event);
    }

    public void populateTable(int gameID, int fighterID) throws IOException, InterruptedException {
        attacksList.getItems().addAll(APIUtility.getAttacks(fighterID));
        this.gameID = gameID;
    }
}

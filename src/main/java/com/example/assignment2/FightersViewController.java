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

public class FightersViewController implements Initializable {

    @FXML
    private ListView<Fighter> fightersList;

    @FXML
    private Label genderLabel;

    @FXML
    private Label playStyleLabel;

    @FXML
    private Button seeAttacksButton;

    @FXML
    private Label skillLevelLabel;

    @FXML
    private Label strengthsLabel;

    @FXML
    private Label weaknessesLabel;

    @FXML
    private Button backButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        fightersList.getSelectionModel().selectedItemProperty().addListener((list, oldOne, fighter) -> {
            genderLabel.setVisible(true);
            playStyleLabel.setVisible(true);
            strengthsLabel.setVisible(true);
            weaknessesLabel.setVisible(true);
            skillLevelLabel.setVisible(true);

            genderLabel.setText("Gender: " + fighter.getGender());
            playStyleLabel.setText("PlayStyle: " + fighter.getPlayStyle());
            strengthsLabel.setText("STRNGS: " + (fighter.getStrengths() == null ? "None" : fighter.getStrengths()));
            weaknessesLabel.setText("WKNSS: " + (fighter.getWeaknesses() == null ? "None" : fighter.getWeaknesses()));
            skillLevelLabel.setText("Skill Level: " + fighter.getSkillLevel() + "/10");

            seeAttacksButton.setVisible(true);
        });

    }

    @FXML
    private void showAttacks(ActionEvent event) throws IOException, InterruptedException {
        SceneChanger.seeAttacks(event, fightersList.getSelectionModel().getSelectedItem().getGameId(), fightersList.getSelectionModel().getSelectedItem().getFighterId());
    }

    @FXML
    private void backToGames(ActionEvent event) throws IOException {
        SceneChanger.backToGames(event);
    }

    public void populateTable(int gameID) throws IOException, InterruptedException {
        fightersList.getItems().addAll(APIUtility.getFighters(gameID));
    }
}

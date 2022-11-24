package com.example.assignment2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Fighter ryu = new Fighter(1, "Ryu", "M", "All-Rounder", 7, null, null, 1);
        Fighter sol = new Fighter(2, "Sol Badguy", "M", "All-Rounder", 5, null, null, 2);
        Fighter zangief = new Fighter(3, "Zangeif", "M", "Grappler", 2, null, null, 1);

        fightersList.getItems().addAll(ryu, sol, zangief);

        fightersList.getSelectionModel().selectedItemProperty().addListener((list, oldOne, fighter) -> {
            genderLabel.setVisible(true);
            playStyleLabel.setVisible(true);
            strengthsLabel.setVisible(true);
            weaknessesLabel.setVisible(true);
            skillLevelLabel.setVisible(true);

            genderLabel.setText("Gender: " + fighter.getGender());
            playStyleLabel.setText("PlayStyle: " + fighter.getPlayStyle());
            strengthsLabel.setText("Strengths: " + (fighter.getStrengths() == null ? "None" : fighter.getStrengths()));
            weaknessesLabel.setText("Weaknesses: " + (fighter.getWeaknesses() == null ? "None" : fighter.getWeaknesses()));
            skillLevelLabel.setText("Skill Level: " + fighter.getSkillLevel() + "/10");

            seeAttacksButton.setVisible(true);
        });

    }
}

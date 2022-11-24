package com.example.assignment2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class AttacksViewController implements Initializable {

    @FXML
    private ListView<Attack> attacksList;

    @FXML
    private Label inputLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        inputLabel.setVisible(false);

        Attack had = new Attack(1, "Hadouken", "1/4 forward", 1);
        Attack tatsu = new Attack(2, "Tatsumaki", "1/2 back", 1);
        Attack totsu = new Attack(3, "Totsugeki", "DP forward", 4);

        attacksList.getItems().addAll(had, tatsu, totsu);

        attacksList.getSelectionModel().selectedItemProperty().addListener((list, oldOne, attack) -> {
            inputLabel.setVisible(true);
            inputLabel.setText("Button Input: " + attack.getButtonInput());
        });

    }
}

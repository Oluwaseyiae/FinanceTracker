package com.financetracker.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WelcomeController {

    @FXML
    private Button getStartedButton;

    @FXML
    public void initialize() {
        getStartedButton.setOnAction(event -> {
            // Close welcome window and open the main window
            Stage currentStage = (Stage) getStartedButton.getScene().getWindow();
            currentStage.close();

            // Load the main application window (replace with your main app logic)
            // Example: MainApp.loadMainWindow();
        });
    }
}

package com.example.quaternarycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        // Temp testing button, remove before final submission -Lukas
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onClearButtonClick(){
        welcomeText.setText("");
    }

//    Upon operation button click, store first number and operand locally.
//    When equal is clicked refer back to them. Clear the local variables at the end of onEqualButtonClick() to avoid overlapping operations.
//    Could also clear local variables when onClearButtonClick() is pressed


    @FXML
    protected void onAddButtonClick(){}

    @FXML
    protected void onSubtractionButtonClick(){}

    @FXML
    protected void onAddMultiplicationClick(){}

    @FXML
    protected void onDivisionButtonClick(){}

    @FXML
    protected void onEqualButtonClick(){}

    @FXML
    protected void onSquareRootButtonClick(){}

    @FXML
    protected void onSquaredButtonClick(){}
}
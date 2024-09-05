package com.example.quaternarycalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.FileWriter;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    private String inputString = " ";

    private FileWriter writer;

    {
        try {
            writer = new FileWriter("equations.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public HelloController() throws IOException {
    }

    @FXML
    protected void onHelloButtonClick() {
        // Temp testing button, remove before final submission -Lukas
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onClearButtonClick() throws IOException {

        welcomeText.setText("");
        inputString = " ";
        writer.write("");
    }

//    Upon operation button click, store first number and operand locally.
//    When equal is clicked refer back to them. Clear the local variables at the end of onEqualButtonClick() to avoid overlapping operations.
//    Could also clear local variables when onClearButtonClick() is pressed


    @FXML
    protected void onAddButtonClick(){
        inputString = inputString + "+";
        welcomeText.setText(inputString);
        try {
            writer.write("+");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onSubtractionButtonClick(){
        inputString = inputString + "-";
        welcomeText.setText(inputString);
        try {
            writer.write("-");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onAddMultiplicationClick(){
        inputString = inputString + "*";
        welcomeText.setText(inputString);
        try {
            writer.write("*");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onDivisionButtonClick(){
        inputString = inputString + "/";
        welcomeText.setText(inputString);
        try {
            writer.write("/");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onEqualButtonClick() throws IOException {
        writer.close();
    }

    @FXML
    protected void onSquareRootButtonClick(){
        inputString = inputString + "√";
        welcomeText.setText(inputString);
        try {
            writer.write("√");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onSquaredButtonClick(){
        inputString = inputString + "²";
        welcomeText.setText(inputString);
        try {
            writer.write("²");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onThreeButtonClick(ActionEvent actionEvent) {
        inputString = inputString + "3";
        welcomeText.setText(inputString);
        try {
            writer.write("3");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onOneButtonClick(ActionEvent actionEvent) {
        inputString = inputString + "1";
        welcomeText.setText(inputString);
        try {
            writer.write("1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onTwoButtonClick(ActionEvent actionEvent) {
        inputString = inputString + "2";
        welcomeText.setText(inputString);
        try {
            writer.write("2");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onZeroButtonClick(ActionEvent actionEvent) {
        inputString = inputString + "0";
        welcomeText.setText(inputString);
        try {
            writer.write("0");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
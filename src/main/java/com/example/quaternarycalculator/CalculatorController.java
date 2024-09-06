package com.example.quaternarycalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import Logic.logic;

import java.io.FileWriter;
import java.io.IOException;

public class CalculatorController extends logic {
    @FXML
    private Label welcomeText;

    private boolean isNumQuaternary = true;

    private String inputString = " ";

    private FileWriter writer;

    {
        try {
            writer = new FileWriter("equations.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onClearButtonClick() throws IOException {

        welcomeText.setText("");
        inputString = " ";
        writer.write("");
    }

    @FXML
    protected void onNumberTypeToggleButtonClick(){
        // detect if in base 4 or base 10 then toggle to the other. Use bool in this file for easy detection
        // This is still having problems... You can swap to decimal then input a decimal, when swapping back this causes wrong conversions.

        String newText = "";
        try {
            if (isNumQuaternary) {
                newText = String.valueOf(quaternaryToDecimal(welcomeText.getText().strip()));
                welcomeText.setText(newText);
                isNumQuaternary = false;
            } else {
                newText = decimalToQuaternary(Integer.parseInt(welcomeText.getText().strip()));
                welcomeText.setText(newText);
                isNumQuaternary = true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
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

        // close writer on equal causes errors, can we change "writer.close();" to on exit somehow?
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
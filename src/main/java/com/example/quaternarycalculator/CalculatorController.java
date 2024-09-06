package com.example.quaternarycalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.FileWriter;
import java.io.IOException;

public class CalculatorController extends logic {
    @FXML
    private Label welcomeText;
    @FXML
    private Button toggleButton;

    private String num1 = "";
    private String num2 = "";
    private String operand = "";


    private boolean isNumQuaternary = true;

    protected void numberChoice(String number){
        if (operand.equals("")){
            num1 += number;
            welcomeText.setText(num1);
        }else {
            num2 += number;
            welcomeText.setText(num2);
        }
    }

    protected void vibeCheck(){
        if (isNumQuaternary == false){
            isNumQuaternary = true;
            toggleButton.setText("Quaternary");
        }
    }

    protected void checkOperand(String result) {
        if (!num2.equals("")){
            if (operand.equals("+")){
                result = add(num1, num2);
            }
            if (operand.equals("-")){
                result = subtract(num1, num2);
            }
            if (operand.equals("*")){
                result = multiply(num1, num2);
            }
            if (operand.equals("/")){
                result = divide(num1, num2);
            }
        }
        num1 = result;
        num2 = "";
        operand = "";
        welcomeText.setText(result);
    }

    @FXML
    protected void onClearButtonClick() throws IOException {
        num1 = "";
        num2 = "";
        operand = "";
        welcomeText.setText("");
    }

    @FXML
    protected void onNumberTypeToggleButtonClick(){
        // detect if in base 4 or base 10 then toggle to the other. Use bool in this file for easy detection
        // This is still having problems... You can swap to decimal then input a decimal, when swapping back this causes wrong conversions.

        String newText = "";
        try {
            if (isNumQuaternary) {
                isNumQuaternary = false;
                toggleButton.setText("Decimal");
                newText = String.valueOf(quaternaryToDecimal(welcomeText.getText().strip()));
                welcomeText.setText(newText);

            } else {
                isNumQuaternary = true;
                toggleButton.setText("Quaternary");
                newText = decimalToQuaternary(Integer.parseInt(welcomeText.getText().strip()));
                welcomeText.setText(newText);

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    protected void onAddButtonClick(){
        if (!num1.equals("")){
            welcomeText.setText("+");
            operand = "+";
        }
    }

    @FXML
    protected void onSubtractionButtonClick(){
        if (!num1.equals("")){
            welcomeText.setText("-");
            operand = "-";
        }
    }

    @FXML
    protected void onAddMultiplicationClick(){
        if (!num1.equals("")){
            welcomeText.setText("*");
            operand = "*";
        }
    }

    @FXML
    protected void onDivisionButtonClick(){
        if (!num1.equals("")){
            welcomeText.setText("/");
            operand = "/";
        }
    }

    @FXML
    protected void onEqualButtonClick(){
        checkOperand("");
    }

    @FXML
    protected void onSquareRootButtonClick(){
        vibeCheck();
        if (!num1.equals("") && num2.equals("")){
            String result = squareRoot(welcomeText.getText().strip());
            welcomeText.setText(result);
            num1 = result;
        }
    }

    @FXML
    protected void onSquaredButtonClick(){
        if (!num1.equals("") && num2.equals("")){
            String result = square(welcomeText.getText().strip());
            welcomeText.setText(result);
            num1 = result;
        }
    }

    public void onThreeButtonClick(ActionEvent actionEvent) {
        vibeCheck();
        numberChoice("3");
    }

    public void onOneButtonClick(ActionEvent actionEvent) {
        vibeCheck();
        numberChoice("1");
    }

    public void onTwoButtonClick(ActionEvent actionEvent) {
        vibeCheck();
        numberChoice("2");
    }

    public void onZeroButtonClick(ActionEvent actionEvent) {
        vibeCheck();
        numberChoice("0");
    }
}
package com.responsywnie.Kalkulator.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class mainController {

	Float data = 0f;
	int operation = -1;

	@FXML
	private GridPane ButtonAction;

	@FXML
	private ColumnConstraints buttonAction;

	@FXML
	private Button six;

	@FXML
	private Button four;

	@FXML
	private Button result;

	@FXML
	private Button too;

	@FXML
	private Button eight;

	@FXML
	private Button seven;

	@FXML
	private Button tree;

	@FXML
	private Button five;

	@FXML
	private Button div;

	@FXML
	private Button sum;

	@FXML
	private Button nine;

	@FXML
	private Button clear;

	@FXML
	private Button zero;

	@FXML
	private Button dis;

	@FXML
	private Button multi;

	@FXML
	private Button one;

	@FXML
	private TextField display;

	@FXML
	void handleButtonAction(ActionEvent event) {
		if (event.getSource() == one){
			display.setText(display.getText() + "1");
		}else if (event.getSource() == too){
			display.setText(display.getText() + "2");
		}else if (event.getSource() == tree){
			display.setText(display.getText() + "3");
		}else if (event.getSource() == four){
			display.setText(display.getText() + "4");
		}else if (event.getSource() == five){
			display.setText(display.getText() + "5");
		}else if (event.getSource() == six){
			display.setText(display.getText() + "6");
		}else if (event.getSource() == seven){
			display.setText(display.getText() + "7");
		}else if (event.getSource() == eight){
			display.setText(display.getText() + "8");
		}else if (event.getSource() == nine){
			display.setText(display.getText() + "9");
		}else if (event.getSource() == zero){
			display.setText(display.getText() + "0");
		}else if (event.getSource() == clear){
			display.setText("");
		}else if (event.getSource() == sum){
			data = Float.parseFloat(display.getText());
			operation = 1;
			display.setText("");
		}else if (event.getSource() == div){
			data = Float.parseFloat(display.getText());
			operation = 4;
			display.setText("");
		}else if (event.getSource() == multi){
			data = Float.parseFloat(display.getText());
			operation = 3;
			display.setText("");
		}else if (event.getSource() == dis){
			data = Float.parseFloat(display.getText());
			operation = 2;
			display.setText("");
		}else if (event.getSource() == result){
			Float secondOperand = Float.parseFloat(display.getText());
			switch (operation){
				case 1:
					Float ans = data + secondOperand;
					display.setText(String.valueOf(ans));
                    break;
				case 2:
					ans = data - secondOperand;
					display.setText(String.valueOf(ans));
                    break;
				case 3:
					ans = data * secondOperand;
					display.setText(String.valueOf(ans));
                    break;
				case 4:
                    ans = 0f;
					try {
						ans = data /(int) secondOperand.floatValue();
					}catch (Exception e){
						display.setText("Błąd");
					}display.setText(String.valueOf(ans));

				default:
					System.err.println("Wrong");
			}
		}
	}
	public void initialize() {
	}
}


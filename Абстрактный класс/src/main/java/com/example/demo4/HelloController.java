package com.example.demo4;

import com.example.demo4.model.Oval;
import com.example.demo4.model.OvalMinus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class HelloController {
    public Canvas canvas;
    public ColorPicker colorpicker;
    public TextField textfield;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {


        GraphicsContext gc = canvas.getGraphicsContext2D();
        OvalMinus retc = new OvalMinus(75, 400);
        retc.getXb();
        retc.getYb();
        retc.draw(gc);
        System.out.println(retc);
    }

    public void onDrawClick(MouseEvent mouseEvent) {
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();
        Color j = colorpicker.getValue();
        double z = Double.parseDouble(textfield.getText());

        GraphicsContext gc = canvas.getGraphicsContext2D();
        OvalMinus retc = new OvalMinus(z, j, x, y, 75, 400);
        retc.getXb();
        retc.getYb();
        retc.draw(gc);
    }

    public void onButtonClick(ActionEvent actionEvent) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Oval retc = new Oval(40, 80);
        retc.getXb();
        retc.getYb();
        retc.draw(gc);
        System.out.println(retc);
    }
}
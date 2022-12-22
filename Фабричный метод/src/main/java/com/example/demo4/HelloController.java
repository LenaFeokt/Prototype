package com.example.demo4;

import com.example.demo4.model.Oval;
import com.example.demo4.model.OvalMinus;
import com.example.demo4.model.Rectengular;
import com.example.demo4.model.Shapep;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController  implements Initializable {
    public Canvas canvas;
    public ColorPicker colorpicker;
    public TextField textfield;

    @FXML
    public GraphicsContext gc;
    public TextField tf_fabric;
    @FXML
    private Label welcomeText;
    @FXML
    public Shapep shp;

    public void onDrawClick(MouseEvent mouseEvent) {

        try {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();

            Color j = colorpicker.getValue();
            double z = Double.parseDouble(textfield.getText());

            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

            OvalMinus retc = new OvalMinus(z, j, x, y, 75, 400);
            retc.draw(gc);

        }catch(NumberFormatException e){
            System.out.println("Введены неверные данные");
        }
    }

    public Shapep getShape(int i){
        if (i == 1){
            return new OvalMinus(75, 400);
        }else if (i == 2){
            return new Oval(40, 80);
        }
        return new Rectengular(50.0, 20.0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       gc = canvas.getGraphicsContext2D();
    }

    public void drawShape(KeyEvent keyEvent) {
        try {
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

            if (!tf_fabric.getText().equals("")) {
                int shape_type = Integer.parseInt(tf_fabric.getText());
                shp = getShape(shape_type);
                shp.setColor(colorpicker.getValue());
                shp.draw(gc);
                System.out.println(getShape(shape_type));
            }
        }catch(NumberFormatException e){
            System.out.println("Введены неверные данные");
        }


    }
}
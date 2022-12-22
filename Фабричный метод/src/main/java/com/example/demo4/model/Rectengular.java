package com.example.demo4.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectengular extends  Shapep{
    private double len;
    private double height;

    @Override
    public void draw(GraphicsContext gr) {
        gr.setLineWidth(weight);
        gr.setStroke(color);
        gr.strokeRect(x, y, len, height);
    }

    public Rectengular(Double len, double height){
        this.len = len;
        this.height = height;
    }
}

package com.example.demo4.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shapep {
    protected double weight;
    protected Color color;
    protected double x;
    protected double y;

    public Shapep(double weight, Color color, double x, double y) {
        this.weight = weight;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Shapep() {
        this.weight = 2.0;
        this.color = Color.GREEN;
        this.x = 80;
        this.y = 100;
    }

    public abstract void draw(GraphicsContext gr);


}

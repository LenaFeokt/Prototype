package com.example.demo4.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Oval extends Shapep {

    private double xb;
    private double yb;

    public double getXb() {
        return 40;
    }

    public void setXb(double xb) {
        this.xb = xb;
    }

    public double getYb() {
        return 80;
    }

    public void setYb(double yb) {
        this.yb = yb;
    }

    public Oval(double xb, double yb) {
        super();
        this.xb = xb;
        this.yb = yb;
    }

    @Override
    public String toString() {
        return "Oval{" +
                "xb=" + xb +
                ", yb=" + yb +
                ", weight=" + weight +
                ", color=" + color +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    public Oval(double weight, Color color, double x, double y, double xb, double yb) {
        super(weight, color, x, y);
        this.xb = xb;
        this.yb = yb;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setLineWidth(weight);
        gr.setStroke(color);
        gr.strokeOval(x, y, xb, yb);

    }
}
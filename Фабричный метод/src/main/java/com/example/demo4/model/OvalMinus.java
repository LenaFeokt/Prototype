package com.example.demo4.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class OvalMinus extends Shapep {

    private double xb;
    private double yb;

    public double getXb() {
        return 75;
    }

    public void setXb(double xb) {
        this.xb = xb;
    }

    public double getYb() {
        return 400;
    }

    public void setYb(double yb) {
        this.yb = yb;
    }

    public OvalMinus(double xb, double yb) {
        super();
        this.xb = xb;
        this.yb = yb;
    }

    @Override
    public String toString() {
        return "OvalMinus{" +
                "xb=" + xb +
                ", yb=" + yb +
                ", weight=" + weight +
                ", color=" + color +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    public OvalMinus(double weight, Color color, double x, double y, double xb, double yb) {
        super(weight, color, x, y);
        this.xb = xb;
        this.yb = yb;
    }


    @Override
    public void draw(GraphicsContext gr) {
        gr.setLineWidth(weight);
        gr.setStroke(color);
        gr.strokeLine(x, y, xb, yb);
    }


}

package fr.hstaedelin.paint.models;

public class CircleModel {
    private double diameter;
    private int x;
    private int y;
    private Integer canvas;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double d_diameter) {
        this.diameter = d_diameter;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCanvas(Integer canvas){
        this.canvas = canvas; }

    public Integer getCanvas() {
        return canvas;
    }
}

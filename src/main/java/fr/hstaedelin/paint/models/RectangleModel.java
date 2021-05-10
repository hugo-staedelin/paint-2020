package fr.hstaedelin.paint.models;

public class RectangleModel {
    private int height;
    private int base;
    private int x;
    private int y;
    private Integer canvas;

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

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setBase(int base){
        this.base = base;
    }

    public int getBase(){
        return this.base;
    }

    public void setCanvas(Integer canvas){
        this.canvas = canvas; }

    public Integer getCanvas() {
        return canvas;
    }
}

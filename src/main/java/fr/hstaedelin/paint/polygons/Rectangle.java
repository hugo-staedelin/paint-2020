package fr.hstaedelin.paint.polygons;

import fr.hstaedelin.paint.models.RectangleModel;
import javax.persistence.*;

@Entity
public class Rectangle extends Form {

    private int height;
    private int base;

    public Rectangle(){}

    public Rectangle(int id, String color, int base, int height) {
        this.id = id;
        this.color = color;
        this.height = height;
        this.base = base;
    }

    public Rectangle(RectangleModel rectangle) {
            this.form = this.getClass().getSimpleName();
            this.color = "#000000";
            this.base = rectangle.getBase();
            this.height = rectangle.getHeight();
            this.x = rectangle.getX();
            this.y = rectangle.getY();
    }

    public void setBase(int base){
        this.base = base;
    }

    public void setHeight(int hauteur){
        this.height = hauteur;
    }

    @Override
    public double getPerimeter(){
        return (this.height +this.base)*2;
    }

    @Override
    public double getArea(){
        return (this.height *this.base);
    }

    public int getHeight(){
        return this.height;
    }

    public int getBase(){
        return this.base;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                ", id=" + id +
                "height=" + height +
                ", base=" + base +
                ", color=" + color +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

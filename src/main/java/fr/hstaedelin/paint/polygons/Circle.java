package fr.hstaedelin.paint.polygons;

import fr.hstaedelin.paint.models.CircleModel;
import javax.persistence.*;

@Entity
public class Circle extends Form {
    private double diameter;

    public Circle(){}

    public Circle(int id, String color, double diameter){
        this.id = id;
        this.color = color;
        this.diameter = diameter;
    }

    public Circle(CircleModel circle){
        this.form = this.getClass().getSimpleName();
        this.color = "#000000";
        this.diameter = circle.getDiameter();
        this.x = circle.getX();
        this.y = circle.getY();
    }

    public void setDiameter(int diametre){
        this.diameter = diametre;
    }

    @Override
    public double getPerimeter(){
        return (Math.PI*this.diameter);
    }

    @Override
    public double getArea(){
        double radius = getDiameter()/2;
        return (Math.PI*radius*radius);
    }

    public double getDiameter() {
        return this.diameter;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                ", id=" + id +
                ", color=" + color +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

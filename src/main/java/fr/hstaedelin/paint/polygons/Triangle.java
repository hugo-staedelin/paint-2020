package fr.hstaedelin.paint.polygons;

import fr.hstaedelin.paint.models.TriangleModel;
import javax.persistence.*;

@Entity
public class Triangle extends Form {

    private final int side = 3;
    private int type;
    private int height;
    private int base;

    public Triangle(){}

    public Triangle(int id, String color, int type, int base, int height){
        this.id = id;
        this.color = color;
        this.type = type;
        this.base = base;
        this.height = height;
        defineType();
    }

    public Triangle(int id, String color, int type, int lenght){
        this.id = id;
        this.color = color;
        this.type = type;
        this.base = lenght;
    }

    public Triangle(TriangleModel triangle) {
            this.form = this.getClass().getSimpleName();
            this.color = "#000000";
            this.base = triangle.getBase();
            this.height = triangle.getHeight();
            this.x = triangle.getX();
            this.y = triangle.getY();
    }

    public String defineType(){
        double perimeter=0;
        switch (this.type) {
            case 1 :
                perimeter = Math.sqrt(Math.pow(height,2)+Math.pow(base,2));
                return "Rectangle";
            case 2 :
                perimeter = height + height + base; // Isocèle = 2 côté égaux
                return "Isocèle" ;
            case 3 :
                    if(!isEquilateral()) return "";
                    else {
                        perimeter = height + base + height; // Equilatéral = 3 côté égaux
                        return "Equilatéral";
                    }
            default :
                return "Quelconque";
        }
    }

    public void setBase(int base){
        this.base = base;
    }

    public void setHeight(int hauteur){
        this.height = hauteur;
    }

    @Override
    public double getPerimeter(){
        return side * base;
    }

    public double getArea() {
        return (this.base *this.height)/2;
    }

    public int getBase() {
        return this.base;
    }

    public int getHeight() {
        return this.height;
    }

    public final boolean isEquilateral(){
        return side *this.height == side *this.base;
    }

    public void setType(int type){
        this.type = type;
        defineType();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                ",id=" + id +
                " type=" + type +
                ", height=" + height +
                ", base=" + base +
                ", color=" + color +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

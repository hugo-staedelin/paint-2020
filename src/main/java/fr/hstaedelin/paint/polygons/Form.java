package fr.hstaedelin.paint.polygons;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected int x;
    protected int y;
    protected String color;
    protected String form;

    public void setColor(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getColor() {
        return this.color;
    }

    public Integer getId(){
        return this.id;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public abstract String toString();
}

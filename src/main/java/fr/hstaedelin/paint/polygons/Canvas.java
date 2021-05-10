package fr.hstaedelin.paint.polygons;

import fr.hstaedelin.paint.models.CanvasModel;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Canvas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

//    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//    private List<Form> forms = new ArrayList<>();

    public Canvas(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Canvas{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                '}';
    }
}

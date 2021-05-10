package fr.hstaedelin.paint;
import fr.hstaedelin.paint.polygons.Form;
import java.util.List;

public class Sum {
    private Sum(){}

    public static double getSumPerimeters(List<Form>forms){
        double temp = 0.0;
        for (Form form : forms) {
            temp += form.getPerimeter();
        }
        return temp;
    }

    public static double getSumAreas(List<Form>forms){
        double temp = 0.0;
        for (Form form : forms) {
            temp += form.getArea();
        }
        return temp;
    }
}

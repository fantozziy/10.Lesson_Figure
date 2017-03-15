/**
 * Created by pst on 15.02.2017.
 */
public abstract class Figure {

    double dim1;
    double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    Figure() {
    }

    abstract double getArea(); //Получить площадь фигуры
}

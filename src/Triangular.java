/**
 * Created by pst on 15.02.2017.
 */
public class Triangular extends Figure {

    Triangular(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double getArea() {
        return (dim1 * dim2) / 2;
    }
}

public class Main {

    public static void main(String[] args) {
        // Нахождение площади фигур (прямоугольник, прямоугольный треугольник)

        Rectangular rect1 = new Rectangular(4, 7);
        Triangular trang1 = new Triangular(4, 6);

        System.out.println("Площадь прям-ка: " + rect1.getArea());
        System.out.println("Площадь треу-ка: " + trang1.getArea());
    }
}

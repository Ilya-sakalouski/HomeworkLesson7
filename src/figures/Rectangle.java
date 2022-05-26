package src.figures;

public class Rectangle implements Figure {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double perimeterS() {
        return 2 * (a + b);
    }

    @Override
    public void square() {
        double s = a * b;
        System.out.println(s);
    }

    @Override
    public void perimeter() {
        System.out.println(perimeterS());
    }

}

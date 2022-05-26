package src.figures;

public class Circle implements Figure {
    final double PI = 3.14;
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double perimeterS() {
        return 2 * PI * r;
    }

    @Override
    public void square() {
        double s = PI * (Math.pow(r, 2));
        System.out.println(s);
    }

    @Override
    public void perimeter() {
        System.out.println(perimeterS());
    }

}

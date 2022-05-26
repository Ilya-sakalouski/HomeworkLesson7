package src.figures;

public class Triangle implements Figure {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeterS() {
        return (a + b + c);
    }

    @Override
    public void square() {
        double ppr = perimeterS() / 2;                    // Полупериметр
        double s = Math.sqrt(ppr * (ppr - a) * (ppr - b) * (ppr - c));
        System.out.println(s);
    }

    @Override
    public void perimeter() {
        System.out.println(perimeterS());
    }

}

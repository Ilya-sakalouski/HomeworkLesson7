package src.runner;

import src.figures.Circle;
import src.figures.Figure;
import src.figures.Rectangle;
import src.figures.Triangle;
import src.task2.Boss;
import src.task2.Manager;
import src.task2.Position;
import src.task2.Worker;

public class Homework7Runner {
    public static void main(String[] args) {

        // TODO Task 1:
        System.out.println("TASK 1");

        Triangle triangle1 = new Triangle(2, 3, 5);
        Triangle triangle2 = new Triangle(6, 7, 9);
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(4, 12);
        Circle circle1 = new Circle(4);

        Figure.figures[0] = triangle1;
        Figure.figures[1] = triangle2;
        Figure.figures[2] = rectangle1;
        Figure.figures[3] = rectangle2;
        Figure.figures[4] = circle1;

        for (int i = 0; i < 5; i++) {
            System.out.println("PERIMETER " + (i + 1));
            Figure.figures[i].perimeter();
        }

        double sumOfPerimeters = triangle1.perimeterS() + triangle2.perimeterS() +
                rectangle1.perimeterS() + rectangle2.perimeterS() + circle1.perimeterS();

        System.out.println("\nSum of perimeters = " + sumOfPerimeters + "\n");

        // TODO Task 2:
        System.out.println("TASK 2");

        Boss boss1 = new Boss();
        boss1.yourPosition();
        Worker worker1 = new Worker();
        worker1.yourPosition();
        Manager manager1 = new Manager();
        manager1.yourPosition();

        //System.out.println(Position.positionName);
        //System.out.println(Position.positionName2);

        System.out.println("\n");
    }
}

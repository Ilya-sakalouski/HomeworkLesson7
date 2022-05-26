package src.task2;

public class Manager implements Position {
    String positionName = "Manager";

    @Override
    public void yourPosition() {
        System.out.println(positionName);
    }
}

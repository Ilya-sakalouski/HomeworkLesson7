package src.task2;

public class Worker implements Position {
    String positionName = "Worker";

    @Override
    public void yourPosition() {
        System.out.println(positionName);
    }
}

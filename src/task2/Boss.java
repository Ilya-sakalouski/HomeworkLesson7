package src.task2;

public class Boss implements Position {
    String positionName = "Boss";

    @Override
    public void yourPosition() {
        System.out.println(positionName);
    }
}

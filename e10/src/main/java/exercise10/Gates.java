package exercise10;

public class Gates implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("gates close");
    }
}
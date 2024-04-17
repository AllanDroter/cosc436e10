package exercise10;

public class Main {
    public static void main(String[] args) {
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();
    }
}

// output
// gates close
// lights up
// Surveillance - by the numbers:
// establish a perimeter
// train the cameras
// identify the source
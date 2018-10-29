package SensorsAndMeasurements;

public class ConstantSensor implements Sensor{
    private int measureValue;

    public ConstantSensor(int measureValue) {
        this.measureValue = measureValue;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.measureValue;
    }
}

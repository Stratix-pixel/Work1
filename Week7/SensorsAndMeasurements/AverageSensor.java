package SensorsAndMeasurements;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors = new ArrayList<>();

    public void addSensor(Sensor s){
        sensors.add(s);
    }

    public int count(){
        return sensors.size();
    }

    @Override
    public boolean isOn() {
        for(Sensor s : sensors){
            if(!s.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor s : sensors){
            if(!s.isOn()){
                s.on();
            }
        }
    }
    @Override
    public void off() {
        for(Sensor s : sensors){
            s.off();
            if(!s.isOn()){
                return;
            }
        }
    }

    @Override
    public int measure() {
        if(!this.isOn() || sensors.isEmpty()){
            throw new IllegalStateException();
        }
        int sum = 0;
        for(Sensor s : sensors){
            sum += s.measure();
        }
        return sum/sensors.size();
    }

}

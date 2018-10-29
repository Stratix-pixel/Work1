package SensorsAndMeasurements;

import java.util.Random;

public class Thermometer implements Sensor{
    private boolean state;


    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void on() {
        state = true;
    }

    @Override
    public void off() {
        state = false;
    }

    @Override
    public int measure(){
        if(!state){
            throw new IllegalStateException();
        }
        Random r = new Random();
        int pow = r.nextInt(3);
        int measurement=(int)java.lang.Math.pow(-1, pow) * r.nextInt(31);
        return measurement;
    }

}

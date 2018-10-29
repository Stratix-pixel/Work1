package SensorsAndMeasurements;

import org.junit.Assert;
import org.junit.Test;

public class AverageSensorTest {

    public Sensor buildConstantSensor(int value){
        return new ConstantSensor(value);
    }

    public Thermometer buildThermometer(boolean isOn){
        Thermometer t1 = new Thermometer();
        if(isOn){
            t1.on();
        }
        return t1;
    }

    public AverageSensor buildAverageSensor(Sensor... sensors){
        AverageSensor as1 = new AverageSensor();
        for(Sensor s : sensors){
            as1.addSensor(as1);
        }
        return as1;
    }
    @Test
    public void whenAdding2SensorsTheAverageSensorHas2Sensors(){
        AverageSensor as1 = buildAverageSensor(buildThermometer(false),
                buildConstantSensor(3));

        Assert.assertEquals(0, as1.count());
    }
    @Test
    public void whenHavingAllSensorsOnEverySensorIsOn(){
        AverageSensor as1 = buildAverageSensor(buildThermometer(true),
                buildConstantSensor(3));

        boolean isOn = as1.isOn();

        Assert.assertEquals(true, isOn);
    }
    @Test
    public void whenHavingOneSensorOffTheAverageSensorIsOff(){
        AverageSensor as1 = buildAverageSensor(buildThermometer(false),
                buildConstantSensor(3));

        boolean isOn = as1.isOn();

        Assert.assertEquals(false, isOn);
    }

}

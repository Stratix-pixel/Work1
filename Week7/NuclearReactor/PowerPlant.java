package NuclearReactor;

public class PowerPlant {
    private int desiredOutput;

    public PowerPlant(int desiredOutput) {
        this.desiredOutput = desiredOutput;
    }

    public void soundTheAlarm(){
        System.out.println("Attention! The power plant is not operating at normal values! ");
    }

    public int getDesiredOutput() {
        return desiredOutput;
    }

}

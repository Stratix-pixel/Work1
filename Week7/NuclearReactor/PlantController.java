package NuclearReactor;

public class PlantController {
    PowerPlant powerplant;
    Reactor reactor;

    public PlantController(PowerPlant powerplant, Reactor reactor) {
        this.powerplant = powerplant;
        this.reactor = reactor;
    }

    public boolean reactorOutputDifference(Reactor reactor, PowerPlant powerplant) {
        int difference = reactor.getThroughputLevel() - powerplant.getDesiredOutput();
        if (difference > 10) {
            System.out.println("The difference between the reactor throughput and the desired output is larger than 10! this needs adjustment");
            return true;
        } else {
            return false;
        }
    }

    public void reactorOutputDifferenceAdjust(Reactor reactor, PowerPlant powerPlant) {
        int difference = reactor.getThroughputLevel() - powerplant.getDesiredOutput();
        if (difference > 10) {
            reactor.increaseThroughput();
        }
    }

    public void shutdownReactor(Reactor reactor){
        while (reactor.getThroughputLevel() > 0){
            reactor.decreaseThroughput();
        }
    }

    public void runSystem(){

    }


}

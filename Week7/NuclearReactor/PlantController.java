package NuclearReactor;

public class PlantController {
    private PowerPlant powerplant;
    private Reactor reactor;

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

    public void reactorAdjust(Reactor reactor, PowerPlant powerPlant) {
        int difference = reactor.getThroughputLevel() - powerplant.getDesiredOutput();
        if (difference > 10) reactor.increaseThroughput();
    }

    public void shutdownReactor(Reactor reactor) {
        while (reactor.getThroughputLevel() > 0) {
            reactor.decreaseThroughput();
        }
    }

    public void runSystem(Reactor reactor, PowerPlant powerplant) {
        while (reactor.getThroughputLevel() > 0) {
            if (reactorOutputDifference(reactor, powerplant)) reactorAdjust(reactor, powerplant);
            if (reactor.getReactorStatus()) powerplant.soundTheAlarm(); shutdownReactor(reactor);
        }
    }

}

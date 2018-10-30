package NuclearReactor;

public class PlantController {
    private PowerPlant powerplant;
    private Reactor reactor;

    public PlantController(PowerPlant powerplant, Reactor reactor) {
        this.powerplant = powerplant;
        this.reactor = reactor;
    }

    public boolean reactorOutputDifference() {
        int difference = reactor.getThroughputLevel() - powerplant.getDesiredOutput();
        if (difference > 10) {
            System.out.println("The difference between the reactor throughput and the desired output is larger than 10! this needs adjustment");
            return true;
        } else {
            return false;
        }
    }

    public void reactorAdjust() throws Exception{
        int difference = reactor.getThroughputLevel() - powerplant.getDesiredOutput();
        if (difference > 10) reactor.increaseThroughput();
    }

    public void shutdownReactor() {
        while (reactor.getThroughputLevel() > 0) {
            reactor.decreaseThroughput();
        }
    }

    public void runSystem() throws Exception{
        while (reactor.getThroughputLevel() > 0) {
            if (reactorOutputDifference()) {
                try {
                    reactorAdjust();
                } catch (IllegalStateException i) {
                    powerplant.soundTheAlarm();
                    shutdownReactor();
                    System.out.println("Reactor is shutting down");
                    break;
                }
            } else {
                System.out.println("Reactor is stabilizing, Throughput level is : " + reactor.getThroughputLevel());
            }
        }
    }

}

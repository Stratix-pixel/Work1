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
        while(difference > 10 || difference <-10 )
        {
            if (difference < -10) reactor.increaseThroughput();
            if (difference > 10) reactor.decreaseThroughput();
        }
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
                }
            } else {
                System.out.println("Reactor is stabilizing, Throughput level is : " + reactor.getThroughputLevel());
            }
        }
        while (reactorOutputDifference()) ;
        if (!reactorOutputDifference())
            System.out.println("\n\n  The value the reactor has been stabilised is : " + reactor.throughputLevel);
    }

}

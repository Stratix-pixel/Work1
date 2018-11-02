package NuclearReactor;

import java.util.Random;

public class Reactor {
    private int throughputLevel;

    public Reactor(int throughputLevel) {
        this.throughputLevel = throughputLevel;
    }

    public int getThroughputLevel() {
        return throughputLevel;
    }

    public void setThroughputLevel(int throughputLevel) {
        this.throughputLevel = throughputLevel;
    }

    public void increaseThroughput() throws Exception{
        Random r = new Random();
        int low = 1;
        int high = 100;
        this.throughputLevel += r.nextInt(high - low) + low;
        if (getReactorStatus()){
            throw new IllegalStateException();
        }
    }

    public void decreaseThroughput() {
        Random r = new Random();
        int low = 1;
        int high = 100;
        do {
            this.throughputLevel -= r.nextInt(high - low) + low;
        } while (this.throughputLevel > 0);
    }

    public boolean getReactorStatus() {
        if (this.throughputLevel >= 100 || this.throughputLevel <= 1) {
            return true;
        } else {
            return false;
        }
    }



}

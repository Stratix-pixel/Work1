package ManageDigitalLibrary;

public class Video{
    private double duration;
    private boolean fullHD;


    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isFullHD() {
        return fullHD;
    }

    public void setFullHD(boolean fullHD) {
        this.fullHD = fullHD;
    }

    public Video(double duration, boolean fullHD) {
        this.duration = duration;
        this.fullHD = fullHD;
    }



}

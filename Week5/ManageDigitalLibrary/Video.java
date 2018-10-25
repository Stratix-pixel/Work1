package ManageDigitalLibrary;

public class Video extends MediaEntity{
    private Integer duration;
    private Boolean fullHD;

    public Video(String type, String title, Integer noOfDownloads, Integer duration, Boolean fullHD) {
        super(type, title, noOfDownloads);
        this.duration = duration;
        this.fullHD = fullHD;
    }


    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Boolean getFullHD() {
        return fullHD;
    }

    public void setFullHD(Boolean fullHD) {
        this.fullHD = fullHD;
    }

    @Override
    public String toString() {
        return "Video{" + "type=" + this.getType() +
                ", title=" + this.getTitle() +
                ", noOfDownloads="+ this.getNoOfDownloads()+
                ", duration=" + duration +
                ", fullHD=" + fullHD +
                '}';
    }
}

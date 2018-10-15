package ManageDigitalLibrary;

public class MediaEntity extends Library{

    private String type;
    private String title;
    private int noOfDownloads;

    public MediaEntity(String type, String title, int noOfDownloads) {
        this.type = type;
        this.title = title;
        this.noOfDownloads = noOfDownloads;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNoOfDownloads() {
        return noOfDownloads;
    }

    public void setNoOfDownloads(int noOfDownloads) {
        this.noOfDownloads = noOfDownloads;
    }


}

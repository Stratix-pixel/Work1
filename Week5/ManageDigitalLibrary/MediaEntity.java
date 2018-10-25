package ManageDigitalLibrary;

public class MediaEntity implements Comparable{
    private String type;
    private String title;
    private Integer noOfDownloads;

    public MediaEntity(String type, String title, Integer noOfDownloads){
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

    public Integer getNoOfDownloads() {
        return noOfDownloads;
    }

    public void setNoOfDownloads(Integer noOfDownloads) {
        this.noOfDownloads = noOfDownloads;
    }

    @Override
    public int compareTo(Object o) {
        MediaEntity mE = (MediaEntity) o;
        if(this.noOfDownloads < mE.getNoOfDownloads()){
            return 1;
        }else if(this.noOfDownloads > mE.getNoOfDownloads()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "MediaEntity{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", noOfDownloads=" + noOfDownloads +
                '}';
    }
}


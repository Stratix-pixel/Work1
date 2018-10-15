package ManageDigitalLibrary;

import java.util.List;

public class Library {
    private List<MediaEntity> top20;
    private List<MediaEntity>archive;

    public Library(List<MediaEntity> top20, List<MediaEntity> archive) {
        this.top20 = top20;
        this.archive = archive;
    }
    public List<MediaEntity> getTop20() {
        return top20;
    }

    public void setTop20(List<MediaEntity> top20) {
        this.top20 = top20;
    }

    public List<MediaEntity> getArchive() {
        return archive;
    }

    public void setArchive(List<MediaEntity> archive) {
        this.archive = archive;
    }




}

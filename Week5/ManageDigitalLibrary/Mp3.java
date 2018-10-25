package ManageDigitalLibrary;

import java.util.Objects;

public class Mp3 extends MediaEntity{
    private String singer;
    private String album;

    public Mp3(String type, String title, Integer noOfDownloads, String singer, String album) {
        super(type, title, noOfDownloads);
        this.singer = singer;
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mp3)) return false;
        if (!super.equals(o)) return false;
        Mp3 mp3 = (Mp3) o;
        return Objects.equals(singer, mp3.singer) &&
                Objects.equals(album, mp3.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), singer, album);
    }

    @Override
    public String toString() {
        return "Mp3{" + "type=" + this.getType() +
                ", title=" + this.getTitle() +
                ", noOfDownloads="+ this.getNoOfDownloads()+
                ", singer='" + singer + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}


package ManageDigitalLibrary;

public class Mp3{
      private String singer;
      private String album;

    public Mp3(String singer, String album) {
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



}

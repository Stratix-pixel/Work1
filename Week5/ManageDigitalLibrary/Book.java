package ManageDigitalLibrary;

public class Book {
    private String author;
    private String publishingHouse;

    public Book(String author, String publishingHouse) {
        this.author = author;
        this.publishingHouse = publishingHouse;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

}

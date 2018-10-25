package ManageDigitalLibrary;

public class Book extends MediaEntity{
    private String author;
    private String publishingHouse;

    public Book(String type, String title, Integer noOfDownloads, String author, String publishingHouse) {
        super(type, title, noOfDownloads);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, publishingHouse);
    }

    @Override
    public String toString() {
        return "Book{" + "type=" + this.getType() +
                ", title=" + this.getTitle() +
                ", noOfDownloads="+ this.getNoOfDownloads()+
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}

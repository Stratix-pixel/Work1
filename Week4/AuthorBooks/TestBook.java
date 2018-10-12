package AuthorBooks;

public class TestBook {
    public static void main(String[] args) {

        Author author = new Author("Creanga Whatever", "creangawhat@yahoo.com", 'm');
        Book book = new Book("Amintiri din Copilarie", author , 22.14, 24);

        Author author2 = new Author("Whatever Whatever", "whatever@yahoo.com", 'f');
        Book book2 = new Book("Whatever Book", author , 21.11, 14);

        System.out.println(book.toString());

        book.setPrice(35.05);
        book.setQty(50);
        book2.setPrice(88.21);
        book2.setQty(33);
        System.out.println("The name of the book is: " + book.getName());
        System.out.println("The price of the book is: " + book.getPrice());
        System.out.println("The quantity of the book is: " + book.getQty());
        System.out.println("The name of the author is: " + book.getAuthor().getName());
        System.out.println("The email of the author is: " + book.getAuthor().getEmail());
        System.out.println("The gender of the author is: " + book.getAuthor().getGender() + "\n");

        System.out.println("The name of the book is: " + book2.getName());
        System.out.println("The price of the book is: " + book2.getPrice());
        System.out.println("The quantity of the book is: " + book2.getQty());
        System.out.println("The name of the author is: " + book2.getAuthor().getName());
        System.out.println("The email of the author is: " + book2.getAuthor().getEmail());
        System.out.println("The gender of the author is: " + book2.getAuthor().getGender());

    }
}

package AuthorBooks;

public class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author("Eminescu Whatever", "Eminescuwhat@yahoo.com", 'm');

        Author author2 = new Author("Eminescu Whatever2", "Eminescuwhat2@yahoo.com", 'f');

        System.out.println(author.toString());

        author.setEmail("teck@gmail.com");
        author2.setEmail("teck2@gmail.com");

        System.out.println("Name is:" + author.getName());
        System.out.println("Email is: " + author.getEmail());
        System.out.println("Gender is: " + author.getGender() + "\n");

        System.out.println("Name is:" + author2.getName());
        System.out.println("Email is: " + author2.getEmail());
        System.out.println("Gender is: " + author2.getGender());
    }
}

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Pushkin", "duel", 'M');
        System.out.println(author);
        author.setEmail("Pushkin@gmail.com");
        System.out.println(author);
    }
}
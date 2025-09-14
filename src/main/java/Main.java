public class Main {
    public static void main(String[] args) {
        BookDirector director = new BookDirector();
        IBookBuilder builder = new Book.NovelBookBuilder();
        Book book = director.construct(builder);

        System.out.println(book);
    }
}